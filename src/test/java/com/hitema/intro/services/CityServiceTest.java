package com.hitema.intro.services;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hitema.intro.models.City;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CityServiceTest {

    private static final Logger log = LoggerFactory.getLogger(CityServiceTest.class);

    @Autowired
    CityService service;

    @Test
    void create() {
        City city = new City();
        city.setCity("Paris");
        city.setCountryId(1l);
        city.setLastUpdate( java.time.LocalDateTime.now());
        City createdCity = service.create(city);
        log.trace("{}", createdCity);
        assertNotNull(createdCity);
        // remove the created city
        Boolean deleted = service.delete(createdCity.getId());
        assertTrue(deleted);
    }

    @Test
    void read() {
        log.info("DEBUT TESTS Read One");
        Long id = 6l;
        var city = service.read(id);
        log.trace("{}", city);
        log.info("FIN TESTS Read One");
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    @Test
    void readAll() {
        log.info("DEBUT TESTS");
        service.readAll().forEach(c-> log.trace("{}",c));
        log.error("<<<ERROR>>>");
        log.info("FIN TESTS");
    }
}