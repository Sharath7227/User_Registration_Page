package com.registration.firsts.Repository;

import com.registration.firsts.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {
}
