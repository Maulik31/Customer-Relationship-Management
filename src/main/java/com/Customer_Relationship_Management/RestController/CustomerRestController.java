package com.Customer_Relationship_Management.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Customer_Relationship_Management.Entity.Customer;
import com.Customer_Relationship_Management.Service.CustomerService;

@RestController
@RequestMapping("/api")
public class CustomerRestController {
	
	@Autowired
	private CustomerService employeeService;
	@GetMapping("/employee")
	public List<Customer> getAllEmployees()
	{
		List<Customer> employees = employeeService.getAllEmployee();

		return employees;
	}
	
	@GetMapping("/employee/{theId}")
	public Customer getEmployeeById(@PathVariable int theId)
	{
		Customer employee = employeeService.getEmployeeById(theId);
		
		return employee;
	}
	
	@PostMapping("/employee")
	public Customer addEmployee(@RequestBody Customer employee)
	{
		employee.setId(0);
		employeeService.addEmployee(employee);
		return employee;
	}
	
	@PutMapping("/employee")
	public Customer updateEmployee(@RequestBody Customer employee)
	{		
		employeeService.addEmployee(employee);
		return employee;
	}
	
	@DeleteMapping("/employee/{employeeId}")
	public String deleteEmployee(@PathVariable int employeeId )
	{
		employeeService.deleteEmployee(employeeId);
		return "DELETED SUCCESFULLY";
	}
}
