package com.devvini.vxlist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devvini.vxlist.dto.GameDTO;
import com.devvini.vxlist.dto.GameMinDTO;
import com.devvini.vxlist.entities.Game;
import com.devvini.vxlist.services.GameService;

// Esse controlador que vai disponibilzar a nossa API 

@RestController
@RequestMapping(value = "/games")
public class GameController {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameMinDTO> findAll() {
		List<GameMinDTO> result = gameService.findAll();
		return result;
	}
	
	@GetMapping(value = "/{id}") // configurando que vai ter um parametro ID
	public GameDTO findById(@PathVariable long id) { /*Para eu dizer que o id que eu passar como parametro case com o 
	id que eu passar na requisição, eu vou utilizar a anotação pathvariable*/
		GameDTO result = gameService.findById(id);
		return result;
	}

}
