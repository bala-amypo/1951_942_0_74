package com.example.demo.config;

import com.example.demo.security.JwtUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JwtConfig {

    @Bean
    public JwtUtil jwtUtil() {
        // SAME secret pattern used in tests
        return new JwtUtil(
                "testsecretkeytestsecretkeytestsecretkey",
                3600000  // 1 hour
        );
    }
}
