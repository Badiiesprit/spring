package tn.esprit.gestionskinassreddine.services;

import org.springframework.beans.factory.annotation.Autowired;
import tn.esprit.gestionskinassreddine.entities.Cours;
import tn.esprit.gestionskinassreddine.entities.Skieur;
import tn.esprit.gestionskinassreddine.repositories.CoursRepository;

import java.util.List;
public class CoursService implements IcoursService{
    @Autowired
    private CoursRepository coursRepository;

    @Override
    public Cours addSkieur(Cours skieur) {
        return null;
    }

    @Override
    public void deleteSkieur(long skieurId) {

    }

    @Override
    public Cours updateSkieur(Cours skieur) {
        return null;
    }

    @Override
    public Cours getSkieur(long skieurId) {
        return null;
    }

    @Override
    public List<Cours> getAllSkieurs() {
        return null;
    }
}
