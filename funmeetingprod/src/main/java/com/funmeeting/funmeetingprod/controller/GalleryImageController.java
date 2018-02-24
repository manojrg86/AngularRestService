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

import com.funmeeting.funmeetingprod.document.GalleryImage;
import com.funmeeting.funmeetingprod.document.Home;
import com.funmeeting.funmeetingprod.repository.GalleryImageRepository;

@RestController
@RequestMapping("/api/gallery")
public class GalleryImageController {
	
	@Autowired
	GalleryImageRepository galleryImageRepository;
	
	@RequestMapping(value = "/addimage",method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody GalleryImage image) {
		galleryImageRepository.save(image);
    }
	
	@GetMapping("/all")
    public List<GalleryImage> getAll() {
        return galleryImageRepository.findAll();
    }
	
    @RequestMapping(value = "/image/{id}") 
    public GalleryImage read(@PathVariable String id) {
        return galleryImageRepository.findOne(id);
    }

    @RequestMapping(value = "/updateimage",method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(@RequestBody GalleryImage image) {
    	galleryImageRepository.save(image);
    }

    @RequestMapping(value = "/deleteimage/{id}") 
    public void delete(@PathVariable String id) {
    	galleryImageRepository.delete(id); 
    }


}
