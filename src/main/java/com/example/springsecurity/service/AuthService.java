package com.example.springsecurity.service;

import com.example.springsecurity.dto.AuthRequest;
import com.example.springsecurity.dto.AuthResponse;
import com.example.springsecurity.dto.SignUpRequest;
import com.example.springsecurity.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;

    public AuthResponse register(SignUpRequest request) {
        return null;
    }

    public AuthResponse authenticate(AuthRequest request) {
        return null;
    }
}
