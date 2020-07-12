package com.bolsaideas.springboot.di.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bolsaideas.springboot.di.app.models.service.IService;
import com.bolsaideas.springboot.di.app.models.service.MiServicio;

@Configuration 
public class Appconfig {
	
	
	@Bean("miServicioSimple")
	public IService registrarMiServicio() {
		return new MiServicio();
		
	}

}
