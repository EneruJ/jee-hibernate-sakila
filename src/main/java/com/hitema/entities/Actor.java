package com.hitema.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "actor")
public class Actor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "actor_id", nullable = false)
    private Long id;

    private String first_name;

    private String last_name;

    @ManyToMany(mappedBy = "actors")
    private Set<Film> films = new HashSet<>();

    public Actor() {
    }


    public String getfirstName() {
        return first_name;
    }

    public void setfirstName(String first_name) {
        this.first_name = first_name;
    }

    public String getLastName() {
        return last_name;
    }

    public void setLastName(String last_name) {
        this.last_name = last_name;
    }

}
