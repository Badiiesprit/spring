package tn.esprit.gestionskinassreddine.restControllers;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionskinassreddine.entities.Skieur;
import tn.esprit.gestionskinassreddine.services.IskieurService;

@RestController
@RequestMapping("skieur")
@RequiredArgsConstructor
public class SkieurConntroller {
    @Autowired
    private IskieurService iskieurService;
    @PostMapping()
    public Skieur addSkieur (@RequestBody Skieur skieur){
        return iskieurService.addSkieur(skieur);
    }

    @GetMapping("hello/{name}")
    public String hello(@PathVariable String name){
        return "Bonjour "+name;
    }
}
