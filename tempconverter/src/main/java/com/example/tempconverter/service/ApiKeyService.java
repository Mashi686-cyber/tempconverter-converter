package com.example.tempconverter.service;

import org.springframework.stereotype.Service;

import com.example.tempconverter.repository.ApiKeyRepository;

@Service
public class ApiKeyService {

    private final ApiKeyRepository repository;

    public ApiKeyService(ApiKeyRepository repository) {
        this.repository = repository;
    }


    public boolean isValid(String key) {

        return repository.findByKey(key).isPresent();

    }
}