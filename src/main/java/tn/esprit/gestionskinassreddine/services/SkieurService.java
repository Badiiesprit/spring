package tn.esprit.gestionskinassreddine.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.gestionskinassreddine.entities.Skieur;
import tn.esprit.gestionskinassreddine.repositories.SkieurRepository;

import java.util.List;

@Service
public class SkieurService implements IskieurService{
    @Autowired
    private SkieurRepository skieurRepository;
    @Override
    public Skieur addSkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }

    @Override
    public void deleteSkieur(long skieurId) {
        skieurRepository.deleteById(skieurId);

    }

    @Override
    public Skieur updateSkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }

    @Override
    public Skieur getSkieur(long skieurId) {
        return skieurRepository.findById(skieurId).orElse(null);
    }

    @Override
    public List<Skieur> getAllSkieurs() {
        return (List<Skieur>)skieurRepository.findAll();
    }
}
