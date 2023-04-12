package com.example.oauthdemojava;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @GetMapping("/user")
    public OAuth2User getUser(@AuthenticationPrincipal OAuth2User principal) {
        return principal;
    }

    @GetMapping("/hello")
    public  String helloWorld(){return "Hello World";}
}