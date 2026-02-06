package com.pl.premierleague.player;


import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
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
    public List<player> getPlayersByNationality(String searchText) {
        return playerRepository.findAll().stream()
                .filter(player -> player.getNationality().toLowerCase().contains(searchText.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<player> getPlayersByTeamAndPosition(String Current_Team, String Position) {
        return playerRepository.findAll().stream()
                .filter(player -> Current_Team.equals(player.getCurrent_Club())
                        && Position.equals(player.getPosition()))
                .collect(Collectors.toList());
    }
    public player addPlayer(player player) {
        playerRepository.save(player);
        return player;
    }
    public player updatePlayer(player updatedPlayer) {
        Optional<player> existingPlayer = playerRepository.findById(updatedPlayer.getFull_name());

        if (existingPlayer.isPresent()) {
            player playerToUpdate = existingPlayer.get();
            playerToUpdate.setFull_name(updatedPlayer.getFull_name());
            playerToUpdate.setPosition(updatedPlayer.getPosition());
            playerToUpdate.setNationality(updatedPlayer.getNationality());
            playerToUpdate.setCurrent_Club(updatedPlayer.getCurrent_Club());
            playerRepository.save(playerToUpdate);
            return playerToUpdate;

        }
        return null;
    }
    @Transactional
    public void deletePlayer(String Full_Name) {
        playerRepository.deleteById(Full_Name);    }

}
