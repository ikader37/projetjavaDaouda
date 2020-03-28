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
public class EtudiantEtranger extends Etudiant{
    
    private String pays;
    public EtudiantEtranger(){
        
    }
    public EtudiantEtranger(String nom,String prenom,int age,String pays){
        super(nom, prenom, age);
        this.pays=pays;
    }
    
    public String afficher(){
        return "Etudiant Etranger"+": Nom:"+super.getNom()+"  Prenom(s):"+super.getPrenom()+"  "+super.getAge()+"  Pays d'aorigine:"+this.pays;
    }
}
