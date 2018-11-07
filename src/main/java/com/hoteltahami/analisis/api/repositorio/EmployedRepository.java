package com.hoteltahami.analisis.api.repositorio;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hoteltahami.analisis.api.modelo.Employed;

public interface EmployedRepository extends JpaRepository<Employed, String> {
	
	public  List<Employed> findAllById(String id);
	
	public Optional<Employed> findByName(String name);
	
	public Optional<Employed> findByEmail(String email);
	
	public List<Employed> findByRol(String rol);
}

