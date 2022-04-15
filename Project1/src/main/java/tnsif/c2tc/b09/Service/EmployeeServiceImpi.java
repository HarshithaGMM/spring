package tnsif.c2tc.b09.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tnsif.c2tc.b09.Repo.EmployeeRepo;
import tnsif.c2tc.b09.entity.Employee;
@Service
public class EmployeeServiceImpi implements EmployeeService{
	@Autowired
	EmployeeRepo er;

	@Override
	public void addEmployee(Employee employee) {
		er.save(employee);
		
	}

	@Override
	public Employee getEmployee(int id) {
		Employee em=er.findById(id).get();
		return em;
	}

	@Override
	public int deleteEmployee(int id) {
		Employee e=er.findById(id).get();
		er.delete(e);
		return 1;
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		Employee em=er.save(employee);
		return em;
	}

}
