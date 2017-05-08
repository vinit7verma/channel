package com.concept.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.concept.model.Validator;

@RestController
@RequestMapping("/spring")
public class SpringConceptController {
	@Autowired
	Validator validator;

	private static final String BLANK_STRING = "";

	@RequestMapping(method = RequestMethod.POST)
	public String create(@RequestBody String course) throws Exception {
		return BLANK_STRING;
	}

	@RequestMapping(method = RequestMethod.GET, value = "{id}")
	public String get(@PathVariable String id) throws Exception {
		System.out.println("Without lookup - " + validator);
		System.out.println("With lookup - " + getValidator());
		return BLANK_STRING;
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "{id}")
	public void delete(@PathVariable String id) throws Exception {
	}

	@Lookup
	public Validator getValidator() {
		// Spring will overide this method and gives the bean validator from the
		// context;
		return null;
	}
}
