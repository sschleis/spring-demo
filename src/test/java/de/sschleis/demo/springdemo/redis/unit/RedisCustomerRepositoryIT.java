package de.sschleis.demo.springdemo.redis.unit;

import de.sschleis.demo.springdemo.TCTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

class RedisCustomerRepositoryIT extends TCTest {

    @Autowired
    private RedisCustomerRepository underTest;

    @Test
    public void testRedis() {
        RedisCustomer save = underTest.save(RedisCustomer.builder()
                .id("TestID")
                .firstname("Luke")
                .lastname("Skywalker")
                .build());

        RedisCustomer retrieved = underTest.findById(save.getId()).orElse(null);
        Assertions.assertNotNull(retrieved);
        Assertions.assertEquals("Luke", retrieved.getFirstname());
        Assertions.assertEquals("Skywalker", retrieved.getLastname());
    }

}