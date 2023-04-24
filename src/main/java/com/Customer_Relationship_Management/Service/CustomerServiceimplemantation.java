package com.Customer_Relationship_Management.Service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Customer_Relationship_Management.Dao.CustomerRepository;
import com.Customer_Relationship_Management.Entity.Customer;
@Service
@org.springframework.transaction.annotation.Transactional
public class CustomerServiceimplemantation implements CustomerService {

	@Autowired
	private CustomerRepository employeeRepository;
	@Override
	public List<Customer> getAllEmployee() {
			return employeeRepository.findAll();
	}

	@Override
	public Customer getEmployeeById(int theId) {
	
		Optional<Customer> result = employeeRepository.findById(theId);
		Customer employee = null;
		if(result.isPresent())
		{
			employee = result.get();
			
		}
		else {
			System.out.println("EMPLOYEE NOT FOUND");
		}
		return employee;
	}

	@Override
	public void addEmployee(Customer employee) {
		employeeRepository.save(employee);
		
	}

	@Override
	public void deleteEmployee(int employeeId) {
		employeeRepository.deleteById(employeeId);
		
	}

}
