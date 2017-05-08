package com.concept.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.concept.designpattern.algorithm.factory.SpringAlgorithmFactory;
import com.concept.model.Validator;

@RestController
public class SpringConceptController {

	@Autowired
	private SpringAlgorithmFactory algorithmFactory;

	@Autowired
	Validator validator;

	@RequestMapping(method = RequestMethod.POST)
	public void create(@RequestBody String course) throws Exception {
	}

	@RequestMapping(value = "/spring/lookup", method = RequestMethod.GET)
	public void springLookUpMethod() throws Exception {

		// Spring look up method testing
		System.out.println("Without lookup - " + validator);
		System.out.println("With lookup - " + getValidator());
	}

	@RequestMapping(value = "/spring/factory", method = RequestMethod.GET)
	public void springBeanFactoryPattern() throws Exception {

		// Spring managed bean factory design pattern testing
		System.out.println("Addition is - " + algorithmFactory.getAlgorithm("ADDITION").applyAlgorithm(8, 7));
		System.out.println("Subtraction is - " + algorithmFactory.getAlgorithm("SUBTRACTION").applyAlgorithm(8, 7));
	}

	@Lookup
	public Validator getValidator() {
		// Spring will override this method and gives the bean validator from
		// the context;
		return null;
	}
}
