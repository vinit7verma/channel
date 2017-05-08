package com.concept.designpattern.algorithm.test;

import java.util.HashMap;
import java.util.Map;

import com.concept.designpattern.algorithm.factory.AlgorithmModernFactory;

public class AlgorithmApplyTest
{

	static Map<String, AlgorithmModernFactory> typeMap = new HashMap<>();
	static
	{
		typeMap.put("ADD", AlgorithmModernFactory.ADD);
		typeMap.put("DIV", AlgorithmModernFactory.DIV);
		typeMap.put("MUL", AlgorithmModernFactory.MUL);
		typeMap.put("SUB", AlgorithmModernFactory.SUB);
	}

	public static void main(String[] args)
	{
		String type = "MUL";
		long startTime = System.nanoTime();

		// Traditional approach
		// int result = AlgorithmFactory.getAlgorithm(type).applyAlgorithm(3, 4);

		// Modern Approach
		int result = typeMap.get(type).getAlgorithm().applyAlgorithm(3, 4);

		System.out.println("Result ::: " + result);
		long endTime = System.nanoTime();
		System.out.println("Time difference ::: " + (endTime - startTime) + " nano seconds");
	}
}
