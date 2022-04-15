package tnsif.c2tc.b09.Service;

import tnsif.c2tc.b09.entity.Employee;

public interface EmployeeService {

	public void addEmployee(Employee employee);

	public Employee getEmployee(int id);

	public int deleteEmployee(int id);

	public Employee updateEmployee(Employee employee);

}
