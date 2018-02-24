package com.funmeeting.funmeetingprod.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.funmeeting.funmeetingprod.document.Home;

public interface HomeRepository extends MongoRepository<Home, String>{

}
