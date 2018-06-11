package com.bahaida.userfront.services;

import com.bahaida.userfront.persistence.domain.User;
import com.bahaida.userfront.persistence.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public boolean checkUserExists(String username, String email) {
        return checkEmailExists(email) || checkUsernameExists(username);
    }

    @Override
    public boolean checkUsernameExists(String username) {
        return userRepository.findUserByUsername(username) != null;
    }

    @Override
    public boolean checkEmailExists(String email) {
        return userRepository.findUserByEmail(email) != null;
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findUserByUsername(username);
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }
}
