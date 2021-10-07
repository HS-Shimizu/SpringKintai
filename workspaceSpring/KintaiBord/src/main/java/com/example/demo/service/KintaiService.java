package com.example.demo.service;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.KintaiRepository;

@Service
public class KintaiService {

	/** 現在の年を取得
	 *
	 * @return
	 */

	public int year() {

		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);

		return year;
	}


	/** 現在の月を取得
	 *
	 *
	 * @return
	 */

	public int month() {

		Calendar calendar = Calendar.getInstance();
		int month = calendar.get(Calendar.MONTH) + 1;

		return month;
	}

	 @Autowired
	    KintaiRepository kintaiRepository;
	    public List<User> searchAll() {
	        // ユーザーTBLの内容を全検索
	        return kintaiRepository.findAll();
	    }
}
