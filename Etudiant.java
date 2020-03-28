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
public class Etudiant {
    private String nom;
    private String prenom;
    private int age;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public Etudiant(){
        
    }
    public Etudiant(String nom,String prenom,int age){
        this.nom=nom;
        this.prenom=prenom;
        this.age=age;
    }
    
    public String toString(String type){
        return "Etudiant"+type+": Nom:"+this.nom+"  Prenom(s):"+this.prenom+"  "+this.age;
    }
}
