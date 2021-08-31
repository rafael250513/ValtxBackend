package com.valtx.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valtx.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto,Long>{

}
