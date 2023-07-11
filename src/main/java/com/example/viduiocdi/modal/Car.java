package com.example.viduiocdi.modal;

import org.springframework.beans.factory.annotation.Autowired;

public class Car
{
    public Engine engine;
    private Transmission transmission;
    @Autowired
    public Car(Engine engine, Transmission transmission) {
        this.engine = engine;
        this.transmission = transmission;
    }
}
