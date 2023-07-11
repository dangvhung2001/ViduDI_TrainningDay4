package com.example.viduiocdi.config;

import com.example.viduiocdi.DAO.FooDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Formatter;

@Component
public class FooService {
    @Autowired
    @FormatterType("Foo")
    private Formatter formatter;
    @Autowired
    private FooFormatter fooFormatter;
    // autowried setter
    @Autowired
    public void setFormatter(FooFormatter fooFormatter) {
        this.fooFormatter = fooFormatter;
    }
    //autowried contructor
    @Autowired
    public FooService(FooFormatter fooFormatter) {
        this.fooFormatter = fooFormatter;
    }
    //@Autowired and Optional Dependencies
    @Autowired(required = false)
    private FooDAO dataAccessor;
}
