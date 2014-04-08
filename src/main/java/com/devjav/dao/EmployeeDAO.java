/*
 * devjav [http://devjav.com]
 * Copyright (C) 2014-2014 Pham Thai Thinh
 * Contact:phamthaithinh@gmail.com
 * 
 */
package com.devjav.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.devjav.domain.Employee;

/**
 * 
 * @author Pham Thai Thinh
 * 
 */
@Component
public class EmployeeDAO {
	@Autowired
	private SessionFactory sf;

	public Employee insert(Employee emp) {
		Session session = sf.getCurrentSession();
		session.save(emp);
		return emp;
	}

	public Employee update(Employee emp) {
		Session session = sf.getCurrentSession();
		session.update(emp);
		return emp;
	}

	@SuppressWarnings("unchecked")
	public List<Employee> listAll() {
		Session session = sf.getCurrentSession();
		return session.createCriteria(Employee.class).list();
	}

}
