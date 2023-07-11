package com.example.viduiocdi.config;

import com.example.viduiocdi.modal.Engine;
import com.example.viduiocdi.modal.Transmission;
import org.springframework.context.annotation.Bean;

public class Config{
        @Bean
        public Engine engine() {
            return new Engine("v8", 5);
        }

        @Bean
        public Transmission transmission() {
            return new Transmission("sliding");
        }

}
