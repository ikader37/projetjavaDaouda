/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author DELL
 */
public class EtudiantSportif extends Etudiant{
    private String sport;
    public EtudiantSportif(){
        
    }
    public EtudiantSportif(String nom,String prenom,int age,String sport){
        super(nom, prenom, age);
        this.sport=sport;
    }
    
    public String toString(){
        return super.toString(" Sportif")+" Sport pratique:"+this.sport;
    }
}
