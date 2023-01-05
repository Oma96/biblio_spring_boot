package com.example.bibliotheque.buisness;


import com.example.bibliotheque.dao.Categorie;
import com.example.bibliotheque.dao.CategorieRepository;
import com.example.bibliotheque.dao.Livre;
import com.example.bibliotheque.dao.LivreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieService {

    @Autowired
    CategorieRepository categorieRepository;

    public void createCategorie(Categorie categorie){
        categorieRepository.save(categorie);
    }

    public List<Categorie> getCategorie(){
        return categorieRepository.findAll();
    }
}
