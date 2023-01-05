package com.example.bibliotheque.api;


import com.example.bibliotheque.buisness.CategorieService;
import com.example.bibliotheque.buisness.LivreService;
import com.example.bibliotheque.dao.Categorie;
import com.example.bibliotheque.dao.Livre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class CategorieController {

    @Autowired
    CategorieService categorieService;

    @PostMapping("categorie")
    public void createLivre(@RequestBody Categorie categorie){
        categorieService.createCategorie(categorie);
    }

    @GetMapping("categories")
    public List<Categorie> getCategories(){
        return categorieService.getCategorie();
    }
}
