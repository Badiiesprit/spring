package tn.esprit.gestionskinassreddine.services;

import tn.esprit.gestionskinassreddine.entities.Cours;
import tn.esprit.gestionskinassreddine.repositories.CoursRepository;

import java.util.List;

public interface IcoursService {
    public Cours addSkieur(Cours skieur);

    public void deleteSkieur(long skieurId);

    public Cours updateSkieur (Cours skieur);

    public Cours getSkieur(long skieurId);
    public List<Cours> getAllSkieurs();

}
