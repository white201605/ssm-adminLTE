package com.informationstorm.admin.service.impl;

import com.informationstorm.admin.dao.FrontUserMapper;
import com.informationstorm.admin.model.FrontUser;
import com.informationstorm.admin.model.FrontUserExample;
import com.informationstorm.admin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by JoinHan on 2017/3/17.
 */
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private FrontUserMapper frontUserMapper;

	public boolean addFrontUser(FrontUser frontUser) {
		if (frontUserMapper.insert(frontUser) > 0) {
			return true;
		}
		return false;
	}

	public boolean updateFrontUser(FrontUser frontUser) {
		if (frontUserMapper.updateByPrimaryKey(frontUser) > 0) {
			return true;
		}
		return false;
	}
}
