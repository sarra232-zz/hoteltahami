package com.hoteltahami.analisis.api.mapping;

import java.util.ArrayList;
import java.util.List;

import com.hoteltahami.analisis.api.dto.EmployedDTO;
import com.hoteltahami.analisis.api.modelo.Employed;
import com.hoteltahami.analisis.api.repositorio.EmployedRepository;



public class EmployedMapper {
private final EmployedRepository employedRepository;
	
	public EmployedMapper(EmployedRepository employedRepository) {
		this.employedRepository = employedRepository;
	}
	
	public static EmployedDTO asEmployedDTO(Employed employedIn ) {
		EmployedDTO activo = new EmployedDTO();
		activo.setRol(employedIn.getRol());
		activo.setStatus(employedIn.getStatus());
		return activo;	
	}
	
	// DTO metodo para la listar las personas registradas
	
	public static List<EmployedDTO> ListAsEmployedDTO( List<Employed> employedIn ) {
		
		List<EmployedDTO> listActivo = new ArrayList<EmployedDTO>();
		for(Employed employed  : employedIn) {
			listActivo.add(asEmployedDTO(employed));
		}
		
		return listActivo;	
	}
}
