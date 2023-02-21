package com.islandsoftware.springapi.resources;

import com.islandsoftware.springapi.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1L, "Nilso", "nilsojr@gmail.com", "48", "abc");
        return ResponseEntity.ok(user);
    }
}
