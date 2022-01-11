package com.karpeg.apicarros.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.karpeg.apicarros.entity.CarsEntity;
import com.karpeg.apicarros.entity.FactoriesEntity;
import com.karpeg.apicarros.repository.CarsRepository;
import com.karpeg.apicarros.repository.FactoriesRepository;

import lombok.SneakyThrows;

@Service
public class CarsService {

	@Autowired
	private CarsRepository repository;

	@Autowired
	private FactoriesRepository factoriesRepository;

	@SneakyThrows
	public ResponseEntity lerArquivo(MultipartFile file) {
		String[] linhas = new String(file.getBytes(), "UTF-8").split("\n");
		List<CarsEntity> carros = new ArrayList<>();

		for (int i = 1; i < linhas.length; i++) {
			String[] colunas = linhas[i].split(",");

			var cars = new CarsEntity();
			cars.setId(Long.valueOf(colunas[0]));
			cars.setModel(colunas[3]);
			cars.setYear(Integer.valueOf(colunas[4]));
			cars.setFuel(colunas[5]);
			cars.setDoors(Integer.valueOf(colunas[6]));
			cars.setCost(Double.valueOf(colunas[7]));
			cars.setColor(colunas[8]);

			var factory = new FactoriesEntity();
			factory.setId(Long.valueOf(colunas[1]));
			factory.setName(colunas[2]);

			cars.setFactory(factoriesRepository.save(factory));

			carros.add(cars);

		}

		return ResponseEntity.ok(repository.saveAll(carros));
	}

	public ResponseEntity listarTodos() {
		return ResponseEntity.ok(repository.findAll());
	}

}
