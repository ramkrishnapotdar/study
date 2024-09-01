package com.ram.patterns.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public void create(Employee E) {
		String sql = "insert into EMP.EMPLOYEE values(?,?)";
		jdbcTemplate.update(sql, E.getId(),E.getName());
	}

}
