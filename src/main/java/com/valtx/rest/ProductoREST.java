package com.valtx.rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.valtx.model.Producto;
import com.valtx.model.Sucursal;
import com.valtx.service.ProductoService;
import com.valtx.service.SucursalService;

@RestController
@RequestMapping("/productos/")
public class ProductoREST {
	
	@Autowired
	private ProductoService productoService;
	
	@GetMapping
	private ResponseEntity<List<Producto>> getAllProductos(){
		return ResponseEntity.ok(productoService.findAll());
		
	} 

	
	@PostMapping
	private ResponseEntity<Producto> save(@RequestBody Producto producto){
		try {
			Producto productoSave=productoService.save(producto);
			return ResponseEntity.created(new URI("/productos/"+productoSave.getCod_producto())).body(productoSave);
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		
	}
	
	@DeleteMapping (value = "delete/{cod_producto}")
	private ResponseEntity<Boolean> deleteProducto (@PathVariable ("cod_producto") Long cod_producto){
		productoService.deleteById(cod_producto);
		return ResponseEntity.ok(!(productoService.findById(cod_producto)!=null));
		
	}

}
