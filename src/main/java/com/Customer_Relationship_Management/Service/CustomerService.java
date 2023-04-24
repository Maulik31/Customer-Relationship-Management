package com.Customer_Relationship_Management.Service;

import java.util.List;
import java.util.Optional;

import com.Customer_Relationship_Management.Entity.Customer;

public interface CustomerService {

	public List<Customer> getAllEmployee();

	public Customer getEmployeeById(int theId);

	public void addEmployee(Customer employee);

	public void deleteEmployee(int employeeId);
}
