package com.pl.premierleague.team;

import jakarta.persistence.*;

@Entity
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String imageTeam;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageTeam() {
        return imageTeam;
    }

    public void setImageTeam(String imageTeam) {
        this.imageTeam = imageTeam;
    }

    public Team() {
    }
}

