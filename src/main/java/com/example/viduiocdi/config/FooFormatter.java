package com.example.viduiocdi.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.util.Locale;
@FormatterType("Foo")
@Component("fooFormatter")

public class FooFormatter implements Formatter {
    @Autowired
    @Qualifier("fooFormatter")
    private Formatter formatter;
    public String format() {
        return "foo";
    }

    @Override
    public Object parse(String text, Locale locale) throws ParseException {
        return null;
    }

    @Override
    public String print(Object object, Locale locale) {
        return null;
    }
    public String format2() {
        return "bar";
    }
}
