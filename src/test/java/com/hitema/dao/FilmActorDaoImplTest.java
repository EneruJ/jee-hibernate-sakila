package com.hitema.dao;

import com.hitema.dao.FilmActorDaoImpl;
import com.hitema.entities.Actor;
import com.hitema.entities.Film;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class FilmActorDaoImplTest {

    private final FilmActorDaoImpl dao = new FilmActorDaoImpl();

    @Test
    public void testFindFilmsByActor() {
        Long actorId = 1L;
        List<Film> films = dao.findFilmsByActor(actorId);
        assertTrue(films.size()==19, "ERROR DB seems corrupted !!!!");

    }

    @Test
    public void testFindActorsByFilm() {
        Long filmId = 537L;
        List<Actor> actors = dao.findActorsByFilm(filmId);
        assertTrue(actors.size()==7, "ERROR DB seems corrupted !!!!");
    }
}

