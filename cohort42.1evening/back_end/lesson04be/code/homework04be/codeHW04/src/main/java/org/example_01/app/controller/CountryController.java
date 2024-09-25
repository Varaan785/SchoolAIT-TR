package org.example_01.app.controller;

import org.example_01.app.service.CountryService;
import org.springframework.stereotype.Controller;

@Controller
public class CountryController {

    private final CountryService countryService;

    public CountryController(CountryService countryService) {
        this.countryService = countryService;
    }
}
