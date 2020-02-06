package com.cts.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.dao.userDao;
import com.cts.model.User;

@Service
public class userService {
	@Autowired
	userDao userdao;
	public List<User> getall(){
		return userdao.getall();
			}

}
