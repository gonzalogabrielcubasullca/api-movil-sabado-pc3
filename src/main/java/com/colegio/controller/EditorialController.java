package com.colegio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.colegio.entity.Editorial;
import com.colegio.service.EditorialService;

@RestController
@RequestMapping("api/rest/editorial")
public class EditorialController {
	
	@Autowired
	private EditorialService service;
	
	@GetMapping("/porNombre/{filtro}")
	public ResponseEntity<List<Editorial>> listaPorNombre(@PathVariable("filtro") String fil){
		return ResponseEntity.ok(service.listarPorNombre(fil+"%"));
	}
}
