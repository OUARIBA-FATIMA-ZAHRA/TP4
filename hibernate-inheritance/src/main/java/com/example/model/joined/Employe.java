package com.example.model.joined;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Employe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;
    private LocalDate dateEmbauche;

    public Employe() {}

    public Employe(String nom, String prenom, LocalDate dateEmbauche) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateEmbauche = dateEmbauche;
    }

    public abstract double calculerSalaire();

    public Long getId() { return id; }
    public String getNom() { return nom; }
}
