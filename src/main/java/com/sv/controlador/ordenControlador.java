package com.sv.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sv.repositorio.InterfaceOrden;
import com.sv.entidades.orden;



@RestController
@RequestMapping("/order")
public class ordenControlador {
	
	@Autowired
	private InterfaceOrden interfaceOrden;
	
	@GetMapping
	public List<orden> orden()
	{
		
		return (List<orden>) interfaceOrden.findAll();
	}
	
	@PostMapping
	public void insertar(@RequestBody orden or)
	{
		interfaceOrden.save(or);
	}

	@PutMapping
	public void modificar(@RequestBody orden or)
	{
		interfaceOrden.save(or);
	}
}
