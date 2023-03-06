package com.islandsoftware.springapi.config;

import com.islandsoftware.springapi.entities.Order;
import com.islandsoftware.springapi.entities.User;
import com.islandsoftware.springapi.repositories.OrderRepository;
import com.islandsoftware.springapi.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User(null, "Nilso", "nilso@gmail.com", "123", "456");
        User user2 = new User(null, "Fernanda", "fernanda@gmail.com", "789", "012");

        userRepository.saveAll(Arrays.asList(user1, user2));

        Order order1 = new Order(null, Instant.parse("2023-02-23T14:48:02Z"), user1);
        Order order2 = new Order(null, Instant.parse("2023-02-23T14:49:31Z"), user2);

        orderRepository.saveAll(Arrays.asList(order1, order2));
    }
}
