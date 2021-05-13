package edu.wctc.wholesale.service;

import edu.wctc.wholesale.ResourceNotFoundException;
import edu.wctc.wholesale.entity.Customer;
import edu.wctc.wholesale.repos.CustomerRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerService  {
    List<Customer> getAllCustomers();
    Customer getCustomer(int id) throws ResourceNotFoundException;
}

