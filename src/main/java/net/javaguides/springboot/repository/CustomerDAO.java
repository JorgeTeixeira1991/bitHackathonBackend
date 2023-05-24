package net.javaguides.springboot.repository;

import net.javaguides.springboot.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerDAO extends JpaRepository<Customer, Long> {


}
