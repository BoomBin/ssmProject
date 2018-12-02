package com.bin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.bin.pojo.Items;
import com.bin.service.ItemService;

@Controller
public class ItemsController {
	
	@Autowired
	private ItemService itemsService;
	@RequestMapping("/list")
	public ModelAndView itemList() {
		
		//调用业务层
		List<Items> list = itemsService.list();
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("itemList",list);
		modelAndView.setViewName("itemList");
		return modelAndView;
	}
}
