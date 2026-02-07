package com.pl.premierleague.player;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository
public interface playerRepository extends JpaRepository<player, String> {
    @Query("SELECT p FROM player p WHERE p.Current_Club = ?1")
    List<player> findByClub(String club);
}
