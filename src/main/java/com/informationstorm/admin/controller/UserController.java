package com.informationstorm.admin.controller;

import com.informationstorm.admin.model.SysUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by JoinHan on 2017/3/20.
 */
@Controller
public class UserController {
	/*
	 * 后台系统用户登录
	 */
	@RequestMapping(value = { "/sysUser/login" })
	@ResponseBody
	public String syslogin(SysUser sysuser) {
		// 验证账户名 密码
		return null;
	}
}
