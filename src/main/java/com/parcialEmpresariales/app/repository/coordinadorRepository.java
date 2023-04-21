package com.parcialEmpresariales.app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.parcialEmpresariales.app.entity.Coordinador;

public interface coordinadorRepository extends MongoRepository<Coordinador, String> {

}
