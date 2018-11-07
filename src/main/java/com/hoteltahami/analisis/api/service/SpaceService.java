package com.hoteltahami.analisis.api.service;

import java.util.List;
import java.util.Optional;

import com.hoteltahami.analisis.api.modelo.Space;

public interface SpaceService {
	public List<Space> getSpace();
		
	public static List<Space> searchSpaceByStatus(String status) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Space searchSpaceByCode(String code);
	
	public Space addSpace(Space space);
	
	public Space updateSpace(Space space);
		
	public Space getSpacenActualizar(String Name);
}
