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

import com.valtx.model.Sucursal;
import com.valtx.model.Usuario;
import com.valtx.service.SucursalService;

@RestController
@RequestMapping("/sucursales/")
public class SucursalREST {
	
	@Autowired
	private SucursalService sucursalService;
	
	@GetMapping
	private ResponseEntity<List<Sucursal>> getAllSucursales(){
		return ResponseEntity.ok(sucursalService.findAll());
	} 
	
	@PostMapping
	private ResponseEntity<Sucursal> save(@RequestBody Sucursal sucursal){
		try {
			Sucursal sucursalSave=sucursalService.save(sucursal);
			return ResponseEntity.created(new URI("/sucursales/"+sucursalSave.getCod_sucursal())).body(sucursalSave);
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		
	}
	
	@DeleteMapping (value = "delete/{cod_sucursal}")
	private ResponseEntity<Boolean> deleteSucursal (@PathVariable ("cod_sucursal") Long cod_sucursal){
		sucursalService.deleteById(cod_sucursal);
		return ResponseEntity.ok(!(sucursalService.findById(cod_sucursal)!=null));
		
	}

}
