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
public class Role {
    private Long idRole;
    private String libelle;

    /**
     * 
     * @return 
     */
    public Long getIdRole() {
        return idRole;
    }

    /**
     * 
     * @param idRole 
     */
    public void setIdRole(Long idRole) {
        this.idRole = idRole;
    }

    /**
     * 
     * @return 
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * 
     * @param libelle 
     */
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Role(Long idRole, String libelle) {
        this.idRole = idRole;
        this.libelle = libelle;
    }

    public Role() {
    }
    
    
}
