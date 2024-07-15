package com.perrinjp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.perrinjp.repositories.LotoRepository;
import com.perrinjp.services.LotoGenerator;




@RestController
public class LotoController {
	
	@Autowired
	private final LotoRepository repository;
	
	public LotoController(LotoRepository repository)
	{
		this.repository = repository;
	}
	
	@GetMapping("/api/draw/649/{id}")
	LotoGenerator get649(@PathVariable Long id) {

		LotoGenerator loto = repository.generateDraw("649",id);
		
		return loto;
	}
	
	@GetMapping("/api/draw/lotomax/{id}")
	LotoGenerator getLotoMax(@PathVariable Long id) {

		LotoGenerator loto = repository.generateDraw("lotoMax",id);
		
		return loto;
	}

}
