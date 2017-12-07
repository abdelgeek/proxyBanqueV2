/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.proxyBanqueV2.domaine;

import java.util.Date;

/**
 *
 * @author FOUR GROUP
 */
public class Compte {
 
    private Long idCompte;
    private Date dateOuverture;
    private Double solde;
    private String typeCompte;
    private Float taux;
    private Double Decouvert;
    private Client client;

    public Long getIdCompte() {
        return idCompte;
    }

    public void setIdCompte(Long idCompte) {
        this.idCompte = idCompte;
    }

    public Date getDateOuverture() {
        return dateOuverture;
    }

    public void setDateOuverture(Date dateOuverture) {
        this.dateOuverture = dateOuverture;
    }

    public Double getSolde() {
        return solde;
    }

    public void setSolde(Double solde) {
        this.solde = solde;
    }

    public String getTypeCompte() {
        return typeCompte;
    }

    public void setTypeCompte(String typeCompte) {
        this.typeCompte = typeCompte;
    }

    public Float getTaux() {
        return taux;
    }

    public void setTaux(Float taux) {
        this.taux = taux;
    }

    public Double getDecouvert() {
        return Decouvert;
    }

    public void setDecouvert(Double Decouvert) {
        this.Decouvert = Decouvert;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Compte() {
    }

    public Compte(Long idCompte, Date dateOuverture, Double solde, String typeCompte, Float taux, Double Decouvert, Client client) {
        this.idCompte = idCompte;
        this.dateOuverture = dateOuverture;
        this.solde = solde;
        this.typeCompte = typeCompte;
        this.taux = taux;
        this.Decouvert = Decouvert;
        this.client = client;
    }
     
    
}
