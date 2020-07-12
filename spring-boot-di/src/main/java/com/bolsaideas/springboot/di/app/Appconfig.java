package com.bolsaideas.springboot.di.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.bolsaideas.springboot.di.app.models.domain.ItemFactura;
import com.bolsaideas.springboot.di.app.models.domain.Producto;
import com.bolsaideas.springboot.di.app.models.service.IService;
import com.bolsaideas.springboot.di.app.models.service.MiServicio;
import com.bolsaideas.springboot.di.app.models.service.MiServicioComplejo;

@Configuration 
public class Appconfig {
	
	
	@Bean("miServicioSimple")
	@Primary
	public IService registrarMiServicio() {
		return new MiServicio();	
	}
	

	//@Bean("miServiciocomplejo")
	public IService registrarMiServicioComplejo() {
		return new MiServicioComplejo();
}
	
	@Bean("itemsFactura")
	public List<ItemFactura> registrarItems(){
		Producto producto1 = new Producto("Camara Sony", 100);
		Producto producto2 = new Producto("Celular", 200);
		
		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 4);
		
		return Arrays.asList(linea1,linea2);
	}
	
}