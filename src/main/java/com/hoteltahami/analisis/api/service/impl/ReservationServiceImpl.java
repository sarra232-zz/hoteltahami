package com.hoteltahami.analisis.api.service.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.hoteltahami.analisis.api.modelo.Reservation;
import com.hoteltahami.analisis.api.repositorio.ReservationRepository;
import com.hoteltahami.analisis.api.service.ReservationService;
import com.hoteltahami.analisis.api.service.util.Messages;

@Service
//@Qualifier(PersonaServiceImpl);
public class ReservationServiceImpl implements ReservationService {

	
	private final Logger log = LoggerFactory.getLogger(ReservationServiceImpl.class);
	private Messages messages;
	private final ReservationRepository reservationRepository;
	
	public ReservationServiceImpl(ReservationRepository reservationRepository, Messages messages) {
		this.reservationRepository = reservationRepository;
		this.messages = messages;
	}
	
	@Override
	public List<Reservation> getReservation() {
		log.debug("Inicio getPerson");
		List<Reservation> reservation= reservationRepository.findAll();
		log.debug("Fin getReserva");
		return reservation;
	}
	
	@Override
	public Reservation searchReservationByClient(String client) {
		log.debug("Inicio getReserva por cliente");
		Reservation reservation= reservationRepository.findByClient(client);
		log.debug("Fin getReserva");
		return reservation;
	}

	@Override
	public Optional<Reservation> searchReservationByCode(String code) {
		log.debug("Inicio getReserva por cliente");
		Optional<Reservation> reservation= reservationRepository.findById(code);
		log.debug("Fin getReserva");
		return reservation;
	}

	@Override
	public Reservation addReservation(Reservation reservation) {
		log.debug("Inicio addProyectos: id = {}", reservation);
		return reservationRepository.save(reservation);
	}

	@Override
	public Reservation updateReservation(Reservation newReservation) {
		log.debug("Inicio updateProyecto: id = {}", newReservation);
		return reservationRepository.save(newReservation);
	}

	@Override
	public Reservation getReservationUpdate(String code) {
		// TODO Auto-generated method stub
		return null;
	}

}
