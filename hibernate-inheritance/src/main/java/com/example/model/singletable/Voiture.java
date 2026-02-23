package com.example.model.singletable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@DiscriminatorValue("VOITURE")
public class Voiture extends Vehicule {

    private Integer nombrePortes;
    private Boolean climatisation;

    public Voiture() {}

    public Voiture(String marque, String modele,
                   LocalDate anneeFabrication, Double prix,
                   Integer nombrePortes, Boolean climatisation) {
        super(marque, modele, anneeFabrication, prix);
        this.nombrePortes = nombrePortes;
        this.climatisation = climatisation;
    }

    @Override
    public double calculerValeur() {
        return getPrix() * 0.9;
    }
}
