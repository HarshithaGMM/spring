package tnsif.c2tc.b09.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import tnsif.c2tc.b09.Service.EmployeeService;
import tnsif.c2tc.b09.entity.Employee;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService service;
	@RequestMapping("/addEmployee")
	public void addEmployee(@RequestBody Employee employee)
	{
		service.addEmployee(employee);
	}
	@GetMapping("/getEmployee/{id}")
	public Employee getEmployee(@PathVariable int id)
	{
		return service.getEmployee(id);
	}
	
	@PutMapping("/updateEmployee")
	public Employee updatEmployee(@RequestBody Employee employee)
	{
		return service.updateEmployee(employee);
	}
	@DeleteMapping("/deleteEmployee/{id}")
	public int deleteEmployee(@PathVariable int id)
	{
		return service.deleteEmployee(id);
	}

}
