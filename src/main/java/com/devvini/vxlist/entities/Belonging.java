package com.devvini.vxlist.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

// CADA JOGO PERTENCE A QUAL LISTA 

@Entity
@Table(name = "tb_belonging")
public class Belonging {
	
	@EmbeddedId
	private BelongingPK id = new BelongingPK();
	
	private Integer position;
	
	public Belonging() {
		
	}

	/*
	 *eu só estou passando como argumento o game e o game list porque quando eu criar um objeto do tipo belonging
	 *eu vou ter que passar um game e um game list 
	 * 
	 * */
	public Belonging(Game game, GameList list, Integer position) {
		super();
		id.setGame(game);
		id.setList(list);
		this.position = position;
	}

	public BelongingPK getId() {
		return id;
	}

	public void setId(BelongingPK id) {
		this.id = id;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

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
		Belonging other = (Belonging) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	
	

}
