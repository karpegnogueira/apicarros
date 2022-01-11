package com.karpeg.apicarros.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.karpeg.apicarros.service.CarsService;

@RestController
@RequestMapping(path = "cars")
public class CarsController {
	
	@Autowired
	private CarsService service;
	
	@PostMapping
	public ResponseEntity lerArquivo(@RequestParam MultipartFile file) {
		return service.lerArquivo(file);
	}
	
	@GetMapping
	public ResponseEntity listarTodos() {
		return service.listarTodos();
	}
	
}
