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
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    long numCours;

    int niveau;
    float prix;
    int creneau;
    @Enumerated(EnumType.STRING)
    Support support;
    @Enumerated(EnumType.STRING)
    TypeCours typeCours;
    @OneToMany (mappedBy = "coursInscri")
    Set<Inscription> inscriCours;

}
