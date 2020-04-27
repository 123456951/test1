package com.wj.crud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wj.crud.bean.Department;
import com.wj.crud.dao.DepartmentMapper;

@Service
public class DepartmentService {
	@Autowired
	DepartmentMapper departmentMapper;

	public List<Department> GetDepts() {
		// TODO Auto-generated method stub
		return departmentMapper.selectByExample(null);
	}

}
