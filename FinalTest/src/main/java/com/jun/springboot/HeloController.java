package com.jun.springboot;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jun.springboot.repositories.MyDataMongoRepository;

@Controller
public class HeloController {

	@Autowired
	MyDataMongoRepository repository;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index(ModelAndView mav) {

		mav.setViewName("index");
		mav.addObject("title", "회원 정보");
		mav.addObject("msg", "회원정보");

		Iterable<MyDataMongo> list = repository.findAll();
		mav.addObject("datalist", list);
		
		return mav;
	}
}
