package com.example.ejercicioMongobd.mongoDb.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.ejercicioMongobd.mongoDb.models.Empleado;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public interface EmpleadoServiceI {
	
	Mono<Empleado> crear(Empleado emp);
	void eliminar();
	Flux<Empleado> leer();

}
