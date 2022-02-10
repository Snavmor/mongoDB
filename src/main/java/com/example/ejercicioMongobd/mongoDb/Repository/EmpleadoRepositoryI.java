/**
 * 
 */
package com.example.ejercicioMongobd.mongoDb.Repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.example.ejercicioMongobd.mongoDb.models.Empleado;

/**
 * @author Usuario
 *
 *
 */

@Repository
public interface EmpleadoRepositoryI extends ReactiveMongoRepository<Empleado, String> {
	
	
	
	

}
