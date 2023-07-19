package com.devvini.vxlist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devvini.vxlist.dto.GameDTO;
import com.devvini.vxlist.dto.GameListDTO;
import com.devvini.vxlist.dto.GameMinDTO;
import com.devvini.vxlist.entities.Game;
import com.devvini.vxlist.services.GameListService;
import com.devvini.vxlist.services.GameService;

// Esse controlador que vai disponibilzar a nossa API 

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	
	@Autowired
	private GameListService gameListService;
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameListDTO> findAll() {
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}
	
	@GetMapping(value = "/{listId}/games") // esse nome entre chaves tem que ser igual o da variavel do parametro 
	public List<GameMinDTO> findByList(@PathVariable Long listId) {
		 List<GameMinDTO> result = gameService.findByList(listId);
		return result;
	}
	
	
}
