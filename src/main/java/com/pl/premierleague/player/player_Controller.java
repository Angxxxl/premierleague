package com.pl.premierleague.player;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path ="api/v1/player")
public class player_Controller {
    private final player_Service player_service;

    @Autowired
    public player_Controller(player_Service player_service) {
        this.player_service = player_service;
    }

    @GetMapping
    public List<player> getPlayers(
            @RequestParam(required = false) String Current_club,
            @RequestParam(required = false) String Full_name,
            @RequestParam(required = false) String Position,
            @RequestParam(required = false) String Nationality){
        if(Current_club !=null && Position !=   null ){
            return player_service.getPlayersByTeamAndPosition(Current_club, Position);

        }
        else if (Current_club != null) {
            return player_service.getPlayersByCurrent_Club(Current_club);

        }
        else if (Full_name != null) {
            return player_service.getPlayersByName(Full_name);

        }
        else  if (Nationality != null) {
            return player_service.getPlayersByNationality(Nationality);
        }
        else if(Position != null){
            return  player_service.getPlayersByPosition(Position);
        }else {
            return player_service.getPlayers();
        }

    }

    @PostMapping
    public ResponseEntity<player> addPlayer(@RequestBody player player){
        player  created_player = player_service.addPlayer(player);
        return new ResponseEntity<>(created_player, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<player> updatePlayer(@RequestBody player player){
        player resultPlayer = player_service.updatePlayer(player);
        if(resultPlayer != null){
            return new ResponseEntity<>(resultPlayer, HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(path = "/{Full_name}")

    public ResponseEntity<String> deletePlayer(@PathVariable String Full_name){
        player_service.deletePlayer(Full_name);
        return new ResponseEntity<>("Player deleted", HttpStatus.OK);
    }
}
