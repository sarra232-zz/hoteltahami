package com.hoteltahami.analisis.api.controlador;
import java.util.List;
import java.util.Optional;

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

import com.hoteltahami.analisis.api.dto.ReservationDTO;
import com.hoteltahami.analisis.api.mapping.ReservationMapper;
import com.hoteltahami.analisis.api.modelo.Person;
import com.hoteltahami.analisis.api.modelo.Reservation;
import com.hoteltahami.analisis.api.service.ReservationService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@RestController
@RequestMapping("/reserva")
public class ReservationController {
private static Logger log = LoggerFactory.getLogger(ReservationController.class);
	
	private ReservationService ReservationService;
	
	public ReservationController(ReservationService reservationService) {
		this.ReservationService = reservationService;
	}
	

	@GetMapping("listar")
	@ApiOperation(value = "Buscar todos", response = Page.class)
	@ApiResponses(value = {
            @ApiResponse(code = 200, message = "Los personas fueron buscadas", response = Page.class),
            @ApiResponse(code = 400, message = "La petición es invalida"),
            @ApiResponse(code = 500, message = "Error interno al procesar la respuesta")})
	public ResponseEntity<List<Reservation>> getReservation(){
		log.debug("REST request listar todos las personas");
		return ResponseEntity.ok(ReservationService.getReservation());		
	}
	
	@GetMapping(value = "buscar/{client}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Consultar personas registradas", response = Page.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Personas registradas", response = Reservation.class),
            @ApiResponse(code = 400, message = "La petición es invalida"),
            @ApiResponse(code = 404, message = "Recurso no encontrado"),
            @ApiResponse(code = 500, message = "Error interno al procesar la respuesta")})
	public ResponseEntity<ReservationDTO> getPerson( @PathVariable("client") String client){
		 log.debug("REST request getProyecto estado : {}", client);
		return ResponseEntity.ok(ReservationMapper.asReservationDTO(ReservationService.searchReservationByClient(client)));
	}
	
	@PostMapping(value = "crearReserva", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "crea una persona", response = Page.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Reserva creada", response = Reservation.class),
            @ApiResponse(code = 400, message = "La petición es invalida"),
            @ApiResponse(code = 404, message = "Recurso no actualizado"),
            @ApiResponse(code = 500, message = "Error interno al procesar la respuesta")})
	public ResponseEntity<Reservation> addPerson( @RequestBody Reservation data){
		Reservation reservation=new Reservation();
		ReservationService.addReservation(reservation);
		return new ResponseEntity<Reservation>(reservation, HttpStatus.OK);
	}
	@PutMapping(value = "actualizarReserva", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "actualizar persona", response = Page.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Datos actualizados", response = Reservation.class),
            @ApiResponse(code = 400, message = "La petición es invalida"),
            @ApiResponse(code = 404, message = "Recurso no actualizado"),
            @ApiResponse(code = 500, message = "Error interno al procesar la respuesta")})
	public ResponseEntity<Reservation> getReservation(@RequestBody Person data ){
		Reservation reservation=new Reservation();
		ReservationService.updateReservation(reservation);
		return new ResponseEntity<Reservation>(reservation, HttpStatus.OK);
	}
	
	@GetMapping(value = "consultar/{code}", produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Consultar proyecto por correo", response = Page.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "proyecto encontrado", response = Reservation.class),
            @ApiResponse(code = 400, message = "La petición es invalida"),
            @ApiResponse(code = 404, message = "Recurso no encontrado"),
            @ApiResponse(code = 500, message = "Error interno al procesar la respuesta")})
	public ResponseEntity<Optional<Reservation>> searchReservationByCode( @PathVariable("code") String code){
		 log.debug("REST request getReservation code : {}", code);
		return ResponseEntity.ok(ReservationService.searchReservationByCode(code));
		
	}public void createReservation() {
		 
	}
}
