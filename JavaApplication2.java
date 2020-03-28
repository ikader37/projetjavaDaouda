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
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        GroupeTD td=new GroupeTD(4);
        td.ajouterEtudiant(new Etudiant("Sene","Pierre",12));
        td.ajouterEtudiant(new EtudiantSportif("Fall","Fatou",15,"Nataion"));
        td.ajouterEtudiant(new EtudiantEtranger("Ndiaye","Moussa",20,"Senegal"));
        td.afficherListe();
    }
    
}
