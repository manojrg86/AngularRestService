package com.funmeeting.funmeetingprod.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class GalleryImage {
	
	@Id
	public String id;
    public String title;
    public String imageUrl;
    
    public GalleryImage() {
    	
    }
    
    public GalleryImage(String id,String title,String imageUrl) {
    	this.id=id;
    	this.title=title;
    	this.imageUrl=imageUrl;
    }

}
