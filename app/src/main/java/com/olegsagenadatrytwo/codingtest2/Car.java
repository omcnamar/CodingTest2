package com.olegsagenadatrytwo.codingtest2;

/**
 * Created by omcna on 8/11/2017.
 */

public class Car {

    private String model;
    private String year;
    private String type;

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year='" + year + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Car(String model, String year, String type) {

        this.model = model;
        this.year = year;
        this.type = type;
    }
}
