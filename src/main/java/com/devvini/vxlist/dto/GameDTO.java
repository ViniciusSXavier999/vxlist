package com.devvini.vxlist.dto;

import org.springframework.beans.BeanUtils;

import com.devvini.vxlist.entities.Game;

public class GameDTO {

	
	private Long id;
	private String title;
	private Integer year;
	private String genre;
	private String platforms;
	private Double score;
	private String imgUrl;
	private String shortDescription;
	private String longDescription;
	
	
	public GameDTO() {
		
	}
	
	public GameDTO(Game entity) {
		/*como tem bastante métodos para se colocar, eu vou utilizar essa propriedade do java*/
		/*nesse método eu vou copiar as propriedades da entidade para o DTO onde eu estou, lembrando que o 
		 * próprio objeto a gente referencia ele por this*/
		// Aqui eu estou copiando tudo que esta em entity para o nosso objeto GAMEDTO
		// para funcionar, o DTO devera ter get e set 
		BeanUtils.copyProperties(entity, this);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getPlatforms() {
		return platforms;
	}

	public void setPlatforms(String platforms) {
		this.platforms = platforms;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
	
	
}
