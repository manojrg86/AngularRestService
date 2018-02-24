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

import com.funmeeting.funmeetingprod.document.Schedule;
import com.funmeeting.funmeetingprod.repository.ScheduleRepository;

@RestController
@RequestMapping("/api/schedule")
public class ScheduleController {

	@Autowired
	ScheduleRepository scheduleRepository;
	
	@RequestMapping(value = "/create",method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Schedule schedule) {
		scheduleRepository.save(schedule);
    }
	
	@GetMapping("/all")
    public List<Schedule> getAll() {
        return scheduleRepository.findAll();
    }
	
    @RequestMapping(value = "/{id}") 
    public Schedule read(@PathVariable String id) {
        return scheduleRepository.findOne(id);
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody Schedule schedule) {
    	scheduleRepository.save(schedule);
    }

    @RequestMapping(value = "/delete/{id}") 
    public void delete(@PathVariable String id) {
    	scheduleRepository.delete(id); 
    }

}
