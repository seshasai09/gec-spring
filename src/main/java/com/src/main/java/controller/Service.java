package com.src.main.java.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dao.ServiceDao;

@RestController
public class Service {
	@Autowired
	ServiceDao serviceDao;
	
	@RequestMapping ("/alive")
	public String alive(){
		return "service is alive";
	}
	
	@PostMapping
	public String postAlive(@RequestBody String req){
		return "post service is alive, length of input string is: "+req.length();
	}
	
	@PostMapping("/addName")
	public String addName(@RequestBody String name){
		//ServiceDao serviceDao = new ServiceDao();
		if(serviceDao.AddEntry(name))
			return "name added";
		return "name was not added";
	}

}
