package com.hoteltahami.analisis.api.service;
import java.util.List;

import com.hoteltahami.analisis.api.modelo.Person;

public interface PersonService {
	
	public List<Person> getPerson();
	
	public List<Person> searchPersonById(String id);
		
	public List<Person> searchPersonByName(String name);
	
	public Person searchPersonByEmail(String email);
	
	public Person addPerson(Person persona);
	
	public Person updatePerson(Person persona);
		
	public Person getPersonActualizar(String email);
}
