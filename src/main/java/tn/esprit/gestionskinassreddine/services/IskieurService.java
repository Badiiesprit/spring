package tn.esprit.gestionskinassreddine.services;

import tn.esprit.gestionskinassreddine.entities.Skieur;
import tn.esprit.gestionskinassreddine.repositories.SkieurRepository;

import java.util.List;

public interface IskieurService {
    public Skieur addSkieur(Skieur skieur);

    public void deleteSkieur(long skieurId);

    public Skieur updateSkieur (Skieur skieur);

    public Skieur getSkieur(long skieurId);
    public List<Skieur> getAllSkieurs();

}
