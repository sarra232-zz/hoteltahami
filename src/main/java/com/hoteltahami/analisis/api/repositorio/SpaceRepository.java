package com.hoteltahami.analisis.api.repositorio;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hoteltahami.analisis.api.modelo.Space;

public interface SpaceRepository extends JpaRepository<Space, String> {
	
	public  List<Space> findAll();
	
	public  List<Space> findAllStatusDisponible(String Status);
	
	public  Space findByCode(String code);
	
}
