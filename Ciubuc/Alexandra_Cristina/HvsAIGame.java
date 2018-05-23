package  Ciubuc.Alexandra_Cristina;
import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class HvsAIGame implements HumanGame{
	public void createGame(Player p1, Player p2) {
		int round1=0;
		int round2=2;
		int score1=0;
		int score2=0;
		Coordonnes c1;
		Coordonnes c2;
		ArrayList<Coordonnes> save= new ArrayList<Coordonnes>();
		ArrayList<Coordonnes> posibil= new ArrayList<Coordonnes>();
		char[][] h= new char [10][10];
		System.out.println("La bataille navale va commencer! " + '\n');
		System.out.println("On va commencer avec l'initialisation des joueurs et de leurs flottes! " + '\n');
		System.out.println("Pour le JOUEUR NUMERO 1:" + '\n');
		
		if(p1.getStatus().equals("human")) {
		//input name HumanPlayer1:
		Scanner inputname1 = new Scanner(System.in);
		System.out.println("Le nom pour le joueur numero 1  > ");
		String name1 = inputname1.nextLine();
		
		p1.setName(name1);
		}
		
		System.out.println('\n');
		
		if(p2.getStatus().equals("human")) {
		//input name HumanPlayer2:
		Scanner inputname2 = new Scanner(System.in);
		System.out.println("Le nom pour le joueur numero 2  > ");
		String name2 = inputname2.nextLine();
		
		 p2.setName(name2);
		}
		
		
		
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
		
		p1.setOpponent(p2);
		p2.setOpponent(p1);
		
		
		boolean reponse=false;
		 while(p1.getShipsDestroyed().size()!=5 && p2.getShipsDestroyed().size()!=5 ) {
			 if(round1==0) {
			 System.out.println("Le joueur " + p1.getName() + " va attaquer");
			 if(p1.getStatus().equals("human") ||p1.getStatus().equals("AIV0") || p1.getStatus().equals("AIV1") ) {
				 c1 = p1.attack();
				 if (p2.afterAttack(c1)) {
					 h=p1.getMap1();
					 h[c1.getY()-1][(int)c1.getX()-65]= 'S';
					 p1.setMap1(h);
					 score1=score1+1;
				 }
			 }else if(p1.getStatus().equals("AIV2")) {
				 if(reponse == false) {
					 c1 = p1.attack();
					 save.add(c1);
				 }else {
					 c1=posibil.get(0);
					 save.add(c1);
					 posibil.remove(0);
					 if(posibil.size()==0) {
						 reponse = false;
					 }
				 }
				 if (p2.afterAttack(c1)) {
					 h=p1.getMap1();
					 h[c1.getY()-1][(int)c1.getX()-65]= 'S';
					 p1.setMap1(h);
					 reponse=true;
					 score1 = score1+1;
					
					if(c1.down(1).validationCoordonates()&& posibil.contains(c1.down(1))==false && save.contains(c1.down(1))==false) {
							posibil.add(c1.down(1));
					}if(c1.up(1).validationCoordonates()&& posibil.contains(c1.up(1))==false && save.contains(c1.up(1))==false) {
							posibil.add(c1.up(1));
							
					}if(c1.left(1).validationCoordonates()&& posibil.contains(c1.left(1))== false && save.contains(c1.left(1))==false) {
							posibil.add(c1.left(1));
						
					}if(c1.right(1).validationCoordonates()&& posibil.contains(c1.right(1))==false && save.contains(c1.right(1))==false) {
							posibil.add(c1.right(1));
							
					}
					
						
				 }
				 
			 }
			 p1.showBoard();
			 p1.showTirBoard();
			 round1=1;
			 round2=0;
			 }if (round2==0&&p2.getShipsDestroyed().size()!=5) {
			 System.out.println("Le joueur " + p2.getName() + " va attaquer");
			 if(p2.getStatus().equals("human") ||p2.getStatus().equals("AIV0") || p2.getStatus().equals("AIV1") ) {
				 c2 = p2.attack();
				 if (p1.afterAttack(c2)) {
					 h=p2.getMap1();
					 h[c2.getY()-1][(int)c2.getX()-65]= 'S';
					 p2.setMap1(h);
					 score2=score2+1;
				 }
			 }else if(p2.getStatus().equals("AIV2")) {
				 if(reponse == false) {
					 c2 = p2.attack();
					 save.add(c2);
				 }else {
					 c2=posibil.get(0);
					 save.add(c2);
					 posibil.remove(0);
					 if(posibil.size()==0) {
						 reponse = false;
					 }
				 }
				 if (p1.afterAttack(c2)) {
					 h=p2.getMap1();
					 h[c2.getY()-1][(int)c2.getX()-65]= 'S';
					 p2.setMap1(h);
					 reponse=true;
					 score2 = score2+1;
					
					if(c2.down(1).validationCoordonates()&& posibil.contains(c2.down(1))==false && save.contains(c2.down(1))==false) {
							posibil.add(c2.down(1));
					}if(c2.up(1).validationCoordonates()&& posibil.contains(c2.up(1))==false && save.contains(c2.up(1))==false) {
							posibil.add(c2.up(1));
							
					}if(c2.left(1).validationCoordonates()&& posibil.contains(c2.left(1))== false && save.contains(c2.left(1))==false) {
							posibil.add(c2.left(1));
						
					}if(c2.right(1).validationCoordonates()&& posibil.contains(c2.right(1))==false && save.contains(c2.right(1))==false) {
							posibil.add(c2.right(1));
							
					}
					
						
				 }
				 
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
