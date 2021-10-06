package com.example.demo.service;

import java.util.Calendar;

import org.springframework.stereotype.Service;

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
}
