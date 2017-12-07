/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objis.proxyBanqueV2.domaine;

/**
 *
 * @author FOUR GROUP
 * @version 1.0
 *
 */
public class Client {

    private Long idClient;
    private String nom;
    private String prenom;
    private String email;
    private String contact;
    private Conseiller user;

    /**
     * 
     * @return idClient
     */
    public Long getIdClient() {
        return idClient;
    }
    
    /**
     * 
     * @param idClient 
     */
    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }
    
    /**
     * 
     * @return nom Client
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
     * @return 
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
     * @return 
     */
    public String getEmail() {
        return email;
    }
    
    /**
     * 
     * @param email 
     */
    public void setEmail(String email) {
        this.email = email;
    }
    
    /**
     * 
     * @return 
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
    
    /**
     * 
     * @return 
     */
    public Conseiller getUser() {
        return user;
    }
    
    /**
     * 
     * @param user 
     */
    public void setUser(Conseiller user) {
        this.user = user;
    }
    
    
}
