package Ciubuc.Alexandra_Cristina;

import java.util.Scanner;

public class Battleship {
	public static void main(String[] args) {
		
		 System.out.println("Pour commencer le jeu vous devrez choisir le type: " + "\n");
		 System.out.println("Pour le jeu avec les deux joueurs humains appuyez 1 "+ "\n");
		 System.out.println("Pour le jeu un joueur humain et un joueur AI niveau facile appuyez 2 "+ "\n");
		 System.out.println("Pour le jeu un joueur humain et un joueur AI niveau medium appuyez 3 "+ "\n");
		 System.out.println("Pour le jeu un joueur humain et un joueur AI niveau difficile appuyez 4 "+ "\n");
		 System.out.println("S'il vous plait,  faire un choix: ");
		 Scanner choix = new Scanner(System.in);
		 String s = choix.nextLine();;
		 int choice = Integer.parseInt(s);
		 System.out.println("Attention de bien introduire les coordonnes de ce type: A1!!! ");
		
		 
		 if (choice==1) {
			 HvsHGame game = new HvsHGame();
			 Player p1  = new HumanPlayer ("", "human");
			 Player p2= new HumanPlayer ("", "human");
			 game.createGame(p1,p2);
			 System.out.println("Veux-tu prendre ta revanche? Entrez OUI et le prochain jeu commencera en changeant l'ordre des joueurs! ");
			 Scanner r = new Scanner(System.in);
			 String revanche = choix.nextLine();;
			 
			 if(revanche.equals("OUI")) {
				 HvsHGame game2 = new HvsHGame();
				 Player p3  = new HumanPlayer ("", "human");
				 Player p4= new HumanPlayer ("", "human");
				 game.createGame(p3,p4);	 
			 }else {
				 System.out.println("Le jeu c'est fini! :)");
			 }
		 }else if(choice==2) {
			 HvsAIGame game = new HvsAIGame();
			 Player p1  = new HumanPlayer ("", "human");
			 Player p2  = new AIPlayerV0 ("CPU", "AIV0");
			 game.createGame(p1, p2);
			 System.out.println("Veux-tu prendre ta revanche? Entrez OUI et le prochain jeu commencera en changeant l'ordre des joueurs! ");
			 Scanner r = new Scanner(System.in);
			 String revanche = choix.nextLine();;
			 
			 if(revanche.equals("OUI")) {
				 HvsAIGame game2 = new HvsAIGame();
				 Player p3  = new AIPlayerV0 ("CPU", "AIV0");
				 Player p4= new HumanPlayer ("", "human");
				 game.createGame(p3,p4);	 
			 }else {
				 System.out.println("Le jeu c'est fini! :)");
			 }
		 }else if(choice==3) {
			 HvsAIGame game = new HvsAIGame();
			 Player p1  = new HumanPlayer ("", "human");
			 Player p2  = new AIPlayerV1 ("CPU", "AIV1");
			 game.createGame(p1, p2);
			 System.out.println("Veux-tu prendre ta revanche? Entrez OUI et le prochain jeu commencera en changeant l'ordre des joueurs! ");
			 Scanner r = new Scanner(System.in);
			 String revanche = choix.nextLine();;
			 
			 if(revanche.equals("OUI")) {
				 HvsHGame game2 = new HvsHGame();
				 Player p3  = new AIPlayerV1 ("CPU", "AIV1");
				 Player p4= new HumanPlayer ("", "human");
				 game.createGame(p3,p4);	 
			 }else {
				 System.out.println("Le jeu c'est fini! :)");
			 }
		 }else if(choice==4) {
			 HvsAIGame game = new HvsAIGame();
			 Player p1  = new HumanPlayer ("", "human");
			 Player p2  = new AIPlayerV2 ("CPU", "AIV2");;
			 game.createGame(p1, p2);
			 System.out.println("Veux-tu prendre ta revanche? Entrez OUI et le prochain jeu commencera en changeant l'ordre des joueurs! ");
			 Scanner r = new Scanner(System.in);
			 String revanche = choix.nextLine();;
			 
			 if(revanche.equals("OUI")) {
				 HvsAIGame game2 = new HvsAIGame();
				 Player p3  = new AIPlayerV2 ("CPU", "AIV2");
				 Player p4= new HumanPlayer ("", "human");
				 game.createGame(p3,p4);	 
			 }else {
				 System.out.println("Le jeu c'est fini! :)");
			 }
		 }else {
			 System.out.println("Votre choix n'a pas �t� ex�cut� correctement, veuillez recommencer. ");
		 }
		
		 }
	 

}
