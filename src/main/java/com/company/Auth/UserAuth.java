package com.company.Auth;

import com.company.model.User;

public interface UserAuth {
boolean addUser(User user);
boolean isValidUser(String username,String password);
}
