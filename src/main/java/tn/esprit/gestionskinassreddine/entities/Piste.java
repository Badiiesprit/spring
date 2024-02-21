package tn.esprit.gestionskinassreddine.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Getter
@Setter
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Piste {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    long numPiste;

    String nomPiste;
    int longueur;
    int pente;
    @Enumerated(EnumType.STRING)
    Couleur couleur;
    @ManyToMany
    Set<Skieur>listSkieur;

}
