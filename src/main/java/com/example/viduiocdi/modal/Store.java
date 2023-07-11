package com.example.viduiocdi.modal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class Store {
    //Field-Based Dependency Injection
    @Autowired
    @Qualifier("item1")
    private Item item;

    public Store(Item item) {
        this.item = item;
    }
    public Store() {
        item = new ItemImpl1();
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
