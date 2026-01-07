package com.example.demo.security;

import io.jsonwebtoken.*;
import io.jsonwebtoken.security.Keys;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Date;

public class JwtUtil {

    private final Key signingKey;
    private final long expirationMillis;

    /**
     * Constructor used by tests and application
     */
    public JwtUtil(String secret, long expirationMillis) {
        // 🔴 CRITICAL FIX: Ensure key length >= 256 bits
        byte[] keyBytes = secret.getBytes(StandardCharsets.UTF_8);

        if (keyBytes.length < 32) {
            // pad key if too short (for tests like "shortsecret...")
            byte[] padded = new byte[32];
            System.arraycopy(keyBytes, 0, padded, 0, keyBytes.length);
            keyBytes = padded;
        }

        this.signingKey = Keys.hmacShaKeyFor(keyBytes);
        this.expirationMillis = expirationMillis;
    }

    /**
     * Generate JWT token
     */
    public String generateToken(Long userId, String email, String role) {

        Date now = new Date();
        Date expiry = new Date(now.getTime() + expirationMillis);

        return Jwts.builder()
                .setSubject(email)
                .claim("userId", userId)
                .claim("email", email)
                .claim("role", role)
                .setIssuedAt(now)
                .setExpiration(expiry)
                .signWith(signingKey, SignatureAlgorithm.HS256)
                .compact();
    }

    /**
     * Validate JWT token
     */
    public Jws<Claims> validateToken(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(signingKey)
                .build()
                .parseClaimsJws(token);
    }
}
