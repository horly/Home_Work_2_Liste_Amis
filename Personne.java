package com.company;

import java.util.ArrayList;


 /* Home Work 2 Created by ANDELO MATA HORLY and BELABID IKRAM FATIMA ZOHRA on 27/10/2016
  l2 informatique, Groupe 2
 */

public class Personne
{
    private String nom;
    private String prenom;
    private String nationalite;
    private int age;
    private ArrayList<Personne>Amis = new ArrayList<>();

    public Personne(String nom, String prenom, String nationalite, int age,ArrayList<Personne>Amis)
    {
        this.nom = nom;
        this.prenom = prenom;
        this.nationalite = nationalite;
        this.age = age;
        this.Amis = Amis;
    }

    public Personne(String nom, String prenom, String nationalite, int age)
    {
        this.nom = nom;
        this.prenom = prenom;
        this.nationalite = nationalite;
        this.age = age;
    }

    public Personne(Personne autre)
    {
        this.nom = autre.nom;
        this.prenom = autre.prenom;
        this.nationalite = autre.nationalite;
        this.age = autre.age;
    }

    //Les Getters
    public String getNom()
    {
        return nom;
    }

    public String getPrenom()
    {
        return prenom;
    }

    public String getNationalite()
    {
        return nationalite;
    }

    public int getAge()
    {
        return age;
    }

    //Les Setters
    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public void setPrenom(String prenom)
    {
        this.prenom = prenom;
    }

    public void setNationalite(String nationalite)
    {
        this.nationalite = nationalite;
    }


    public void setAge(int age)
    {
        this.age = age;
    }


    public void AjoutAmis(Personne amis)
    {
        this.Amis.add(amis);
    }

    public void SuppAmis(Personne amis)
    {
        this.Amis.remove(amis);
    }

    public void AffichListAmis()
    {
        System.out.println("Ma Liste d'amis : ");
        System.out.println("----------------");
        for (int i = 0; i < Amis.size(); i++)
        {
            System.out.println("* " + Amis.get(i).getNom() + " " + Amis.get(i).getPrenom() + " de nationalité "
                    + Amis.get(i).getNationalite() + " agé(e) de " + Amis.get(i).getAge() + " ans");
        }
    }

    public void AmisEtranger()
    {
        // les amis qui ne sont pas algériens 
        System.out.println("Ma Liste d'amis étrangers : ");
        System.out.println("--------------------------");
        for (int i = 0; i < this.Amis.size(); i++) {
            if(Amis.get(i).getNationalite() != "Agérien" || Amis.get(i).getNationalite() != "Agérienne")
            {
                System.out.println("* " + Amis.get(i).getNom() + " " + Amis.get(i).getPrenom() +
                        " de nationalité "+ Amis.get(i).getNationalite() + " agé(e) de " + Amis.get(i).getAge() + " ans");
            }
        }
    }
 // excellent

    public static void main(String[] args) {

        Personne A = new Personne("Andelo Mata","Horly","Congolaise",23);
        Personne B = new Personne("Belabid","Ikram","Agérienne",19);
        Personne C = new Personne("Amina","Djatou","Algérienne",20);
        Personne D = new Personne("Barma","Ali","Nigérien",22);
        Personne E = new Personne("Orlin","Makanga","Congolaise",23);
        Personne F = new Personne("Franc","Dubosc","Française",20);
        Personne G = new Personne("Amed","Sila","Française",20);

       //On a ajoute les amis
        System.out.println(B.getNom() + " " + B.getPrenom() +  " a  ajouté 6 amis ");
        B.AjoutAmis(A);
        B.AjoutAmis(C);
        B.AjoutAmis(D);
        B.AjoutAmis(E);
        B.AjoutAmis(F);
        B.AjoutAmis(G);

        //affiche la liste de tous les amis ajourés
        System.out.println("La liste de tous les amis de " + B.getNom() + " " + B.getPrenom() + " : ");
        B.AffichListAmis();

        //affiche la liste des amis étrangers
        System.out.println("----------------------------------------------------------");
        System.out.println("\nLa liste des Amis étrangers de " + B.getNom() + " " + B.getPrenom() + " : ");
        B.AmisEtranger();
        //
        System.out.println("----------------------------------------------------------");

        //on retire deux amis
        System.out.println(B.getNom() + " " + B.getPrenom() + " a retiré 2 amis ");
        B.SuppAmis(G);
        B.SuppAmis(C);

        //on a affiche toute la liste après suppression
        System.out.println("La liste de tous les amis de " + B.getNom() + " " + B.getPrenom() + " : ");
        B.AffichListAmis();

        //on affiche la liste des amis étrangers après suppressionb
        System.out.println("----------------------------------------------------------");
        System.out.println("\nLa liste des Amis étrangers de " + B.getNom() + " " + B.getPrenom() + " : ");
        B.AmisEtranger();
    }
}
