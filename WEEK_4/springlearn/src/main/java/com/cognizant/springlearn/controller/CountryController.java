package com.cognizant.springlearn.controller;

import com.cognizant.springlearn.bean.Country;
import com.cognizant.springlearn.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CountryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

    @Autowired
    private CountryService countryService;

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) {
        LOGGER.info("Start getCountry() with code: {}", code);
        Country country = countryService.getCountry(code);
        LOGGER.info("End getCountry()");
        return country;
    }
}
