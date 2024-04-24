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

    @ManyToOne(fetch = FetchType.EAGER)
    @Column(name="country_id")
    private Country country;

    @Column(name="last_update")
    private LocalDateTime last_update;

    @Column(name = "capital") // Added new column for capital
    private boolean capital;

    public Long getId() { return this.id; };

    public void setId(Long id) { this.id = id; }

    public String getCity() { return this.city; }

    public void setCity(String city) { this.city = city; }

    public Country getCountry() { return this.country; }

    public void setCountry(Country country) { this.country = country; }

    public LocalDateTime getLastUpdate() { return this.last_update; }

    public void setLastUpdate(LocalDateTime last_update) { this.last_update = last_update; }

    public boolean isCapital() { return this.capital; } // Getter for capital

    public void setCapital(boolean capital) { this.capital = capital; } // Setter for capital

}
