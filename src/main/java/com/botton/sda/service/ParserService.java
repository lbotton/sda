package com.botton.sda.service;

import com.botton.sda.entity.ParserLineDTO;

public class ParserService {
	
	public ParserLineDTO parseLine(String currentLine, EntityFactory ef) {
		ParserLineDTO p = new ParserLineDTO(currentLine);
		return ef.create(p);
		
	}

}
