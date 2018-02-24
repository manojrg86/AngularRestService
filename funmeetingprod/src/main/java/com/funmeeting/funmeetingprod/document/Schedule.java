package com.funmeeting.funmeetingprod.document;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Schedule {
	
	@Id
	public String id;
    public String date;
    public List<Events> events;
    
    public Schedule() {
    	
    }
    
	public Schedule(String id, String date, List<Events> events) {
		this.id = id;
		this.date = date;
		this.events = events;
	}
	

}
