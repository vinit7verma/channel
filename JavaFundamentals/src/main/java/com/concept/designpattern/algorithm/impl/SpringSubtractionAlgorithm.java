package com.concept.designpattern.algorithm.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.concept.designpattern.algorithm.SpringAlgorithm;
import com.concept.model.Validator;

@Component
public class SpringSubtractionAlgorithm implements SpringAlgorithm
{
	@Autowired
	private Validator validator;

	@Override
	public String getAlgorithmType() {
		return "SUBTRACTION";
	}

	@Override
	public int applyAlgorithm(int a, int b)
	{
		return a - b;
	}

}
