package com.sv.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sv.repositorio.InterfaceProduct;
import com.sv.entidades.productos;



@RestController
@RequestMapping("/product")
public class ordenProduct {
	@Autowired
	private InterfaceProduct interfaceProduct;
	
	@GetMapping
	public List<productos> productos()
	{
		
		return (List<productos>) interfaceProduct.findAll();
	}
	@PostMapping
	public void insertar(@RequestBody productos pr)
	{
		interfaceProduct.save(pr);
	}
	
	@PutMapping
	public void modificar(@RequestBody productos pr)
	{
		interfaceProduct.save(pr);
	}
	
	@DeleteMapping(value="/{id}")
	public void eliminar(@PathVariable("id") Integer id)
	{
		interfaceProduct.deleteById(id);
	}

}
