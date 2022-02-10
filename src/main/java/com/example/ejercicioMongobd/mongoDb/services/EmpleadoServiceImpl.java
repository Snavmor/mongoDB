package com.example.ejercicioMongobd.mongoDb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ejercicioMongobd.mongoDb.Repository.EmpleadoRepositoryI;
import com.example.ejercicioMongobd.mongoDb.models.Empleado;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class EmpleadoServiceImpl implements EmpleadoServiceI {

	
	@Autowired
	private EmpleadoRepositoryI EmpleadoRepositoryI;

	@SuppressWarnings("unchecked")
	@Override
	public Mono<Empleado> crear(Empleado emp) {
		// TODO Auto-generated method stub
		return EmpleadoRepositoryI.save(emp);
	}

	@Override
	public void eliminar() {
		
		
	}

	@Override
	public Flux<Empleado> leer() {
		// TODO Auto-generated method stub
		return EmpleadoRepositoryI.findAll();
	}
	
	


}
