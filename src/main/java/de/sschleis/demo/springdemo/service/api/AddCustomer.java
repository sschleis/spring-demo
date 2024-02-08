package de.sschleis.demo.springdemo.service.api;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AddCustomer {
    private String firstname;
    private String lastname;
}
