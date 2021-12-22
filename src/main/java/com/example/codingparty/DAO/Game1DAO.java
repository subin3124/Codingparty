package com.example.codingparty.DAO;

import com.example.codingparty.Entity.Game1Entity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Game1DAO extends CrudRepository<Game1Entity, Integer>
{
    @Query(value = "select * from game1 order by score desc", nativeQuery = true)
    public List<Game1Entity> OrderByScore();
}

