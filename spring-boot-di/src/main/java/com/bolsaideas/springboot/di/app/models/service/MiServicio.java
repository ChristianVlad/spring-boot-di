package com.bolsaideas.springboot.di.app.models.service;


//@Primary
//@Component("miServicioSimple")
public class MiServicio implements IService {
	
	
	public String operacion() {
		return "ejecutando un proceso simple...";
	}
	

}
