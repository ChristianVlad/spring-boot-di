package com.bolsaideas.springboot.di.app.models.service;

import org.springframework.stereotype.Component;

@Component("miServicioSimple")
public class MiServicio implements IService {
	
	@Override
	public String operacion() {
		return "ejecutando un proceso inmportante...";
	}
	

}
