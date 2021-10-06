package com.example.demo.controller;
import java.util.Calendar;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;



@RestController
public class KintaiController {



	/**
	 * ユーザー情報一覧画面を表示
	 * @param model Model
	 * @return ユーザー情報一覧画面のHTML
	 */
	@RequestMapping(value = "/kintai", method = RequestMethod.GET)
	 public ModelAndView entryPage(ModelAndView mav) {

		Calendar calendar = Calendar.getInstance();
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH) + 1;

        mav.setViewName("kintai_table");
        mav.addObject("year", year);
        mav.addObject("month", month);

        return mav;

    }

	/**
	 * ユーザー情報一覧画面を表示
	 * @param model Model
	 * @return ユーザー情報一覧画面のHTML
	 */
	@RequestMapping(value = "/kintai/aaa", method=RequestMethod.POST)
	 public ModelAndView kintai2(@RequestParam("year")Integer year, @RequestParam("month")Integer month, ModelAndView mav) {

        mav.setViewName("kintai_table");
        mav.addObject("year", year);
        mav.addObject("month", month);

        return mav;

    }
}

