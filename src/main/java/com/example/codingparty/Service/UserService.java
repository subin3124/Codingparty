package com.example.codingparty.Service;

import com.example.codingparty.DAO.UserDAO;
import com.example.codingparty.Entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDAO userRepository;

    public int addUser(UserEntity user){
        try {
            userRepository.save(user);
            return 200;
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            return 500;

        }
    }
}
