package com.example.bmiexample.model;

public class Sport {
    private String type;
    private String model;
    private int year;

    public Sport(String type, String model, int year) {
        this.type = type;
        this.model = model;
        this.year = year;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Sport{" +
                "type='" + type + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
