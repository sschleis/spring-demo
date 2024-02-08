package de.sschleis.demo.springdemo.persistence.repository;

import de.sschleis.demo.springdemo.persistence.unit.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Long> {
}
