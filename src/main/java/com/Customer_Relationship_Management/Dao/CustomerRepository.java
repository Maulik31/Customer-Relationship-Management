package com.Customer_Relationship_Management.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Customer_Relationship_Management.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
