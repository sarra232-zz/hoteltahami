package com.hoteltahami.analisis.api.controlador;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hoteltahami.analisis.api.dto.PersonDTO;
import com.hoteltahami.analisis.api.mapping.PersonMapper;
import com.hoteltahami.analisis.api.modelo.Person;
import com.hoteltahami.analisis.api.service.PersonService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@RestController
@RequestMapping("/persona")
public class PersonController {
	

	private static Logger log = LoggerFactory.getLogger(PersonController.class);
	
	private PersonService personaService;
	
	public PersonController(PersonService personService) {
		this.personaService = personService;
	}
	

	@GetMapping("listar")
	@ApiOperation(value = "Buscar todos", response = Page.class)
	@ApiResponses(value = {
            @ApiResponse(code = 200, message = "Los personas fueron buscadas", response = Page.class),
            @ApiResponse(code = 400, message = "La petición es invalida"),
            @ApiResponse(code = 500, message = "Error interno al procesar la respuesta")})
	public ResponseEntity<List<Person>> getPerson(){
		log.debug("REST request listar todos las personas");
		return ResponseEntity.ok(personaService.getPerson());		
	}
	
	@GetMapping(value = "buscar/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Consultar personas registradas", response = Page.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Personas registradas", response = Person.class),
            @ApiResponse(code = 400, message = "La petición es invalida"),
            @ApiResponse(code = 404, message = "Recurso no encontrado"),
            @ApiResponse(code = 500, message = "Error interno al procesar la respuesta")})
	public ResponseEntity<List<PersonDTO>> getPerson( @PathVariable("id") String id){
		 log.debug("REST request getProyecto estado : {}", id);
		return ResponseEntity.ok(PersonMapper.ListAsPersonaDTO(personaService.searchPersonById(id)));
	}
	
	@PostMapping(value = "crearPersona", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "crea una persona", response = Page.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Proyecto creado", response = Person.class),
            @ApiResponse(code = 400, message = "La petición es invalida"),
            @ApiResponse(code = 404, message = "Recurso no actualizado"),
            @ApiResponse(code = 500, message = "Error interno al procesar la respuesta")})
	public ResponseEntity<Person> addPerson( @RequestBody Person data){
		Person persona=new Person(data.getTypeDoc(), data.getId(), data.getName(), data.getLastname(),
										data.getEmail(), data.getAddress(), data.getSex(), data.getTelephone(),
										data.getPassword());
		personaService.addPerson(persona);
		return new ResponseEntity<Person>(persona, HttpStatus.OK);
	}
	@PutMapping(value = "actualizarPersona", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "actualizar persona", response = Page.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Datos actualizados", response = Person.class),
            @ApiResponse(code = 400, message = "La petición es invalida"),
            @ApiResponse(code = 404, message = "Recurso no actualizado"),
            @ApiResponse(code = 500, message = "Error interno al procesar la respuesta")})
	public ResponseEntity<Person> getProyectoActualizar(@RequestBody Person data ){
		Person persona=new Person(data.getTypeDoc(), data.getId(), data.getName(), data.getLastname(),
				data.getEmail(), data.getAddress(), data.getSex(), data.getTelephone(),
				data.getPassword());
		personaService.updatePerson(persona);
		return new ResponseEntity<Person>(persona, HttpStatus.OK);
	}
	
	@GetMapping(value = "consultar/{email}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Consultar proyecto por correo", response = Page.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "proyecto encontrado", response = Person.class),
            @ApiResponse(code = 400, message = "La petición es invalida"),
            @ApiResponse(code = 404, message = "Recurso no encontrado"),
            @ApiResponse(code = 500, message = "Error interno al procesar la respuesta")})
	public ResponseEntity<Person> searchPersonByEmail( @PathVariable("email") String email){
		 log.debug("REST request getPerson email : {}", email);
		return ResponseEntity.ok(personaService.searchPersonByEmail(email));
		
	}public void createPerson() {
		 
	}
}
