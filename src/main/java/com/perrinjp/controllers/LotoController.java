package com.perrinjp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.EntityModel;
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
	EntityModel<LotoGenerator> get649(@PathVariable Long id) {

		LotoGenerator loto = repository.generateDraw("649",id);
		
		return new EntityModel<LotoGenerator>(loto);
	}
	
	@GetMapping("/api/draw/lotomax/{id}")
	EntityModel<LotoGenerator> getLotoMax(@PathVariable Long id) {

		LotoGenerator loto = repository.generateDraw("lotoMax",id);
		
		return new EntityModel<LotoGenerator>(loto);
	}

}
