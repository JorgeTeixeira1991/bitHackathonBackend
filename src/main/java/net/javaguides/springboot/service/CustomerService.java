package net.javaguides.springboot.service;

import net.javaguides.springboot.model.Customer;

import java.util.List;
public interface CustomerService {
    Customer saveCustomer(Customer employee);
    List<Customer> getAllCustomers();
    Customer getCustomerById(long id);
    Customer updateCustomer(Customer employee, long id);
    void deleteCustomer(long id);
}
