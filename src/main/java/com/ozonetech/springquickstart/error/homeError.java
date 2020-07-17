package com.ozonetech.springquickstart.error;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class homeError {

    @GetMapping
    public String homepageError()
    {
        return "Application is running !!! "+new Date();
    }
}
