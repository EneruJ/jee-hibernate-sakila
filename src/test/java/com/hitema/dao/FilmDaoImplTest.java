package com.hitema.dao;

import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class FilmDaoImplTest {

    private static final Logger log = LoggerFactory.getLogger(FilmDaoImplTest.class);
    static FilmDaoImpl dao ;

    /**
     * L'annotation beforeAll permet d'instacier un objet qui sera utilisé par tous les tests
     * Exemple : une DAO
     */
    @BeforeAll
    static void beforeAll(){
        log.info("<<<<Instanciation DAO>>>>");
        dao = new FilmDaoImpl();
    }

    @Test
        @Order(1)
            @Disabled("Le READ n'est encore implementé !!!!")
    void create() {
        System.out.println("<<<<<CREATE FILM    >>>>>");
        System.out.println("<<<<<END CREATE FILM>>>>>");
    }


    @Test
        @Order(1)
    void read() {
        System.out.println("<<<<<READ FILM    >>>>>");
        assertNotNull(dao,"DAO NOT INSTANCED !!!");
        var film = dao.read(1l);
        assertNotNull(film,"WARNING FILM 1 not Found !!!");
        System.out.println(film);
        System.out.println("<<<<<END READ FILM>>>>>");
    }

    @Test
        @Order(0)
    void searchByTitle() {
        assertNotNull(dao,"DAO NOT INSTANCED !!!");
        var films = dao.searchByTitle("PUNK") ;
        assertTrue(films.size()==4, "ERROR ON SearchByTitle ");
        System.out.println("Nbre de films :"+films.size());
        films.forEach(f-> System.out.println(f));
    }
}