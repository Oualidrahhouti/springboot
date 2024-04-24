package com.hitema.intro.repositories;

import com.hitema.intro.models.City;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CityRepository extends JpsaRepository<City, Long> {
    List<City> findCitiesByNameContaining(String exp);
    List<City> findCitiesByCapitalTrue();
}
