package com.devvini.vxlist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devvini.vxlist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
