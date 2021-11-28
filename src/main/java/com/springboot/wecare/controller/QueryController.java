package com.springboot.wecare.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.springboot.wecare.model.Query;
import com.springboot.wecare.service.IqueryService;

@RestController
public class QueryController {

	@Autowired
	IqueryService queryService;

	@GetMapping("/allQueries")
	public List<Query> getAllQueries() {
		System.out.println("Get all data..");

		return queryService.getAll();
	}

	@CrossOrigin
	@PostMapping("/addQuery")
	public String addQuery(@RequestBody @Valid Query query) {
		String contact = queryService.addQuery(query);
		return contact;
	}

	@CrossOrigin
	@PutMapping("/updateQuery")
	public String updateQuery(@RequestBody @Valid Query query) {
		String response = queryService.updateQuery(query);
		return response;
	}

	@CrossOrigin
	@DeleteMapping("/deleteQuery")
	public String deleteQuery(@RequestParam Long QueryID) {
		String response = queryService.deleteQuery(QueryID);
		return response;
	}
}