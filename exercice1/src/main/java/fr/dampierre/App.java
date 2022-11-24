package fr.dampierre;

import java.util.Scanner;

public class App {

  // public static void main(String[] args) {
  // // récupérer l'heure actuelle
  // Scanner clavier = new Scanner(System.in);
  // System.out.print("Entrez les heures: ");
  // int heure = clavier.nextInt();
  // clavier.nextLine();
  // System.out.print("Entrez les minutes: ");
  // int minute = clavier.nextInt();
  // clavier.nextLine();
  // System.out.print("Entrez les secondes: ");
  // int seconde = clavier.nextInt();
  // clavier.nextLine();

  // int secondeEcoulee = (heure * 3600 + minute * 60 + seconde) ;
  // //afficher les secondes écoulés depuis minuit
  // System.out.print("Il s'est écoulé "+secondeEcoulee+" secondes depuis minuit"
  // );
  // clavier.close();

  // }
  public static void main(String[] args) {
    demanderEntierEtAfficherParité();

  }

  public static void demanderEntierEtAfficherParité() {

    System.out.println("Entrez un entier");
    Scanner clavier = new Scanner(System.in);
    int entier = clavier.nextInt();
    clavier.close();

    boolean estPair = estPair(entier);

    if (estPair) {
      System.out.println("le nombre est pair");
    } else
      System.out.println("le nombre est impair");
  }

  public static boolean estPair(int nb) {
    ;

    boolean estPair;
    if (nb % 2 == 1) {
      estPair = false;
    } else {
      estPair = true;

    }
    return estPair;
  }

}
