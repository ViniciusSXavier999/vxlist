package com.devvini.vxlist.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_game")
// CLASSE QUE VAI REPRESENTAR UM JOGO PARA NÓS 
public class Game {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	
	// Customizando o nome da coluna no banco
	@Column(name = "game_year")
	private Integer year;
	private String genre;
	private String imgUrl;
	private String shortDescription;
	private String longDescription;
	
	public Game() {
		
	}
	
	// construtor com argumentos para que eu tenha a possibilidade de instanciar um game e já passar os argumentos para ele

	public Game(Long id, String title, Integer year, String genre, String imgUrl, String shortDescription,
			String longDescription) {
		super();
		// esse this faz referencia ao atributo do objeto, aqui eu estou dizendo o id do objeto recebe o 
		// id que veio de argumento lá em cima
		this.id = id;
		this.title = title;
		this.year = year;
		this.genre = genre;
		this.imgUrl = imgUrl;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
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

	
	// MÉTODOS PARA COMPARAR SE OS GAMES SÃO IGUAIS OU NAO, SERVE PARA COMPARAR UM OBJETO COM O OUTRO.
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return Objects.equals(id, other.id);
	}
	
	
	

}
