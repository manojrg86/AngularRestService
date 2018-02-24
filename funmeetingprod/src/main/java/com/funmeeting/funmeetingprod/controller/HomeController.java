package com.funmeeting.funmeetingprod.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.funmeeting.funmeetingprod.document.Home;
import com.funmeeting.funmeetingprod.repository.HomeRepository;

@RestController
@RequestMapping("/api/home")
public class HomeController {

	@Autowired
	HomeRepository homeRepository;
	
	@RequestMapping(value = "/create",method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Home home) {
		homeRepository.save(home);
    }
	
	@GetMapping("/all")
    public List<Home> getAll() {
        return homeRepository.findAll();
    }
	
    @RequestMapping(value = "/{id}") 
    public Home read(@PathVariable String id) {
        return homeRepository.findOne(id);
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody Home home) {
    	homeRepository.save(home);
    }

    @RequestMapping(value = "/delete/{id}") 
    public void delete(@PathVariable String id) {
    	homeRepository.delete(id); 
    }

}
