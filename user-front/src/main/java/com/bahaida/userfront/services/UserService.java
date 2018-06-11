package com.bahaida.userfront.services;

import com.bahaida.userfront.persistence.domain.User;

public interface UserService {

    User findByUsername(String username);
    User findByEmail(String email);
    User saveUser(User user);
    boolean checkUserExists(String username, String email);
    boolean checkUsernameExists(String username);
    boolean checkEmailExists(String email);
}
