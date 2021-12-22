package com.example.codingparty.Service;

import com.example.codingparty.DAO.Game1DAO;
import com.example.codingparty.DAO.Game2DAO;
import com.example.codingparty.Entity.Game1Entity;
import com.example.codingparty.Entity.Game2Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    @Autowired
    Game1DAO game1DAO;

    @Autowired
    Game2DAO game2DAO;
    public List<Game1Entity> GetGame1SortByScore(){
        return game1DAO.OrderByScore();
    }
    public List<Game2Entity> GetGame2SortByScore() { return game2DAO.OrderByScore(); }
}
