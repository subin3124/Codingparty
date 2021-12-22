package com.example.codingparty.Controller;

import com.example.codingparty.DAO.Game1DAO;
import com.example.codingparty.DAO.Game2DAO;
import com.example.codingparty.Entity.Game1Entity;
import com.example.codingparty.Entity.Game2Entity;
import com.example.codingparty.Entity.UserEntity;
import com.example.codingparty.GameJson;
import com.example.codingparty.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ScoreController {

    @Autowired
    Game1DAO game1DAO;

    @Autowired
    Game2DAO game2DAO;

    @Autowired
    UserService userService;

    @PostMapping("/Score/Game1")
    private void Game1(@RequestBody GameJson gameJson) {
        Game1Entity game1Entity = new Game1Entity();
        game1Entity.setUser(gameJson.getUser());
        game1Entity.setScore(gameJson.getScore());
        game1DAO.save(game1Entity);
    }

    @PostMapping("/Score/Game2")
    private void Game2(@RequestBody GameJson gameJson) {
        Game2Entity game2Entity = new Game2Entity();
        game2Entity.setUser(gameJson.getUser());
        game2Entity.setScore(gameJson.getScore());
        game2DAO.save(game2Entity);
    }

    @PostMapping("/User/Add")
    private int AddUser(@RequestBody UserEntity user) {

        int result = userService.addUser(user);
        return result;
    }
}
