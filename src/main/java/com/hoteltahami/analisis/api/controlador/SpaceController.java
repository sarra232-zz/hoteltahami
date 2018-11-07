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
import com.hoteltahami.analisis.api.dto.SpaceDTO;
import com.hoteltahami.analisis.api.mapping.PersonMapper;
import com.hoteltahami.analisis.api.mapping.SpaceMapper;
import com.hoteltahami.analisis.api.modelo.Person;
import com.hoteltahami.analisis.api.modelo.Space;
import com.hoteltahami.analisis.api.service.PersonService;
import com.hoteltahami.analisis.api.service.SpaceService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@RestController
@RequestMapping("/espacio")
public class SpaceController {
private static Logger log = LoggerFactory.getLogger(SpaceController.class);
	
	private SpaceService spaceService;
	
	public SpaceController(SpaceService spaceService) {
		this.spaceService = spaceService;
	}
	

	@GetMapping("listar")
	@ApiOperation(value = "Buscar todos", response = Page.class)
	@ApiResponses(value = {
            @ApiResponse(code = 200, message = "Los personas fueron buscadas", response = Space.class),
            @ApiResponse(code = 400, message = "La petición es invalida"),
            @ApiResponse(code = 500, message = "Error interno al procesar la respuesta")})
	public ResponseEntity<List<Space>> getSpace(){
		log.debug("REST request listar todos las personas");
		return ResponseEntity.ok(spaceService.getSpace());		
	}
	
	@GetMapping(value = "buscar/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Consultar personas registradas", response = Page.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Personas registradas", response = Space.class),
            @ApiResponse(code = 400, message = "La petición es invalida"),
            @ApiResponse(code = 404, message = "Recurso no encontrado"),
            @ApiResponse(code = 500, message = "Error interno al procesar la respuesta")})
	public ResponseEntity<SpaceDTO> getSpace( @PathVariable("code") String code){
		 log.debug("REST request getProyecto estado : {}", code);
		return ResponseEntity.ok(SpaceMapper.asSpaceDTO(spaceService.searchSpaceByCode(code)));
	}
	
	@PostMapping(value = "crearPersona", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "crea una persona", response = Page.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Proyecto creado", response = Space.class),
            @ApiResponse(code = 400, message = "La petición es invalida"),
            @ApiResponse(code = 404, message = "Recurso no actualizado"),
            @ApiResponse(code = 500, message = "Error interno al procesar la respuesta")})
	public ResponseEntity<Space> addSpace( @RequestBody Space data){
		Space space=new Space();
		spaceService.addSpace(space);
		return new ResponseEntity<Space>(space, HttpStatus.OK);
	}
	@PutMapping(value = "actualizarPersona", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "actualizar persona", response = Page.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Datos actualizados", response = Space.class),
            @ApiResponse(code = 400, message = "La petición es invalida"),
            @ApiResponse(code = 404, message = "Recurso no actualizado"),
            @ApiResponse(code = 500, message = "Error interno al procesar la respuesta")})
	public ResponseEntity<Space> getSpaceUddate(@RequestBody Space data ){
		Space space=new Space();
		spaceService.updateSpace(space);
		return new ResponseEntity<Space>(space, HttpStatus.OK);
	}
	
	@GetMapping(value = "consultar/{email}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Consultar proyecto por correo", response = Page.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "proyecto encontrado", response = Person.class),
            @ApiResponse(code = 400, message = "La petición es invalida"),
            @ApiResponse(code = 404, message = "Recurso no encontrado"),
            @ApiResponse(code = 500, message = "Error interno al procesar la respuesta")})
	public ResponseEntity<List<Space>> searchSpaceByStatus( @PathVariable("status") String status){
		 log.debug("REST request getPerson email : {}", status);
		return ResponseEntity.ok(SpaceService.searchSpaceByStatus(status));
		
	}public void createPerson() {
		 
	}
}
