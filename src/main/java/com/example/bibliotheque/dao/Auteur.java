package com.example.bibliotheque.dao;

import jakarta.persistence.*;

@Entity
@Table(name = "auteurs")
public class Auteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;
    private String nom;

    public Auteur(String nom) {
        this.nom = nom;
    }

    public Auteur() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
