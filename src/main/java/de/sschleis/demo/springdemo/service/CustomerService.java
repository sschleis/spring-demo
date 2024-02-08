package de.sschleis.demo.springdemo.service;


import de.sschleis.demo.springdemo.persistence.repository.CustomerRepo;
import de.sschleis.demo.springdemo.persistence.unit.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CustomerService {

    private final CustomerRepo customerRepo;

    @GetMapping("/customers")
    public List<Customer> getAllCustomers() {
        return customerRepo.findAll();
    }
}
