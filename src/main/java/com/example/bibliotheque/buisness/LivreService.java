package com.example.bibliotheque.buisness;


import com.example.bibliotheque.dao.Categorie;
import com.example.bibliotheque.dao.Livre;
import com.example.bibliotheque.dao.LivreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivreService {

    @Autowired
    LivreRepository livreRepository;

    public void createLivre(Livre livre ){

        livreRepository.save(livre);
    }

    public List<Livre> getLivres(){
        return livreRepository.findAll();
    }
}
