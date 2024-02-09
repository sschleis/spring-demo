package de.sschleis.demo.springdemo.redis.unit;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.redis.core.RedisHash;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@RedisHash("customer")
public class RedisCustomer {

    @Id
    private String id;
    private String firstname;
    private String lastname;

}
