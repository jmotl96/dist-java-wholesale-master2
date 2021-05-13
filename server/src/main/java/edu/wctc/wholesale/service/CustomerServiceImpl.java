package edu.wctc.wholesale.service;

import edu.wctc.wholesale.ResourceNotFoundException;
import edu.wctc.wholesale.entity.Customer;
import edu.wctc.wholesale.repos.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;



@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomers() {
        List<Customer> list = new ArrayList<>();
        customerRepository.findAll().forEach(list::add);
        return list;
    }

    @Override
    public Customer getCustomer(int id) throws ResourceNotFoundException {
        return customerRepository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Event", "id", id));
    }

}