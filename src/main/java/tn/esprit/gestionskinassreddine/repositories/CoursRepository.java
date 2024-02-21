package tn.esprit.gestionskinassreddine.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.gestionskinassreddine.entities.Skieur;

public interface CoursRepository extends CrudRepository<Skieur,Long> {

}
