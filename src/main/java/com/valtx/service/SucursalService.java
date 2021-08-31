package com.valtx.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.valtx.model.Sucursal;
import com.valtx.repository.SucursalRepository;

@Service
public class SucursalService implements SucursalRepository {

	@Autowired
	private SucursalRepository sucursalRepository;

	@Override
	public List<Sucursal> findAll() {
		return sucursalRepository.findAll();
	}

	@Override
	public List<Sucursal> findAll(Sort sort) {
		return sucursalRepository.findAll(sort);
	}

	@Override
	public List<Sucursal> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Sucursal> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Sucursal> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Sucursal> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Sucursal> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Sucursal getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Sucursal getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Sucursal> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Sucursal> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Sucursal> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Sucursal> S save(S entity) {
		return sucursalRepository.save(entity);
	}

	@Override
	public Optional<Sucursal> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Long id) {
		sucursalRepository.deleteById(id);
		
	}

	@Override
	public void delete(Sucursal entity) {
		sucursalRepository.delete(entity);
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Sucursal> entities) {
		sucursalRepository.deleteAll(entities);
		
	}

	@Override
	public void deleteAll() {
		sucursalRepository.deleteAll();
		
	}

	@Override
	public <S extends Sucursal> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Sucursal> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Sucursal> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Sucursal> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
