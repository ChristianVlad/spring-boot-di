package com.bolsaideas.springboot.di.app.models.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component("miServicioSimple")
public class MiServicio implements IService {
	
	@Override
	public String operacion() {
		return "ejecutando un proceso inmportante...";
	}
	

}
