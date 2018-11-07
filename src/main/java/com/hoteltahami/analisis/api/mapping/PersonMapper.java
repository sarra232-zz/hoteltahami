package com.hoteltahami.analisis.api.mapping;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.hoteltahami.analisis.api.dto.PersonDTO;
import com.hoteltahami.analisis.api.modelo.Person;
import com.hoteltahami.analisis.api.repositorio.PersonRepository;

public class PersonMapper {
	private final PersonRepository personRepository;
	
	public PersonMapper(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	public static PersonDTO asPersonDTO(Person personIn ) {
		PersonDTO activo = new PersonDTO();
		activo.setId(personIn.getId());
		activo.setName(personIn.getName());
		activo.setTypeDoc(personIn.getTypeDoc());
		activo.setEmail(personIn.getEmail());
		activo.setPassword(personIn.getPassword());
		return activo;	
	}
	
	// DTO metodo para la listar las personas registradas
	
	public static List<PersonDTO> ListAsPersonaDTO( List<Person> listPersonIn ) {
		
		List<PersonDTO> listActivo = new ArrayList<PersonDTO>();
		for(Person person  : listPersonIn) {
			listActivo.add(asPersonDTO(person));
		}
		
		return listActivo;	
	}
}
