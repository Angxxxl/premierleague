package com.pl.premierleague.team;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping(path ="api/v1/team")
public class Team_Controller {
    private final TeamService teamService;

    @Autowired
    public Team_Controller(TeamService teamService) {
        this.teamService = teamService;
    }
    @GetMapping
    public List<Team> getTeams(){
        return teamService.getTeams();
    }

}
