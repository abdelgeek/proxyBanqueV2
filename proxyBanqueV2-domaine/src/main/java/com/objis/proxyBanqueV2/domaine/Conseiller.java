/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.proxyBanqueV2.domaine;

/**
 *
 * @author FOUR GROUP
 */
public class Conseiller {
    private Long idConseiller;
    private String pseudo;
    private String motdePasse;
    private String nom;
    private String prenom;
    private String contact;
    private Role role;
    
    /**
     *  
     * @return  The idConseiller
     */
    public Long getIdConseiller() {
        return idConseiller;
    }

    /**
     * 
     * @param idConseiller 
     */
    public void setIdConseiller(Long idConseiller) {
        this.idConseiller = idConseiller;
    }

    /**
     * 
     * @return the pseudo
     */
    public String getPseudo() {
        return pseudo;
    }

    /**
     * 
     * @param pseudo 
     */
    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    /**
     * 
     * @return the motDePasse
     */
    public String getMotdePasse() {
        return motdePasse;
    }

    /**
     * 
     * @param motdePasse 
     */
    public void setMotdePasse(String motdePasse) {
        this.motdePasse = motdePasse;
    }

    /**
     * 
     * @return the name
     */
    public String getNom() {
        return nom;
    }

    /**
     * 
     * @param nom 
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * 
     * @return the firstName
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * 
     * @param prenom 
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * 
     * @return the tel
     */
    public String getContact() {
        return contact;
    }

    /**
     * 
     * @param contact 
     */
    public void setContact(String contact) {
        this.contact = contact;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Conseiller(Long idUser, String pseudo, String motdePasse, String nom, String prenom, String contact) {
        this.idConseiller = idUser;
        this.pseudo = pseudo;
        this.motdePasse = motdePasse;
        this.nom = nom;
        this.prenom = prenom;
        this.contact = contact;
    }
    

    public Conseiller() {
    }

    
    
}
