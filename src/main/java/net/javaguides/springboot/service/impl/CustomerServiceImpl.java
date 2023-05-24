package net.javaguides.springboot.service.impl;

import net.javaguides.springboot.exception.ResourceNotFoundException;
import net.javaguides.springboot.model.Customer;
import net.javaguides.springboot.repository.CustomerDAO;
import net.javaguides.springboot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements CustomerService {

    private List<Customer> customerList;
    private CustomerDAO customerDAO;

    public CustomerServiceImpl(CustomerDAO customerDAO) {
        super();
        this.customerDAO = customerDAO;
    }

    @Autowired
    public CustomerDAO getCustomerDAO() {
        return customerDAO;
    }
    @Autowired
    public void setCustomerDAO(CustomerDAO customerDAO) {
        this.customerDAO = customerDAO;
    }

    @Autowired
    public List<Customer> getCustomerList() {
        return customerList;
    }
    @Autowired
    public void setCustomerList(List<Customer> customerList) {
        this.customerList = customerList;
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerDAO.save(customer);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerDAO.findAll();
    }

    @Override
    public Customer getCustomerById(long id) {
        return customerDAO.findById(id).orElseThrow(() -> new ResourceNotFoundException("Customer", "Id", id));
    }

    @Override
    public Customer updateCustomer(Customer customer, long id) {

        Customer c = customerDAO.findById(id).orElseThrow(()-> new ResourceNotFoundException("Customer", "Id",id));

        c.setFirstName(customer.getFirstName());
        c.setLastName(customer.getLastName());
        c.setEmail(customer.getEmail());
        c.setPhone(customer.getPhone());
        c.setAddress(customer.getAddress());

        return customerDAO.save(c);
    }

    @Override
    public void deleteCustomer(long id) {
        Customer c = customerDAO.findById(id).orElseThrow(() -> new ResourceNotFoundException("Customer", "Id", id));
        customerDAO.delete(c);
    }
}
