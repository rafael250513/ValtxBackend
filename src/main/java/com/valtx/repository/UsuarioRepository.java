package com.valtx.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valtx.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

}
