/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class GroupeTD {
    
    private List<Etudiant> listEtd;
    private int maxEt;
    
    public GroupeTD(int maxEt){
        this.maxEt=maxEt;
        this.listEtd=new ArrayList<Etudiant>(maxEt);
    }
    
    public void ajouterEtudiant(Etudiant e){
        if(this.listEtd.size()<this.maxEt){
            this.listEtd.add(e);
            System.out.println("Etudiant "+e.getNom()+" "+e.getPrenom()+" a été ajouté avec sujet.");
        }else{
            System.out.println("La taille maximale du groupe est atteint");
        }
    }
    
    public boolean RechercherEtudiant(Etudiant e){
        return (this.listEtd.contains(e));
    }
    public boolean RemoveEtudiant(Etudiant e){
        return this.listEtd.remove(e);
    }
    public void afficherListe(){
        System.out.println("----------------------La liste des etudiants-------------------");
        int i=1;
        for (Etudiant e:listEtd){
            System.out.println(i+"-"+e.toString());
            i++;
        }
    }
}
