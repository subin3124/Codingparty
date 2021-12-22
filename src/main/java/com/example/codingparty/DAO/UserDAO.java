package com.example.codingparty.DAO;

import com.example.codingparty.Entity.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDAO extends CrudRepository<UserEntity, String> {

}
