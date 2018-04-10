package com.vxss.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * @author qinghu
 *
 */
@Controller
@RequestMapping("/page")
public class PageAccessController {

	@RequestMapping("/test")
	@ResponseBody
	public String test() {
		return "success";
	}
	
}
