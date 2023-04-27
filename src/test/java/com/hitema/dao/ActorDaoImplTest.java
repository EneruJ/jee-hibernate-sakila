package com.hitema.dao;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ActorDaoImplTest {

    static ActorDaoImpl dao ;

    @BeforeAll
    static void beforeAll(){
        dao = new ActorDaoImpl();
    }
    @Test
    public void findFilmsByActor() {
        var c = dao.findFilmsByActor(1l);
        // Vérification du test
        assertTrue(c.size()==19, "ERROR DB seems corrupted !!!!");
    }
}
