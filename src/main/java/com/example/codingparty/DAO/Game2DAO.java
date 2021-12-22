package com.example.codingparty.DAO;

import com.example.codingparty.Entity.Game1Entity;
import com.example.codingparty.Entity.Game2Entity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Game2DAO extends CrudRepository<Game2Entity,Integer> {
    @Query(value = "select * from game2 order by score desc", nativeQuery = true)
    public List<Game2Entity> OrderByScore();
}
