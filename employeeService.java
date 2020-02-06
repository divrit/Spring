package com.divrit.jdbctemplate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.divrit.jdbctemplate.dao.employeeDao;
import com.divrit.jdbctemplate.model.employee;

@Service
public class employeeService {
	@Autowired
	employeeDao emp;
public List<employee> getall(){
	return emp.getemp();
	
	
	
}
}
