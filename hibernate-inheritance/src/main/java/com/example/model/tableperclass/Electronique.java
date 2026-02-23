package com.example.model.tableperclass;

import javax.persistence.Entity;

@Entity
public class Electronique extends Produit {

    private String marque;

    public Electronique() {}

    public Electronique(String nom, Double prix, String marque) {
        super(nom, prix);
        this.marque = marque;
    }

    @Override
    public double calculerValeur() {
        return getPrix() * 0.8;
    }
}
