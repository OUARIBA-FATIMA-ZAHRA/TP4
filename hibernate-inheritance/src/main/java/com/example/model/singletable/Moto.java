package com.example.model.singletable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@DiscriminatorValue("MOTO")
public class Moto extends Vehicule {

    private Integer cylindree;

    public Moto() {}

    public Moto(String marque, String modele,
                LocalDate anneeFabrication, Double prix,
                Integer cylindree) {
        super(marque, modele, anneeFabrication, prix);
        this.cylindree = cylindree;
    }

    @Override
    public double calculerValeur() {
        return getPrix() * 0.85;
    }
}
