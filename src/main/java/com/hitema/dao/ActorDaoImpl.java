package com.hitema.dao;

import com.hitema.entities.Actor;


import java.util.List;

public class ActorDaoImpl extends AbstractDao implements Dao<Actor, Long>{

    public List findFilmsByActor(Long id) {
        return getCurrentSession().createQuery("from Actor where film.id = :id").setParameter("id", id).getResultList();
    }

    @Override
    public Actor create(Actor entity) {
        return null;
    }

    @Override
    public Actor read(Long id) {
        return null;
    }

    @Override
    public void update(Actor entity) {

    }

    @Override
    public void delete(Actor entity) {

    }

    @Override
    public List<Actor> findAll() {
        return null;
    }
}
