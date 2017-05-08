package com.concept.designpattern.algorithm.factory;

import com.concept.designpattern.algorithm.Algorithm;
import com.concept.designpattern.algorithm.impl.AdditonAlgorithm;
import com.concept.designpattern.algorithm.impl.DivisionAlgorithm;
import com.concept.designpattern.algorithm.impl.MultiplicationAlgorithm;
import com.concept.designpattern.algorithm.impl.SubtractionAlgorithm;

public enum AlgorithmModernFactory
{
	ADD("ADD")
	{

		@Override
		public Algorithm getAlgorithm()
		{
			return new AdditonAlgorithm();
		}

	},
	SUB("SUB")
	{

		@Override
		public Algorithm getAlgorithm()
		{
			return new SubtractionAlgorithm();
		}

	},
	MUL("MUL")
	{

		@Override
		public Algorithm getAlgorithm()
		{
			return new MultiplicationAlgorithm();
		}

	},
	DIV("DIV")
	{

		@Override
		public Algorithm getAlgorithm()
		{
			return new DivisionAlgorithm();
		}

	};

	private AlgorithmModernFactory(String type)
	{
		this.type = type;
	}

	private String type;

	public abstract Algorithm getAlgorithm();

	public String getType()
	{
		return type;
	}

	@Override
	public String toString()
	{
		return "TYPE CODE -> " + type;
	}
}
