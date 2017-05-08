package com.concept.designpattern.algorithm;

public interface SpringAlgorithm
{

	/**
	 * Method to get the Decryption Algorithm type.
	 *
	 * @return String
	 */
	String getAlgorithmType();
	/**
	 * Method to get the Decryption Algorithm type.
	 *
	 * @param a
	 * @param b
	 * @return int
	 */
	int applyAlgorithm(int a, int b);
}
