package fr.dampierre;

import java.util.Scanner;

public class App {
    
    public static void main(String[] args) {
        // récupérer l'heure actuelle 
        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrez les heures:  ");
        int heure = clavier.nextInt();
        clavier.nextLine();
        System.out.print("Entrez les minutes: ");
        int minute = clavier.nextInt();
        clavier.nextLine();
        System.out.print("Entrez les secondes: ");
        int seconde = clavier.nextInt();
        clavier.nextLine();

        int secondeEcoulee = (heure * 3600 + minute * 60 + seconde) ;
        //afficher les secondes écoulés depuis minuit 
        System.out.print("Il s'est écoulé "+secondeEcoulee+" depuis minuit" );



    



    }
    
}
