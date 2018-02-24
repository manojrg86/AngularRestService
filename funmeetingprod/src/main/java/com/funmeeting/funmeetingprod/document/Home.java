package com.funmeeting.funmeetingprod.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Home {
	
	@Id
	public String id;
    public String subHeading;
    public String content;
    
    public Home() {
    	
    }

    public Home(String id,String subHeading,String content) {
    	this.id=id;
    	this.subHeading=subHeading;
    	this.content=content;
    }
    
}
