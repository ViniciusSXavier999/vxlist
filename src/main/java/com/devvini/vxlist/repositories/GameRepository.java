package com.devvini.vxlist.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devvini.vxlist.entities.Game;
import com.devvini.vxlist.projections.GameMinProjection;

public interface GameRepository extends JpaRepository<Game, Long> {
	
	/*fazendo uma consulta customizada*/
	
	/*Quando utiliza o nativequery que é o sql, o resultado da consulta tem que ser uma interface */
	@Query(nativeQuery = true, value = """
			SELECT tb_game.id, tb_game.title, tb_game.game_year AS `year`, tb_game.img_url AS imgUrl,
			tb_game.short_description AS shortDescription, tb_belonging.position
			FROM tb_game
			INNER JOIN tb_belonging ON tb_game.id = tb_belonging.game_id
			WHERE tb_belonging.list_id = :listId
			ORDER BY tb_belonging.position
				""")
	List<GameMinProjection> searchByList(Long listId);

}
