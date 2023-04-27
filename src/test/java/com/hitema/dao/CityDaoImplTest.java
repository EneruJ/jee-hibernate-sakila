package com.hitema.dao;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import com.hitema.entities.City;
import com.hitema.entities.Country;

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
    public void findCitiesByCountry() {
        var c = dao.findCitiesByCountry(34l);
        // Vérification du test
        assertTrue(c.size()==4, "ERROR DB seems corrupted !!!!");
    }

    @Test
    public void findCountryByCity() {
        var c = dao.findCountryByCity(544l);
        // Vérification du test
        assertTrue(c.getCountry().equals("France"), "ERROR DB seems corrupted !!!!");
    }
}
