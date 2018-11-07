package com.hoteltahami.analisis.api.repositorio;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hoteltahami.analisis.api.modelo.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, String> {
	
	public  List<Reservation> findAllById(String code);
	
	public Optional<Reservation> findBySpace(String space);
	
	public Reservation findByClient(String client);

	public List<Reservation> findAll();

}
