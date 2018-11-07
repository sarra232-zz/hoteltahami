package com.hoteltahami.analisis.api.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


import com.hoteltahami.analisis.api.modelo.Employed;
import com.hoteltahami.analisis.api.repositorio.EmployedRepository;
import com.hoteltahami.analisis.api.service.EmployedService;
import com.hoteltahami.analisis.api.service.util.Messages;


@Service
//@Qualifier(EmpleadoServiceImpl);
public class EmployedServiceImpl implements EmployedService {

private final Logger log = LoggerFactory.getLogger(EmployedServiceImpl.class);
	
	private Messages messages;
	private final EmployedRepository employedRepository;
	
	public EmployedServiceImpl(EmployedRepository employedRepository, Messages messages) {
		this.employedRepository = employedRepository;
		this.messages = messages;
	}
	
	@Override
	public List<Employed> getEmployed(){
		log.debug("Inicio getPerson");
		List<Employed> empleado= employedRepository.findAll();
		log.debug("Fin getProyectos");
		return empleado;
	}
	
	@Override
	public Employed addEmployed(Employed persona) {
		log.debug("Inicio addProyectos: id = {}", persona);
		return employedRepository.save(persona);
	}
	
	@Override
	public Employed updateEmployed(Employed newPerson) {
		log.debug("Inicio updateProyecto: id = {}", newPerson);
		return employedRepository.save(newPerson);
	}
	
	@Override
	public Employed getEmployedUpdate(String email) {
		Optional<Employed> empleado= employedRepository.findByEmail(email);
		
		log.debug("Fin getproyecto: proyecto = {}", empleado.get());
		return empleado.get();
	}

	@Override
	public List<Employed> searchEmployedByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employed searchEmployedByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employed> searchEmplyedById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employed> searchEmployedByRol(String rol) {
		// TODO Auto-generated method stub
		return null;
	}
}
