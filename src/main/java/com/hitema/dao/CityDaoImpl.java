package com.hitema.dao;

import com.hitema.entities.City;
import com.hitema.entities.Country;

import java.util.List;
public class CityDaoImpl extends AbstractDao implements Dao<City, Long> {

    public List findCitiesByCountry(Long id) {
        return getCurrentSession().createQuery("from City where country.id = :id").setParameter("id", id).getResultList();
    }

    // Méthode pour trouver le pays d'une ville donnée, la BDD de country contient l'id et le nom, la BDD de la ville contient l'id de la ville son nom et l'id du pays
    public Country findCountryByCity(Long id) {
        return (Country) getCurrentSession().createQuery("select c.country from City c where c.id = :id").setParameter("id", id).getSingleResult();
    }

    @Override
    public City create(City entity) {
        return null;
    }

    @Override
    public City read(Long id) {
        return null;
    }

    @Override
    public void update(City entity) {

    }

    @Override
    public void delete(City entity) {

    }

    @Override
    public List<City> findAll() {
        return null;
    }
}
