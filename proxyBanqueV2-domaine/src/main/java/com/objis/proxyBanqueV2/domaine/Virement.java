/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.proxyBanqueV2.domaine;

import java.util.Date;

/**
 *
 * @author BackOffice
 */
public class Virement {
    private Long idVirement;
    private String numeroVirement;
    private Date dateVirement;
    private Double montant;
    private Compte compteEmetteur;
    private Compte compteRecepteur;
    private Conseiller conseiller;

    public Long getIdVirement() {
        return idVirement;
    }

    public void setIdVirement(Long idVirement) {
        this.idVirement = idVirement;
    }

    public String getNumeroVirement() {
        return numeroVirement;
    }

    public void setNumeroVirement(String numeroVirement) {
        this.numeroVirement = numeroVirement;
    }

    public Date getDateVirement() {
        return dateVirement;
    }

    public void setDateVirement(Date dateVirement) {
        this.dateVirement = dateVirement;
    }

    public Double getMontant() {
        return montant;
    }

    public void setMontant(Double montant) {
        this.montant = montant;
    }

    public Compte getCompteEmetteur() {
        return compteEmetteur;
    }

    public void setCompteEmetteur(Compte compteEmetteur) {
        this.compteEmetteur = compteEmetteur;
    }

    public Compte getCompteRecepteur() {
        return compteRecepteur;
    }

    public void setCompteRecepteur(Compte compteRecepteur) {
        this.compteRecepteur = compteRecepteur;
    }

    public Conseiller getConseiller() {
        return conseiller;
    }

    public void setConseiller(Conseiller conseiller) {
        this.conseiller = conseiller;
    }

    public Virement(Long idVirement, String numeroVirement, Date dateVirement, Double montant, Compte compteEmetteur, Compte compteRecepteur, Conseiller user) {
        this.idVirement = idVirement;
        this.numeroVirement = numeroVirement;
        this.dateVirement = dateVirement;
        this.montant = montant;
        this.compteEmetteur = compteEmetteur;
        this.compteRecepteur = compteRecepteur;
        this.conseiller = user;
    }

    public Virement() {
    }
    
    
    
            
}
