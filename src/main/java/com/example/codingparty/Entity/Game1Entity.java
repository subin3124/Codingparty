package com.example.codingparty.Entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Table(name = "game1")
@Entity
public class Game1Entity {

    @Id
    @Column(name = "gameid")
    private int gameid;

    @Column
    private String user;

    @Column
    private int score;

    @Column(nullable = false, updatable = false, insertable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp time;

    public int getGameid() {
        return gameid;
    }

    public void setGameid(int gameid) {
        this.gameid = gameid;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Timestamp getTime() {
        return time;
    }

    public void setTime(Timestamp time) {
        this.time = time;
    }

}