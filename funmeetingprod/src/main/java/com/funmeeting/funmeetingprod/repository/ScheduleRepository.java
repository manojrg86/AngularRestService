package com.funmeeting.funmeetingprod.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.funmeeting.funmeetingprod.document.Schedule;

public interface ScheduleRepository extends MongoRepository<Schedule, String> {

}
