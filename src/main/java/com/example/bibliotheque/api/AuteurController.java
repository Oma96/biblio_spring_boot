package com.example.bibliotheque.api;


import com.example.bibliotheque.buisness.AuteurService;
import com.example.bibliotheque.buisness.CategorieService;
import com.example.bibliotheque.dao.Auteur;
import com.example.bibliotheque.dao.Categorie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class AuteurController {

    @Autowired
    AuteurService auteurService;

    @PostMapping("auteur")
    public void createAuteur(@RequestBody Auteur auteur){
        auteurService.createAuteur(auteur);
    }

    @GetMapping("auteurs")
    public List<Auteur> getAuteurs(){
        return auteurService.getAuteurs();
    }
}
