package com.hoteltahami.analisis.api.service.impl;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hoteltahami.analisis.api.repositorio.PersonRepository;
import com.hoteltahami.analisis.api.service.PersonService;
import com.hoteltahami.analisis.api.modelo.Person;
import com.hoteltahami.analisis.api.service.util.Messages;

@Service
//@Qualifier(PersonaServiceImpl);
public class PersonServiceImpl implements PersonService {
	
	private final Logger log = LoggerFactory.getLogger(PersonServiceImpl.class);
	
	private Messages messages;
	private final PersonRepository personRepository;
	
	public PersonServiceImpl(PersonRepository proyectoRepository, Messages messages) {
		this.personRepository = proyectoRepository;
		this.messages = messages;
	}
	
	@Override
	public List<Person> getPerson(){
		log.debug("Inicio getPerson");
		List<Person> personas= personRepository.findAll();
		log.debug("Fin getProyectos");
		return personas;
	}
	
	@Override
	public List<Person> searchPersonById(String id) {
		log.debug("Inicio getPersona: name = {}", id);
		List<Person>  personasNombre= personRepository.findAllById(id);		
		log.debug("Fin getProyectosActivos: proyecto = {}");
		return personasNombre;
	}
	
	@Override
	public Person addPerson(Person persona) {
		log.debug("Inicio addProyectos: id = {}", persona);
		return personRepository.save(persona);
	}
	
	@Override
	public Person updatePerson(Person newPerson) {
		log.debug("Inicio updateProyecto: id = {}", newPerson);
		return personRepository.save(newPerson);
	}
	
	@Override
	public Person getPersonActualizar(String email) {
		Optional<Person> persona= personRepository.findByEmail(email);
		
		log.debug("Fin getproyecto: proyecto = {}", persona.get());
		return persona.get();
	}

	@Override
	public List<Person> searchPersonByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Person searchPersonByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
