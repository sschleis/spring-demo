package de.sschleis.demo.springdemo.redis.unit;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RedisCustomerRepository extends JpaRepository<RedisCustomer, String> {
}
