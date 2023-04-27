package com.hitema.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "film_actor")
public class FilmActor {
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "film_id")
    private Film film;

    @ManyToOne
    @JoinColumn(name = "actor_id")
    private Actor actor;

}