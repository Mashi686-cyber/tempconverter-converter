package com.example.tempconverter.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.tempconverter.model.TemperatureLog;
import com.example.tempconverter.service.TemperatureService;

@RestController
@RequestMapping("/api/temperatures")
public class TemperatureController {


    private final TemperatureService service;


    public TemperatureController(TemperatureService service) {
        this.service = service;
    }


    // POST - Convert temperature
    @PostMapping("/convert")
    public TemperatureLog convert(
            @RequestParam double value,
            @RequestParam String unit) {

        return service.convert(value, unit);
    }



    // GET - All history
    @GetMapping("/history")
    public List<TemperatureLog> getHistory() {

        return service.getHistory();
    }



    // GET - Filter history by unit
    @GetMapping("/history/filter")
    public List<TemperatureLog> filterHistory(
            @RequestParam String unit) {

        return service.filterByUnit(unit);
    }



    // GET - Warning check
    @GetMapping("/warning-check")
    public String warningCheck(
            @RequestParam double value,
            @RequestParam String unit) {

        return service.checkWarning(value, unit);
    }



    // DELETE - Clear history
    @DeleteMapping("/history")
    public String clearHistory() {

        service.clearHistory();

        return "History deleted successfully";
    }

}