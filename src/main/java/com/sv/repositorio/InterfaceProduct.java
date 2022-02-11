package com.sv.repositorio;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sv.entidades.productos;


@Repository

public interface InterfaceProduct extends CrudRepository<productos, Integer> {

}
