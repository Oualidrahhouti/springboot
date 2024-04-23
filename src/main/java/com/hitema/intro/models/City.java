package com.hitema.intro.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class City {

    @Id
    @Column(name = "city_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "city")
    private String city;

    @Column(name="country_id")
    private Long country_id;

    @Column(name="last_update")
    private LocalDateTime last_update;

    public Long getId() { return this.id; };

    public void setId(Long id) { this.id = id; }

    public String getCity() { return this.city; }

    public void setCity(String city) { this.city = city; }

    public Long getCountryId() { return this.country_id; }

    public void setCountryId(Long country_id) { this.country_id = country_id; }

    public LocalDateTime getLastUpdate() { return this.last_update; }

    public void setLastUpdate(LocalDateTime last_update) { this.last_update = last_update; }
}
