package com.bahaida.userfront.services;

public interface UserService {
    boolean checkUserExists(String username, String email);
    boolean checkUsernameExists(String username);
    boolean checkEmailExists(String email);
}
