package com.example.model.joined;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
public class Manager extends Employe {

    private Double bonus;

    public Manager() {}

    public Manager(String nom, String prenom,
                   LocalDate dateEmbauche,
                   Double bonus) {
        super(nom, prenom, dateEmbauche);
        this.bonus = bonus;
    }

    @Override
    public double calculerSalaire() {
        return bonus + 5000;
    }
}
