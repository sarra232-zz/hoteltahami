package com.hoteltahami.analisis.api.service;

import java.util.List;

import com.hoteltahami.analisis.api.modelo.Employed;

public interface EmployedService {
	public List<Employed> getEmployed();
	
	public List<Employed> searchEmployedByRol(String rol);
	
	public List<Employed> searchEmplyedById(String id);
	
	public List<Employed> searchEmployedByName(String name);
	
	public Employed searchEmployedByEmail(String email);
	
	public Employed addEmployed(Employed employed);
	
	public Employed updateEmployed(Employed employed);
		
	public Employed getEmployedUpdate(String email);
}
