package com.course.spring.jose.resources;

import com.course.spring.jose.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Jose", "jose.maria.assis23@gmail.com", "85998158551", "123456789");

        return ResponseEntity.ok().body(u);
    }
}
