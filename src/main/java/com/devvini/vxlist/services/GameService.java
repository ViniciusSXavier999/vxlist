package com.devvini.vxlist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devvini.vxlist.dto.GameDTO;
import com.devvini.vxlist.dto.GameMinDTO;
import com.devvini.vxlist.entities.Game;
import com.devvini.vxlist.projections.GameMinProjection;
import com.devvini.vxlist.repositories.GameRepository;

// REGISTRANDO COMO UM COMPONENTE DO SISTEMA
@Service
public class GameService {

	// INJETANDO O COMPONENTE GAMEREPOSITORY NO MEU SERVICE
	// UM COMPONENTE CHAMANDO O OUTRO COMPONENTE
	@Autowired
	private GameRepository gameRepository;

	// Vai devolver apenas os dados da minha entidade DTO, SEMPRE RESPEITANDO A
	// ARQUITETURA.
	// REPOSITORY DEVOLVE A ENTIDADE E O SERVICE DEVOLVE UM DTO

	/*
	 * public List<Game> findAll(){ List<Game> result = gameRepository.findAll();
	 * return result; }
	 */

	// AGORA VAI VIR O DTO, PORQUE EU QUERO SOMENTE OS DADOS QUE ESTÃO LÁ
	// EU VOU CRIAR UMA LISTA EQUIVALENTE TRANSFORMANDO TUDO QUE FOR GAME EM
	// GAMEMINDTO

	/*
	 * readOnly -> Nesse caso eu estou assegurando que nao vou fazer operação
	 * escrita, ficando mais rapido dessa forma
	 */
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();

		/*
		 * strem -> é uma lib do java que permite fazer operações com sequencia de dados
		 * map -> transforma objetos de uma coisa para outra
		 * 
		 * todo objeto x original que era game, eu quero transformar ele em um
		 * "new gameMinDTO" passando x como argumento e no final eu uso o toList para
		 * voltar a ser uma lista.
		 */

		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		return dto;
	}

	@Transactional(readOnly = true)
	// agora eu vou criar um método para buscar por ID
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		// agpra vou converter um objeto Game para DTO ? vou usar o construtor que a
		// gente fez no GameDTO
		return new GameDTO(result);

	}

	/* fazendo um método que retorna os games de uma lista especifica */

	/*
	 * aqui nessa primeira linha estou dizendo que vou receber uma lista nos
	 * parametros que vai retornar os games 
	 */
	public List<GameMinDTO> findByList(Long listId) {
		List<GameMinProjection> result = gameRepository.searchByList(listId);
		
		// aqui eu pego o meu result e através da função map eu transformo no objeto que eu desejo
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}

}
