package com.example.bibliotheque.dao;

import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class Categorie{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;
    private String nom;

    public Categorie(String nom) {
        this.nom = nom;
    }

    public Categorie() {
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
