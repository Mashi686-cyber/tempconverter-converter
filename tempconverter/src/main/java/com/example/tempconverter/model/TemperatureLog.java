package com.example.tempconverter.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "temperature_logs")
public class TemperatureLog {

    @Id
    private String id;

    private double inputValue;
    private String inputUnit;
    private double convertedValue;
    private String convertedUnit;
    private String warning;


    public TemperatureLog() {

    }


    public TemperatureLog(double inputValue,
                           String inputUnit,
                           double convertedValue,
                           String convertedUnit,
                           String warning) {

        this.inputValue = inputValue;
        this.inputUnit = inputUnit;
        this.convertedValue = convertedValue;
        this.convertedUnit = convertedUnit;
        this.warning = warning;
    }


    public String getId() {
        return id;
    }

    public double getInputValue() {
        return inputValue;
    }

    public String getInputUnit() {
        return inputUnit;
    }

    public double getConvertedValue() {
        return convertedValue;
    }

    public String getConvertedUnit() {
        return convertedUnit;
    }

    public String getWarning() {
        return warning;
    }
}