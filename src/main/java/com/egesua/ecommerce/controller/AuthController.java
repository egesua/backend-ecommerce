package com.egesua.ecommerce.controller;

import com.egesua.ecommerce.converter.Converter;
import com.egesua.ecommerce.dto.request.LoginRequest;
import com.egesua.ecommerce.dto.request.UserRequest;
import com.egesua.ecommerce.dto.response.LoginResponse;
import com.egesua.ecommerce.dto.response.UserResponse;
import com.egesua.ecommerce.entity.User;
import com.egesua.ecommerce.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private AuthenticationService authenticationService;

    @Autowired
    public AuthController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    @PostMapping("/signup/")
    public UserResponse register(@RequestBody UserRequest userRequest){
        User user=authenticationService
                .signup(userRequest.name(), userRequest.email(),
                        userRequest.password(), userRequest.role());

        return Converter.findUser(user);
    }

    @PostMapping("/login")
    public UserResponse login(@RequestBody LoginRequest loginRequest){
        return authenticationService.login(loginRequest);

    }
}
