package org.example.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private int numeroAdhesion;
    @Column(nullable = false, unique = true)
    private String nom;
    @Column(nullable = false, unique = true)
    private String prenom;
    @Column(nullable = false, unique = true)
    private String pieceIdentification;
    @Column(nullable = false, unique = true)
    private String nationalite;
    @Column(nullable = false, unique = true)
    private LocalDate dateAdhesion;
    @Column(nullable = false, unique = true)
    private LocalDate dateExpirationLicence;

    // Constructors
    public User() {
    }

    // Getters and Setters (same as before)


    public Long getId() {
        return id;
    }

    public int getNumeroAdhesion() {
        return numeroAdhesion;
    }

    public void setNumeroAdhesion(int numeroAdhesion) {
        this.numeroAdhesion = numeroAdhesion;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getPieceIdentification() {
        return pieceIdentification;
    }

    public void setPieceIdentification(String pieceIdentification) {
        this.pieceIdentification = pieceIdentification;
    }

    public String getNationalite() {
        return nationalite;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public LocalDate getDateAdhesion() {
        return dateAdhesion;
    }

    public void setDateAdhesion(LocalDate dateAdhesion) {
        this.dateAdhesion = dateAdhesion;
    }

    public LocalDate getDateExpirationLicence() {
        return dateExpirationLicence;
    }

    public void setDateExpirationLicence(LocalDate dateExpirationLicence) {
        this.dateExpirationLicence = dateExpirationLicence;
    }
}