package com.example.bibliotecabackend.controller;

import com.example.bibliotecabackend.DTO.UserDTO;
import com.example.bibliotecabackend.enitity.Book;
import com.example.bibliotecabackend.enitity.User;
import com.example.bibliotecabackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping()
    public ResponseEntity<User> signUp(@RequestBody User user) {
        User savedUser = userService.signUp(user);
        return ResponseEntity.ok(savedUser);
    }

    @GetMapping("/login")
    public ResponseEntity<User> login(@RequestParam("email") String email, @RequestParam("password") String password) {
        Optional<User> user = userService.login(email, password);
        return user.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDTO> getUserById(@PathVariable Long id) {
        Optional<UserDTO> userOptional = userService.getUserById(id);
        return userOptional.map(user -> {
            UserDTO userDTO = new UserDTO(user.getFirst_name(), user.getLast_name(), user.getEmail(), user.getPhone_number());
            return ResponseEntity.ok(userDTO);
        }).orElseGet(() -> ResponseEntity.notFound().build());
    }


    @GetMapping
    public List<UserDTO> getAllUsers() {
        List<User> users = userService.getAllUsers();
        List<UserDTO> userDTOs = new ArrayList<>();
        for (User user : users) {
            UserDTO userDTO = new UserDTO(user.getFirst_name(), user.getLast_name(), user.getEmail(), user.getPhone_number());
            userDTOs.add(userDTO);
        }
        return userDTOs;
    }

    @PutMapping("/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User user) {
        User updatedUser = userService.updateUser(id, user);
        return ResponseEntity.ok(updatedUser);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/secure-endpoint")
    public ResponseEntity<String> secureEndpoint() {
        return ResponseEntity.ok("This is a secured endpoint");
    }
}
