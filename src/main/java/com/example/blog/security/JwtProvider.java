package com.example.blog.security;

import io.jsonwebtoken.Jwts;
import com.example.blog.model.User;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.security.Key;

@Service
public class JwtProvider {

    private Key key;

    @PostConstruct
    public void init() {
        key = Keys.secretKeyFor(SignatureAlgorithm.HS512);
    }

    public String generateToken(Authentication auth){
        User principal = (User) auth.getPrincipal();
        return Jwts.builder()
                   .setSubject(principal.getUserName())
                   .signWith(key)
                   .compact();
    }
}
