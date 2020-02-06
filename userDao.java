package com.cts.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cts.model.User;

@Repository
public class userDao {
	List<User> list =null;
	public List<User>getall(){
		
		list=new ArrayList<User>();
		list.add(new User(1,"div"));
		list.add(new User(2,"divrit"));
		list.add(new User(3,"div saini"));
		
		return list;
		
		
	}

}
