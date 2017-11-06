package com.informationstorm.admin.service;

import com.informationstorm.admin.model.FrontUser;

/**
 * Created by JoinHan on 2017/3/17.
 */
public interface UserService {

	/*
	 * 创建前台用户
	 */
	public boolean addFrontUser(FrontUser frontUser);

	/*
	 * 修改前台用户
	 */
	public boolean updateFrontUser(FrontUser frontUser);

}
