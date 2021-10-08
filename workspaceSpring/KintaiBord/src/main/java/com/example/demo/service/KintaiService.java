package com.example.demo.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.KintaiBean;
import com.example.demo.entity.kintai;
import com.example.demo.repository.KintaiRepository;

@Service
public class KintaiService {

	Calendar calendar = Calendar.getInstance();
	/** 現在の年を取得
	 *
	 * @return
	 */
	public int year() {

		int year = calendar.get(Calendar.YEAR);

		return year;
	}


	/** 現在の月を取得
	 *
	 *
	 * @return
	 */
	public int month() {

		int month = calendar.get(Calendar.MONTH) + 1;

		return month;
	}

	/** 検索された日数計算
	 *
	 *
	 * @param year
	 * @param month
	 * @return
	 */
	public List<String> daySaerch(int year, int month) {
		ArrayList<String> days = new ArrayList<String>();

		calendar.set(year, month - 1, 1);
		int endday = calendar.getActualMaximum(Calendar.DATE);

		for(int i = 1 ; i <= endday ; i++) {
			String day = String.format("%04d", year) + "/" + String.format("%02d", month) + "/" + String.format("%02d", i);
			days.add(day);
		}

		return days;
	}

	/** 表示用リスト
	 * @return
	 *
	 *
	 */
	public List<KintaiBean> kintaiday(List<kintai> kintailist , List<String> days) {

		List<KintaiBean> displayKintai = new ArrayList<KintaiBean>();

		for(int i = 0 ;i < days.size() ; i++) {
			KintaiBean display = new KintaiBean();
			for(int j = 0 ;j < kintailist.size(); j++) {
				if(days.get(i).equals(kintailist.get(j).getYmd())) {

					display.setDisplayYmd(days.get(i));
					display.setDisplaySt(kintailist.get(j).getWork_st());
					display.setDisplayEd(kintailist.get(j).getWork_ed());
					display.setDisplayRt(kintailist.get(j).getWork_rt());
					break;
				}
				else {
					display.setDisplayYmd(days.get(i));
					display.setDisplaySt("");
					display.setDisplayEd("");
					display.setDisplayRt("");
				}
			}
			displayKintai.add(i,display);
		}
		return displayKintai;
	}

	 @Autowired
	    KintaiRepository kintaiRepository;
	    public List<kintai> searchAll() {
	        // ユーザーTBLの内容を全検索
	        return kintaiRepository.findAll();
	    }
}
