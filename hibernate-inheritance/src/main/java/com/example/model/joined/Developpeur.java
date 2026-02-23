package com.example.model.joined;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Developpeur extends Employe {

    private String langage;
    private Double salaireBase;

    public Developpeur() {}

    public Developpeur(String nom, String prenom,
                       LocalDate dateEmbauche,
                       String langage, Double salaireBase) {
        super(nom, prenom, dateEmbauche);
        this.langage = langage;
        this.salaireBase = salaireBase;
    }

    @Override
    public double calculerSalaire() {
        return salaireBase * 1.1;
    }
}
