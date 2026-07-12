package com.example.tempconverter.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.tempconverter.model.TemperatureLog;

public interface TemperatureLogRepository extends MongoRepository<TemperatureLog, String> {

}