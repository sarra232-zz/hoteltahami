package com.hoteltahami.analisis.api.service;

import java.util.List;
import java.util.Optional;

import com.hoteltahami.analisis.api.modelo.Reservation;

public interface ReservationService {
	
	public List<Reservation> getReservation();
	
	public Reservation searchReservationByClient(String client);
	
	public Optional<Reservation> searchReservationByCode(String code);
	
	public Reservation addReservation(Reservation reservation);
	
	public Reservation updateReservation(Reservation reservation);
		
	public Reservation getReservationUpdate(String code);
}
