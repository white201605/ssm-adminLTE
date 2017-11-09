package com.informationstorm.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.informationstorm.admin.model.SysUser;

/**
 * Created by JoinHan on 2017/3/20.
 */
@Controller
@RequestMapping("/admin")
public class UserController {
	
	@RequestMapping("/index")
	public String syslogin(SysUser sysuser) {
		
		return "admin/login";
	}
}
