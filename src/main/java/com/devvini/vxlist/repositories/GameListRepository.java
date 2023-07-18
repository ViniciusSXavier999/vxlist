package com.devvini.vxlist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devvini.vxlist.entities.Game;
import com.devvini.vxlist.entities.GameList;

// meu componente da camada de acesso a dados esta pronto.
public interface GameListRepository extends JpaRepository<GameList, Long> {

}
