package model.dao.impl;
import model.Department;
import model.Employee;
import model.dao.EmployeeDao;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeDAOImpl implements EmployeeDao{

	//logging function
	private static final Logger LOG=LoggerFactory.getLogger(EmployeeDAOImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public void saveEmployee(Employee emp) {
		// TODO Auto-generated method stub
	
	}

	@Override
	public Employee getEmployee(int empId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateEmployee(Employee employee, int empId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Department getEmployeeDept(int empId, int deptId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveEmployeeDept(int empId, Department dept) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEmployeeDept(int empId, Department dept, int deptId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteEmployeeDept(int empId, int deptId) {
		// TODO Auto-generated method stub
		
	}

}
