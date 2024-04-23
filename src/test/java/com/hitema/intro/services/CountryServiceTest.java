package com.hitema.intro.services;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CountryServiceTest {

    private static final Logger LOGGER= LoggerFactory.getLogger(CountryService.class);

    @Autowired
    CountryService countryService;

    @Test
    void create() {
    }

    @Test
    void read() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    @Test
    void readAll()
    {
        LOGGER.info(()->"Test read all");
        assertNotEquals(0,countryService.readAll().toArray().length);
    }
}