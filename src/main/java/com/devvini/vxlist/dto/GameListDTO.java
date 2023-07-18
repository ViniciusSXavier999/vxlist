package com.devvini.vxlist.dto;

import com.devvini.vxlist.entities.GameList;

public class GameListDTO {
	
	private Long id;
	private String name;
	
	public GameListDTO() {
		
	}
	
	public GameListDTO(GameList entity) {
		id = entity.getId();
		name = entity.getName();
	}

	// como eu nao utilizei o beanutil eu posso utilizar somente os getters 
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
	
	

	
}
