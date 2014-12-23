/**
 * 
 */
package model.dao;

import model.Department;
import model.Employee;

/**
 * @author WEIQIANG LIANG
 *
 */
public interface EmployeeDao {
	void saveEmployee(Employee emp);

	Employee getEmployee(int empId);

	void updateEmployee(Employee employee, int empId);

	void deleteEmployee(int empId);

	Department getEmployeeDept(int empId, int deptId);

	void saveEmployeeDept(int empId, Department dept);

	void updateEmployeeDept(int empId, Department dept, int deptId);

	void deleteEmployeeDept(int empId, int deptId);
}
