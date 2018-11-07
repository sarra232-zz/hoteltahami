package com.hoteltahami.analisis.api.mapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.hoteltahami.analisis.api.dto.SpaceDTO;
import com.hoteltahami.analisis.api.modelo.Space;
import com.hoteltahami.analisis.api.repositorio.SpaceRepository;

public class SpaceMapper {
	
	private final SpaceRepository spaceRepository;
	
	public SpaceMapper(SpaceRepository spaceRepository) {
		this.spaceRepository = spaceRepository;
	}
	
	public static SpaceDTO asSpaceDTO(Space space ) {
		SpaceDTO activo = new SpaceDTO();
		activo.setCode(space.getCode());
		activo.setName(space.getName());
		activo.setInicialdate(space.getInicialdate());
		activo.setFinaldate(space.getFinaldate());
		activo.setStatus(space.getStatus());
		return activo;	
	}
	
	// DTO metodo para la listar las personas registradas
	
	public static List<SpaceDTO> ListAsPersonaDTO( List<Space> listSpaceIn ) {
		
		List<SpaceDTO> listActivo = new ArrayList<SpaceDTO>();
		for(Space space  : listSpaceIn) {
			listActivo.add(asSpaceDTO(space));
		}
		
		return listActivo;	
	}
}
