package net.javaguides.springboot.controller;

import net.javaguides.springboot.model.Customer;
import net.javaguides.springboot.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/customer")
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        super();
        this.customerService = customerService;
    }

    // build create employee REST API
    @PostMapping()
    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer){
        return new ResponseEntity<>(customerService.saveCustomer(customer), HttpStatus.CREATED);
    }

    // build get all employees REST API
    @GetMapping
    public List<Customer> getAllCustomers(){
        return customerService.getAllCustomers();
    }

    // build get employee by id REST API
    // http://localhost:8080/api/customer/1
    @GetMapping("{id}")
    public ResponseEntity<Customer> getEmployeeById(@PathVariable("id") long customerID){
        return new ResponseEntity<>(customerService.getCustomerById(customerID), HttpStatus.OK);
    }

    // build update employee REST API
    // http://localhost:8080/api/customer/1
    @PutMapping("{id}")
    public ResponseEntity<Customer> updateEmployee(@PathVariable("id") long id
            ,@RequestBody Customer customer){
        return new ResponseEntity<>(customerService.updateCustomer(customer, id), HttpStatus.OK);
    }

    // build delete employee REST API
    // http://localhost:8080/api/customer/1
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") long id){
        // delete employee from DB
        customerService.deleteCustomer(id);
        return new ResponseEntity<String>("Employee deleted successfully!.", HttpStatus.OK);
    }
}
