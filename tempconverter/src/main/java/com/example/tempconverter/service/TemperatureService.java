package com.example.tempconverter.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.tempconverter.model.TemperatureLog;
import com.example.tempconverter.repository.TemperatureLogRepository;

@Service
public class TemperatureService {


    private final TemperatureLogRepository repository;


    public TemperatureService(TemperatureLogRepository repository) {
        this.repository = repository;
    }



    public TemperatureLog convert(double value, String unit) {

        double convertedValue;
        String convertedUnit;

        if (unit.equalsIgnoreCase("C") ||
            unit.equalsIgnoreCase("CELSIUS")) {

            convertedValue = (value * 9 / 5) + 32;
            convertedUnit = "FAHRENHEIT";

        } else {

            convertedValue = (value - 32) * 5 / 9;
            convertedUnit = "CELSIUS";
        }


        String warning = checkWarning(value, unit);


        TemperatureLog log = new TemperatureLog(
                value,
                unit,
                convertedValue,
                convertedUnit,
                warning
        );


        return repository.save(log);
    }




    public List<TemperatureLog> getHistory() {

        return repository.findAll();

    }




    public List<TemperatureLog> filterByUnit(String unit) {

        return repository.findAll()
                .stream()
                .filter(log -> log.getInputUnit()
                        .equalsIgnoreCase(unit))
                .toList();

    }




    public void clearHistory() {

        repository.deleteAll();

    }




    // Warning check method
    public String checkWarning(double value, String unit) {

        if ((unit.equalsIgnoreCase("C") && value > 38) ||
            (unit.equalsIgnoreCase("F") && value > 100)) {

            return "WARNING: Temperature is dangerously hot!";

        }

        return "Temperature is safe.";
    }

}