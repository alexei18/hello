package com.example.bibliotecabackend.service;

import com.example.bibliotecabackend.DTO.UserDTO;
import com.example.bibliotecabackend.enitity.User;
import com.example.bibliotecabackend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UserDetailsService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public UserService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    public User signUp(User user) {
        String hashedPassword = passwordEncoder.encode(user.getPassword());
        user.setPassword(hashedPassword);
        return userRepository.save(user);
    }

    public Optional<User> findById(Long userId) {
        return userRepository.findById(userId);
    }

    public Optional<User> login(String email, String password) {
        Optional<User> user = userRepository.findByEmail(email);

        if (user.isPresent() && passwordEncoder.matches(password, user.get().getPassword())) {
            return user;
        }

        return Optional.empty();
    }

    public User updateUser(Long userId, User newUser) {
        User existingUser = userRepository.findById(userId)
                .orElseThrow(() -> new IllegalArgumentException("User not found with id: " + userId));

        existingUser.setEmail(newUser.getEmail());
        existingUser.setPassword(passwordEncoder.encode(newUser.getPassword()));

        return userRepository.save(existingUser);
    }

    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findByEmail(email);
        return user.orElseThrow(() -> new UsernameNotFoundException("User not found with email: " + email));
    }

    public Optional<UserDTO> getUserById(Long id) {
        Optional<User> userOptional = userRepository.findById(id);
        return userOptional.map(user -> new UserDTO(user.getFirst_name(), user.getLast_name(), user.getEmail(), user.getPhone_number()));
    }
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
