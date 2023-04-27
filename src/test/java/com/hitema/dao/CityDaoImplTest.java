package com.hitema.dao;

import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CityDaoImplTest {
    // Test findCitiesByCountry

    static CityDaoImpl dao ;

    @BeforeAll
    static void beforeAll(){
        dao = new CityDaoImpl();
    }

    @Test
        @Order(1)
    public void findCitiesByCountry() {
        var c = dao.findCitiesByCountry(34l);
        // Vérification du test
        assertTrue(c.size()==4, "ERROR DB seems corrupted !!!!");
    }

    @Test
        @Order(2)
    public void findCountryByCity() {
        var c = dao.findCountryByCity(544l);
        // Vérification du test
        assertTrue(c.getCountry().equals("France"), "ERROR DB seems corrupted !!!!");
    }
}
