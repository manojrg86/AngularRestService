package com.funmeeting.funmeetingprod.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.funmeeting.funmeetingprod.document.GalleryImage;

public interface GalleryImageRepository extends MongoRepository<GalleryImage,String> {

}
