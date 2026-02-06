package com.pl.premierleague.player;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface playerRepository extends JpaRepository<player,String> {
    void deleteByName(String name);
    Optional<player> findByName(String name);
}
