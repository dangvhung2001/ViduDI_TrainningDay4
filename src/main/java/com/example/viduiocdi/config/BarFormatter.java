package com.example.viduiocdi.config;

import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;
@FormatterType("Bar")
public class BarFormatter  implements Formatter {
    @Override
    public Object parse(String text, Locale locale) throws ParseException {
        return null;
    }

    @Override
    public String print(Object object, Locale locale) {
        return null;
    }
    public String format() {
        return "bar";
    }
}
