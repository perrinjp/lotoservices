package com.perrinjp.repositories;

import org.springframework.stereotype.Component;

import com.perrinjp.services.LotoGenerator;

@Component
public class LotoRepository {

	public LotoGenerator generateDraw(String drawType, Long id) {
		
		return  new LotoGenerator().calculerLoto(drawType, id.intValue());
	}

}
