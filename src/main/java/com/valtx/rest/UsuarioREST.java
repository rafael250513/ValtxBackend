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

import com.valtx.model.Usuario;
import com.valtx.service.UsuarioService;

@RestController
@RequestMapping("/usuarios/")
public class UsuarioREST {

		
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("{cod_sucursal}")
	private ResponseEntity<List<Usuario>> getAllUsuariosBySucursal(@PathVariable("cod_sucursal") Long cod_sucursal){
		return ResponseEntity.ok(usuarioService.findAllBySucursal(cod_sucursal));
		
	} 
	
	@GetMapping
	private ResponseEntity<List<Usuario>> getAllUsuarios(){
		return ResponseEntity.ok(usuarioService.findAll());
	} 
	
	@PostMapping
	private ResponseEntity<Usuario> saveUsuario(@RequestBody Usuario usuario){
		try {
			Usuario usuarioSave=usuarioService.save(usuario);
			return ResponseEntity.created(new URI("/usuarios/"+usuarioSave.getCod_usuario())).body(usuarioSave);
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
		
	}
	
	@DeleteMapping (value = "delete/{cod_usuario}")
	private ResponseEntity<Boolean> deletePersona (@PathVariable ("cod_usuario") Long cod_usuario){
		usuarioService.deleteById(cod_usuario);
		return ResponseEntity.ok(!(usuarioService.findById(cod_usuario)!=null));
		
	}
	
}
