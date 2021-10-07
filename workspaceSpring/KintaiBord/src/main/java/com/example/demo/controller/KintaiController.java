package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.kintai;
import com.example.demo.service.KintaiService;



@RestController
public class KintaiController {

	 @Autowired
	  KintaiService kintaiService;


	/**
	 * ユーザー情報一覧画面を表示
	 * @param model Model
	 * @return ユーザー情報一覧画面のHTML
	 */
	@RequestMapping(value = "/kintai", method = RequestMethod.GET)
	 public ModelAndView entryPage(ModelAndView mav) {

		int year =  kintaiService.year();
		int month = kintaiService.month();

		List<String> days = kintaiService.daySaerch(year,month);
		List<kintai> kintailist = kintaiService.searchAll();
		kintaiService.kintaiday(kintailist , days);
        mav.setViewName("kintai_table");
        mav.addObject("year", year);
        mav.addObject("month", month);
        mav.addObject("days", days);
        mav.addObject("kintailist", kintailist);

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

