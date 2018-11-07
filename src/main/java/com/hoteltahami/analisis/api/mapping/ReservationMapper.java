package com.hoteltahami.analisis.api.mapping;

import java.util.ArrayList;
import java.util.List;

import com.hoteltahami.analisis.api.modelo.Reservation;
import com.hoteltahami.analisis.api.dto.ReservationDTO;
import com.hoteltahami.analisis.api.repositorio.ReservationRepository;

public class ReservationMapper {
	
private final ReservationRepository reservationRepository;
	
	public ReservationMapper(ReservationRepository reservationRepository) {
		this.reservationRepository = reservationRepository;
	}
	
	public static ReservationDTO asReservationDTO(Reservation reservationIn ) {
		ReservationDTO activo = new ReservationDTO();
		activo.setCode(reservationIn.getCode());
		activo.setClient(reservationIn.getClient());
		activo.setSpace(reservationIn.getSpice());
		activo.setStatus(reservationIn.getStatus());
		activo.setDateentry(reservationIn.getDateentry());
		activo.setDateout(reservationIn.getDateout());
		return activo;	
	}
	
	
	
	public static List<ReservationDTO> ListAsPersonaDTO( List<Reservation> reservationIn ) {
		
		List<ReservationDTO> listActivo = new ArrayList<ReservationDTO>();
		for(Reservation reservation  : reservationIn) {
			listActivo.add(asReservationDTO(reservation));
		}
		
		return listActivo;	
	}
}
