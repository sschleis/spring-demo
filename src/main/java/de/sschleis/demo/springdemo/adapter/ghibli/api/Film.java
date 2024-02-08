package de.sschleis.demo.springdemo.adapter.ghibli.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Film {
    private String id;
    private String title;
}
