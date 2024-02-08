package de.sschleis.demo.springdemo.service;

import de.sschleis.demo.springdemo.TCTest;
import de.sschleis.demo.springdemo.persistence.unit.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class CustomerServiceIT extends TCTest {

    @Autowired
    private CustomerService underTest;

    @Test
    void getAllCustomers() {
        List<Customer> results = underTest.getAllCustomers();
        assertAll(
                () -> assertNotNull(results),
                () -> assertFalse(results.isEmpty())
        );
    }
}