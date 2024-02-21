package tn.esprit.gestionskinassreddine.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.Date;
import java.util.logging.Level;

@Getter
@Setter
@Entity
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Abonnement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    long id;
    LocalDate dateDebut;
    LocalDate dateFin;
    float prixAbon;
    @Enumerated(EnumType.STRING)
    TypeAbonnement typeAbon;
    @OneToOne(mappedBy = "abn")
    Skieur skieur;




}
