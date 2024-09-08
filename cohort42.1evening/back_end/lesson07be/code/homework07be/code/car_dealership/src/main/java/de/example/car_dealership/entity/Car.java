package de.example.car_dealership.entity;

public class Car {
    private static Long id;
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {

        this.make = make;
        this.model = model;
        this.year = year;
    }
    public void getAllMarke(){
        System.out.println(this.make);
        System.out.println(this.model);
        System.out.println(this.year);

    }

    public Long getId() {
        return id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
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
}
