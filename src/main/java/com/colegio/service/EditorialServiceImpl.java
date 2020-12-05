package com.colegio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.colegio.entity.Editorial;
import com.colegio.repository.EditorialRepository;

@Service
public class EditorialServiceImpl implements EditorialService{
	
	@Autowired
	private EditorialRepository repository;

	@Override
	public List<Editorial> listarTodos() {
		return repository.findAll();
	}

	@Override
	public List<Editorial> listarPorNombre(String filtro) {
		return repository.listaPorNombre(filtro);
	}

}
