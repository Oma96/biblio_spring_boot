package com.example.bibliotheque.dao;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "livres")
public class Livre {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Integer id ;
 private String nom;
@ManyToOne
Auteur auteur;
@ManyToMany
    List<Categorie> categories= new ArrayList<>();
    public Livre(String nom) {
        this.nom = nom;
    }

    public Livre() {
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

    public Auteur getAuteur() {
        return auteur;
    }

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }

    public List<Categorie> getCategories() {
        return categories;
    }

    public void setCategories(List<Categorie> categories) {
        this.categories = categories;
    }

    public void addCategorie(Categorie categorie){
        categories.add(categorie);
    }
}
