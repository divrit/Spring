package com.divrit.jdbctemplate.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.divrit.jdbctemplate.model.employee;

@Repository("employeedao")
public class employeeDao {
	JdbcTemplate jdbctmp;

	public void setTemplate(JdbcTemplate template) {
		this.jdbctmp = template;
	}

	public List<employee> getemp() {

		List<employee> emps = jdbctmp.query("select*from student", new RowMapper() {

			public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
				employee e = new employee();
				e.setId((rs.getInt("ID")));
				e.setName(rs.getString("Name"));
				return e;
			}
		});
		return emps;

	}
}
