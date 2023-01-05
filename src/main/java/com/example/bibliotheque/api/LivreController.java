package com.example.bibliotheque.api;


import com.example.bibliotheque.buisness.LivreService;
import com.example.bibliotheque.dao.Categorie;
import com.example.bibliotheque.dao.Livre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class LivreController {

    @Autowired
    LivreService livreService;

    @PostMapping("livre")
    public void createLivre(@RequestBody Livre livre){

        livreService.createLivre(livre);
    }

    @GetMapping("livres")
    public List<Livre> getLivres(){
        return livreService.getLivres();
    }
}
