package com.pl.premierleague.team;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class TeamConfig {

    @Bean
    CommandLineRunner commandLineRunner(TeamRepository repository) {
        return args -> {
            repository.saveAll(List.of(
                    crearEquipo("Arsenal", "t3"),
                    crearEquipo("AFC Bournemouth", "t91"),
                    crearEquipo("Brighton & Hove Albion", "t36"),
                    crearEquipo("Burnley", "t90"),
                    crearEquipo("Cardiff City", "t46"),
                    crearEquipo("Chelsea", "t8"),
                    crearEquipo("Crystal Palace", "t31"),
                    crearEquipo("Everton", "t11"),
                    crearEquipo("Fulham", "t54"),
                    crearEquipo("Huddersfield Town", "t38"),
                    crearEquipo("Leicester City", "t13"),
                    crearEquipo("Liverpool", "t14"),
                    crearEquipo("Manchester City", "t43"),
                    crearEquipo("Manchester United", "t1"),
                    crearEquipo("Newcastle United", "t4"),
                    crearEquipo("Southampton", "t20"),
                    crearEquipo("Tottenham Hotspur", "t6"),
                    crearEquipo("Watford", "t57"),
                    crearEquipo("West Ham United", "t21"),
                    crearEquipo("Wolverhampton Wanderers", "t39")
            ));
        };
    }

    // Este es nuestro método ayudante para no escribir tanto código repetido
    private Team crearEquipo(String name, String imageCode) {
        Team team = new Team();
        team.setName(name);
        team.setImageTeam("https://resources.premierleague.com/premierleague/badges/" + imageCode + ".svg");
        return team;
    }
}
