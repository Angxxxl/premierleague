package com.pl.premierleague.player;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class player_Service {
    private final playerRepository playerRepository;

    @Autowired
    public player_Service(playerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<player> getPlayers() {
        return playerRepository.findAll();
    }
    public List<player> getPlayersByCurrent_Club(String Current_Club) {
        return playerRepository.findAll().stream()
                .filter(p -> Current_Club.equals(p.getCurrent_Club()))
                .collect(Collectors.toList());


    }
    public List<player> getPlayersByName(String searchText) {
        return playerRepository.findAll().stream()
                .filter(player -> player.getFull_name().toLowerCase().contains(searchText.toLowerCase()))
                .collect(Collectors.toList());
    }
    public List<player> getPlayersByPosition(String searchText) {
        return playerRepository.findAll().stream()
                .filter(player -> player.getPosition().toLowerCase().contains(searchText.toLowerCase()))
                .collect(Collectors.toList());
    }
}
