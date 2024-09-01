package com.ram.patterns.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DaoApplicationTests {

	@Autowired
	EmployeeDAO DAO;
	
	@Test
	void testCreateEmp() {
		Employee Employee = new Employee();
		Employee.setId(2);
		Employee.setName("fkdkfm");
		DAO.create(Employee );
	}

}
