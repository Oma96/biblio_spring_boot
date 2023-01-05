package com.example.bibliotheque.buisness;


import com.example.bibliotheque.dao.Auteur;
import com.example.bibliotheque.dao.AuteurRepository;
import com.example.bibliotheque.dao.Categorie;
import com.example.bibliotheque.dao.CategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuteurService {

    @Autowired
    AuteurRepository auteurRepository;

    public void createAuteur(Auteur auteur){
        auteurRepository.save(auteur);
    }

    public List<Auteur> getAuteurs(){
        return auteurRepository.findAll();
    }
}
