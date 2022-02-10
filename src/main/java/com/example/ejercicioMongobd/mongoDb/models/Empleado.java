package com.example.ejercicioMongobd.mongoDb.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;
@Document (collection = "Empleado")
@Data
@Builder

public class Empleado {
	
	@Id
	private String id;
	private String nombre;

}
