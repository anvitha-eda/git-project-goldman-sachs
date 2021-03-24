package com.example.project.binaryconversion.service;

import org.springframework.stereotype.Service;
@Service
public class BinaryConverterServiceImpl implements BinaryConverterService{
	
	
	public String binaryConversion(String inputStr) {
		return  Integer.toBinaryString(Integer.parseInt(inputStr));
	}

}
