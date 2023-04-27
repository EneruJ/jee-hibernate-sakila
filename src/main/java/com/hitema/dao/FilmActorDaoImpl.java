package com.hitema.dao;

import com.hitema.entities.Actor;
import com.hitema.entities.Film;
import com.hitema.entities.FilmActor;

import java.util.List;

public class FilmActorDaoImpl extends AbstractDao implements Dao<FilmActor, Long>{

    public List<Film> findFilmsByActor(Long actorId) {
        return getCurrentSession()
                .createQuery("select f from Film f join f.actors a where a.id = :id", Film.class)
                .setParameter("id", actorId)
                .getResultList();
    }

    public List<Actor> findActorsByFilm(Long filmId) {
        return getCurrentSession()
                .createQuery("select a from Actor a join a.films f where f.id = :id", Actor.class)
                .setParameter("id", filmId)
                .getResultList();
    }
    @Override
    public FilmActor create(FilmActor entity) {
        return null;
    }

    @Override
    public FilmActor read(Long id) {
        return null;
    }

    @Override
    public void update(FilmActor entity) {

    }

    @Override
    public void delete(FilmActor entity) {

    }

    @Override
    public List<FilmActor> findAll() {
        return null;
    }
}
