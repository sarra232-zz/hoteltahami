package com.hoteltahami.analisis.api.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.hoteltahami.analisis.api.modelo.Space;
import com.hoteltahami.analisis.api.repositorio.SpaceRepository;
import com.hoteltahami.analisis.api.service.SpaceService;
import com.hoteltahami.analisis.api.service.util.Messages;


@Service
//@Qualifier(PersonaServiceImpl);
public class SpaceServiceImpl implements SpaceService {
	
private final Logger log = LoggerFactory.getLogger(SpaceServiceImpl.class);
	
	private Messages messages;
	private final SpaceRepository spaceRepository;
	
	public SpaceServiceImpl(SpaceRepository spaceRepository, Messages messages) {
		this.spaceRepository = spaceRepository;
		this.messages = messages;
	}

	@Override
	public List<Space> getSpace() {
		log.debug("Inicio getSpace");
		List<Space> space= spaceRepository.findAll();
		log.debug("Fin getReserva");
		return space;
	}

	public List<Space> searchSpaceByStatus(String status) {
		log.debug("Inicio getReserva por cliente");
		List<Space> space= spaceRepository.findAllStatusDisponible(status);
		log.debug("Fin getReserva");
		return space;
	}

	@Override
	public Space searchSpaceByCode(String code) {
		log.debug("Inicio getReserva por cliente");
		Space space= spaceRepository.findByCode(code);
		log.debug("Fin getReserva");
		return space;
	}

	@Override
	public Space addSpace(Space space) {
		log.debug("Inicio addProyectos: id = {}", space);
		return spaceRepository.save(space);
	}

	@Override
	public Space updateSpace(Space newSpace) {
		log.debug("Inicio updateProyecto: id = {}", newSpace);
		return spaceRepository.save(newSpace);
	}

	@Override
	public Space getSpacenActualizar(String Name) {
		// TODO Auto-generated method stub
		return null;
	}


}
