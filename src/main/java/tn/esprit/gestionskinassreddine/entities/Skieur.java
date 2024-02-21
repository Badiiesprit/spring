package tn.esprit.gestionskinassreddine.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Set;

@Getter
@Setter
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "Skieur")
public class Skieur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    long numSkieur;

    String nomS;
    String prenomS;
    LocalDate dateNaissance;
    String ville;
    @OneToOne(cascade = CascadeType.ALL)
    Abonnement abn;
    @ManyToMany(mappedBy = "listSkieur")
    Set<Piste> listPiste;
    @OneToMany (mappedBy = "skieurInscri")
    Set<Inscription> skieurInscri;

}
