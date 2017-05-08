package com.concept.designpattern.algorithm.factory;

import com.concept.designpattern.algorithm.Algorithm;
import com.concept.designpattern.algorithm.impl.AdditonAlgorithm;
import com.concept.designpattern.algorithm.impl.DivisionAlgorithm;
import com.concept.designpattern.algorithm.impl.MultiplicationAlgorithm;
import com.concept.designpattern.algorithm.impl.SubtractionAlgorithm;

public abstract class AlgorithmFactory
{
	public static Algorithm getAlgorithm(String type)
	{
		Algorithm algorithm = null;

		if(type.equals("ADD"))
		{
			algorithm = new AdditonAlgorithm();
		}
		else if(type.equals("SUB"))
		{
			algorithm = new SubtractionAlgorithm();
		}
		else if(type.equals("DIV"))
		{
			algorithm = new DivisionAlgorithm();
		}
		else if(type.equals("MUL"))
		{
			algorithm = new MultiplicationAlgorithm();
		}

		return algorithm;
	}
}
