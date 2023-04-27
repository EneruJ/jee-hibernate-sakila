package com.hitema.dao;

import com.hitema.entities.Country;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class CountryDaoImplTest {


    @Test
    public void create() {
        CountryDaoImpl dao = new CountryDaoImpl();
        Country country = new Country();
        country.setCountry("Kossovo");
        country.setLastUpdate(LocalDateTime.now());
        dao.create(country);
        assertTrue(country.getId()!=null, "ERROR While create COUNTRY");
    }

    @Test
    public void read() {
        CountryDaoImpl dao = new CountryDaoImpl();
        var c = dao.read( 1l);
        assertTrue(c.getCountry().equals("Afghanistan"),"ERROR DB seems corrupted !!!!");
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    @Test
    void findAll() {
    }
}