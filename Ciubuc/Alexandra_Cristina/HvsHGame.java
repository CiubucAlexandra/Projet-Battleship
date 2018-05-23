package Ciubuc.Alexandra_Cristina;

import java.util.Scanner;

public class HvsHGame implements HumanGame{
	
	public void createGame(Player p1, Player p2) {
		int round1=0;
		int round2=2;
		int score1=0;
		int score2=0;
		char[][] h= new char [10][10];
		System.out.println("La bataille navale va commencer! " + '\n');
		System.out.println("On va commencer avec l'initialisation des joueurs et de leurs flottes! " + '\n');
		System.out.println("Pour le JOUEUR NUMERO 1:" + '\n');
		
		//input name HumanPlayer1:
		Scanner inputname1 = new Scanner(System.in);
		System.out.println("Le nom pour le joueur numero 1  > ");
		String name1 = inputname1.nextLine();
		
		p1= new HumanPlayer (name1, "human");
		System.out.println('\n');
		
		//input name HumanPlayer2:
		Scanner inputname2 = new Scanner(System.in);
		System.out.println("Le nom pour le joueur numero 2  > ");
		String name2 = inputname2.nextLine();
		
		 p2= new HumanPlayer (name2, "human");
		
		p1.setOpponent(p2);
		p2.setOpponent(p1);
		
		System.out.println("On continue en initialisant les flottes! " + '\n');
		p1.fillBoard();
		p1.creationFleet();
	
		System.out.println("Votre board est( "+ p1.getName() + " ) : ");
		p1.showBoard();
		System.out.println("Le bord qui contient votre attaques est: ");
		p1.showTirBoard();
		 
		p2.fillBoard();
		p2.creationFleet();
	
		System.out.println("Votre board est( "+ p2.getName() + " ) : ");
		p2.showBoard();
		System.out.println("Le bord qui contient votre attaques est: ");
		p2.showTirBoard();
		
		
		System.out.println("Les attacques vont commence! Etes-vous pret a attaquer??");
		
		 while(p1.getShipsDestroyed().size()!=5 && p2.getShipsDestroyed().size()!=5 ) {
			 if(round1==0) {
			 System.out.println("Le joueur " + p1.getName() + " va attaquer");

			 Coordonnes c1 = p1.attack();
			 if (p2.afterAttack(c1)) {
				 h=p1.getMap1();
				 h[c1.getY()-1][(int)c1.getX()-65]= 'S';
				 p1.setMap1(h);
				 score1=score1+1;
			 }
			 p1.showBoard();
			 p1.showTirBoard();
			 round1=1;
			 round2=0;
			 }if (round2==0&&p2.getShipsDestroyed().size()!=5) {
			 System.out.println("Le joueur " + p2.getName() + " va attaquer");

			 Coordonnes c2 = p2.attack();
			 if (p1.afterAttack(c2)) {
				 h=p2.getMap1();
				 h[c2.getY()-1][(int)c2.getX()-65]= 'S';
				 p2.setMap1(h);
				 score2=score2+1;
			 }
			 p2.showBoard();
			 p2.showTirBoard();
			 round1=0;
			 round2=1;
			 }
		 }
		 System.out.println("Le score du joueur 1 est " + score1);
		 System.out.println("Le score du joueur 2 est " + score2);
		 if(p1.getShipsDestroyed().size()==5 && p2.getShipsDestroyed().size()!=5 ) {
			 System.out.println("Le joueur "+ p2.getName() + " a gange!!!");
		 }else if (p1.getShipsDestroyed().size()!=5 && p2.getShipsDestroyed().size()==5 ) {
			 System.out.println("Le joueur "+ p1.getName() + " a gange!!!");
		 }
		
	}
}
