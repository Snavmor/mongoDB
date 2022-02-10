/**
 * 
 */
package com.example.ejercicioMongobd.mongoDb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.ejercicioMongobd.mongoDb.models.Empleado;
import com.example.ejercicioMongobd.mongoDb.services.EmpleadoServiceI;

import reactor.core.publisher.Flux;

/**
 * @author Usuario
 *
 */

@RestController
public class EmpleadoController {

	@Autowired
	private EmpleadoServiceI empleadoServiceImpl;

	
	
	@PostMapping("/empleado/crear")
	@ResponseStatus(HttpStatus.CREATED)
	public void CrearEmpleado() {
		
		empleadoServiceImpl.crear(Empleado.builder().nombre("Sergio").build());

	}

	@GetMapping(value = "/empleado/leer", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	@ResponseBody
	public Flux<Empleado> findAll() {
		return empleadoServiceImpl.leer();
	}

}
