package com.example.model.singletable;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "vehicules")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type_vehicule")
public abstract class Vehicule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String marque;
    private String modele;
    private LocalDate anneeFabrication;
    private Double prix;

    public Vehicule() {}

    public Vehicule(String marque, String modele,
                    LocalDate anneeFabrication, Double prix) {
        this.marque = marque;
        this.modele = modele;
        this.anneeFabrication = anneeFabrication;
        this.prix = prix;
    }

    public abstract double calculerValeur();

    // Getters & Setters

    public Long getId() { return id; }

    public String getMarque() { return marque; }

    public String getModele() { return modele; }

    public LocalDate getAnneeFabrication() { return anneeFabrication; }

    public Double getPrix() { return prix; }

    public void setMarque(String marque) { this.marque = marque; }

    public void setModele(String modele) { this.modele = modele; }

    public void setAnneeFabrication(LocalDate anneeFabrication) {
        this.anneeFabrication = anneeFabrication;
    }

    public void setPrix(Double prix) { this.prix = prix; }

    @Override
    public String toString() {
        return id + " | " + marque + " " + modele + " | " + prix;
    }
}
