package com.devvini.vxlist.dto;

/*Essa classe basicamente sera criada somente para mim filtrar alguns pontos especificos
 * da minha aplicação e da minha lista de games.*/

// ela nao esta mapeada com o banco, ela é uma classe independente 
import com.devvini.vxlist.entities.Game;
import com.devvini.vxlist.projections.GameMinProjection;

public class GameMinDTO {
	
	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	public GameMinDTO() {
		
	}

	/*
	 * Nesse caso eu vou instanciar um GameMinDTO instanciando os dados da minha classe GAME COPIANDO OS 
	 * DADOS DO GAME
	 * PARA O DTO
	 * */
	public GameMinDTO(Game entity) {
		// AQUI ESTOU PEGANDO O ID DA ENTIDADE GAME E SALVANDO NO DTO
		// como nao tem parametros com o mesmo nome eu nem precisaria do this pois n existe ambiguidade
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.year = entity.getYear();
		this.imgUrl = entity.getImgUrl();
		this.shortDescription = entity.getShortDescription();
	}
	
	public GameMinDTO(GameMinProjection projection) {
		// AQUI ESTOU PEGANDO O ID DA ENTIDADE GAME E SALVANDO NO DTO
		// como nao tem parametros com o mesmo nome eu nem precisaria do this pois n existe ambiguidade
		this.id = projection.getId();
		this.title = projection.getTitle();
		this.year = projection.getYear();
		this.imgUrl = projection.getImgUrl();
		this.shortDescription = projection.getShortDescription();
	}
	
	
	// SÓ PRECISA DOS GETTERS NO DTO
	
	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
	
	
	

}
