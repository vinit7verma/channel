package com.concept.designpattern.algorithm.factory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.concept.designpattern.algorithm.SpringAlgorithm;

/**
 * AlgorithmFactory for creating the algorithm instance depending upon algorithm
 * type.
 *
 * @author vinit.verma
 */

@Service
public class SpringAlgorithmFactory {

	/** The algorithms. */
	@Autowired
	private List<SpringAlgorithm> algorithms;

	/** The algorithms cache. */
	private final Map<String, SpringAlgorithm> algorithmsCache = new HashMap<>();

	/**
	 * Inits the my service cache.
	 */
	@PostConstruct
	public void initMyServiceCache() {
		for (SpringAlgorithm algorithm : algorithms) {
			algorithmsCache.put(algorithm.getAlgorithmType(), algorithm);
		}
	}

	/**
	 * Factory method to get the algorithm instance depending upon algorithm
	 * type.
	 *
	 * @param algorithmType
	 *            the algorithm type
	 * @return Algorithm
	 * @throws PlatformException
	 *             the platform exception
	 */
	public SpringAlgorithm getAlgorithm(String algorithmType) throws Exception {
		SpringAlgorithm algorithm = algorithmsCache.get(algorithmType);
		if (null == algorithm) {
			throw new IllegalArgumentException("No algorithm found for this name.");
		}
		return algorithm;
	}
}