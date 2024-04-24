package com.example.UserManagement.Services;

import com.example.UserManagement.Models.User;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface UserService {
    public User addUser(User user);

    public List<User> getAllUsers();

    public User getUserById(Integer userId) throws Exception;
    public User getUserByUsernamePassword(String username, String password) throws Exception;
    public User updateUser(Integer userId, User user) throws Exception;
    public String deleteUser(Integer userId) throws Exception;
}
