package com.example.viduiocdi.config;

import com.example.viduiocdi.modal.Item;
import com.example.viduiocdi.modal.ItemImpl1;
import com.example.viduiocdi.modal.Store;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.baeldung.autowire.sample")
public class AppConfig {
    //tiêm phụ thuộc dựa trên hàm tạo
    @Bean
    public Item item1() {
        return new ItemImpl1();
    }

    @Bean
    public Store store() {
        return new Store(item1());
    }
    //Setter-Based Dependency Injection
    @Bean
    public Store store1() {
        Store store = new Store();
        store.setItem(item1());
        return store;
    }
    // Autowiring Dependencies
    @Bean
    public Item item() {
        return new ItemImpl1();
    }

    @Bean(autowire = Autowire.BY_TYPE)
    public Store store2() {
        return new Store();
    }
}
