package com.sv.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sv.entidades.orden;


@Repository
public interface InterfaceOrden extends CrudRepository<orden, Integer>{

}
