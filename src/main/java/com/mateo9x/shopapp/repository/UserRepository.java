package com.mateo9x.shopapp.repository;

import com.mateo9x.shopapp.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
