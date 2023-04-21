package com.parcialEmpresariales.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.parcialEmpresariales.app.entity.Estudiante;

public interface estudianteRepository extends MongoRepository<Estudiante, String> {

}
