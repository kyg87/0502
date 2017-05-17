package com.newlecture.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class RootController {
	
	@RequestMapping("/index")	
	public String index(){
		
		//return "/WEB-INF/views/index.jsp";
		return "index";
	}
	
	@RequestMapping(value="/upload", method=RequestMethod.POST, produces="text/plain;charset=UTF-8")
	@ResponseBody
	public String upload(@RequestParam(value = "file") MultipartFile file){
		
		System.out.println("a");
					
		return "1";
	}
	
	@RequestMapping(value="/category", produces="text/plain;charset=UTF-8")	
	@ResponseBody
	public String category(
			@RequestParam(value = "id") String id
			
			){
		
		String json = "";
	      
	      switch(id){
	      
	      case "1":
	         
	         json = "[{\"id\":\"1\",\"title\":\"������\"},{\"id\":\"2\", \"title\":\"�����\"}]";
	         
	         break;
	         
	      case "2":
	         
	         json = "[{\"id\":\"1\",\"title\":\"�����\"},{\"id\":\"2\", \"title\":\"���ν�\"}]";
	         
	         break;
	         
	      case "3":
	         
	         json = "[{\"id\":\"1\",\"title\":\"������\"},{\"id\":\"2\", \"title\":\"���ʽ�\"}]";
	         
	         break;
	      
	      }
		

		return json;
	}
	
	
}
