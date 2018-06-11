package com.bahaida.userfront.persistence.repositories;

import com.bahaida.userfront.persistence.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{
    User findUserByUsername(String username);
    User findUserByEmail(String email);
}
