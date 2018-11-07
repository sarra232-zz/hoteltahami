package com.hoteltahami.analisis.api.repositorio;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hoteltahami.analisis.api.modelo.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, String> {

	public  List<Person> findAllById(String id);
	
	public Optional<Person> findByName(String name);
	
	public Optional<Person> findByEmail(String email);
	
}
