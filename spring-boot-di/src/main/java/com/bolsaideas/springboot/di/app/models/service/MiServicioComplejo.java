package com.bolsaideas.springboot.di.app.models.service;

import org.springframework.stereotype.Component;


//@Component("miServicioComplejo")
public class MiServicioComplejo implements IService {
	
	@Override
	public String operacion() {
		return "ejecutando un proceso inmportante o algo asi...";
	}
	

}
