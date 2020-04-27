package com.wj.crud.test;


import java.util.List;
import java.util.UUID;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wj.crud.bean.Employee;
import com.wj.crud.bean.Department;

import com.wj.crud.dao.DepartmentMapper;
import com.wj.crud.dao.EmployeeMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class MapperTest {
	
	@Autowired
	DepartmentMapper departmentMapper;
	@Autowired
	EmployeeMapper employeeMapper;
	@Autowired
	SqlSession sqlSession;
	@Test
	public void test() {
//		ApplicationContext ioc=  new ClassPathXmlApplicationContext("applicationContext.xml");
//		DepartmentMapper departmentMapper = ioc.getBean(DepartmentMapper.class);
		System.out.println(departmentMapper);
		
//		departmentMapper.insertSelective(new Department(null,"开发部"));
//		departmentMapper.insertSelective(new Department(null,"测试部"));
		
//		employeeMapper.insertSelective(new Employee(null, "Jerry", "M", "Jerry@atguigu.com", 5));
		
//		EmployeeMapper employeeMapper=sqlSession.getMapper(EmployeeMapper.class);
//		
//		for(int i=0;i<1000;i++)
//		{
//			String uid=UUID.randomUUID().toString().substring(0,5)+i;
//			employeeMapper.insertSelective(new Employee(null,uid,"M",uid+"@atguigu.com",5));
//			
//		}
//		System.out.println("批量插入完成");
		List<Employee> emps=employeeMapper.selectByExampleWithDept(null);
		for (Employee emp : emps) {
		System.out.println(emp.getEmpId());
		}
	}
}

