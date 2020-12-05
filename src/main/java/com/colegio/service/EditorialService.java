package com.colegio.service;

import java.util.List;

import com.colegio.entity.Editorial;

public interface EditorialService {
	public List<Editorial> listarTodos();
	public List<Editorial> listarPorNombre(String filtro);
	
}
