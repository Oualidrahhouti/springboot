package com.hitema.intro.models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Country {

    @Id
    @Column(name ="country_id", nullable=false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name="country")
    private String country;

    @Column(name="last_update")
    private LocalDateTime lastUpdate;

    public Long getId(){return id;};

    public void setId(long id) {this.id=id;}

    public String getCountry(){return country;}

    public void setCountry(String country){this.country=country;}

    public LocalDateTime getLastUpdate(){return lastUpdate;}

    public void setLastUpdate(LocalDateTime lastUpdate){this.lastUpdate=lastUpdate;}
}
