package com.egesua.ecommerce.service;

import com.egesua.ecommerce.dto.response.UserResponse;
import com.egesua.ecommerce.entity.User;

import java.util.List;

public interface UserService {
    void findUserByEmail(String email);
    User findUserByID(long id);
    List<UserResponse> getAllUsers();
    UserResponse saveUser(User user);
    User deleteUser(long id);
}
