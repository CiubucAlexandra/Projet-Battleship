package fr.battleship;

import java.util.ArrayList;

public class AI0vsAI1 implements AIGame{
	public int createGame() {
		int round1=0;
		int round2=2;
		int score1=0;
		int score2=0;
		String winner = null;
		char[][] h= new char [10][10];
		ArrayList<Coordonnes> save= new ArrayList<Coordonnes>();
		ArrayList<Coordonnes> posibil= new ArrayList<Coordonnes>();
		AIPlayerV1 p3= new AIPlayerV1 ("P1", "human");
	
		 PlayerAI p1  = new AIPlayerV0 ("CPU1", "AIV0");
		 PlayerAI p2= new AIPlayerV1 ("CPU2", "AIV1");
		
		p1.fillBoard();
		p1.creationFleet();
		p2.fillBoard();
		p2.creationFleet();
		
		 while(p1.getShipsDestroyed().size()!=5 && p2.getShipsDestroyed().size()!=5 ) {
			 if(round1==0) {
			 
			 Coordonnes c1 = p1.attack();
			 if (p2.afterAttack(c1)) {
				 h=p1.getMap1();
				 h[c1.getY()-1][(int)c1.getX()-65]= 'S';
				 p1.setMap1(h);
				 score1=score1+1;
			 }
			 round1=1;
			 round2=0;
			
			 }if (round2==0&&p2.getShipsDestroyed().size()!=5) {

			 Coordonnes c2 = p2.attack();
			 if (p1.afterAttack(c2)) {
				 h=p2.getMap1();
				 h[c2.getY()-1][(int)c2.getX()-65]= 'S';
				 p2.setMap1(h);
				 score2=score2+1;
			 }
			 round1=0;
			 round2=1;
			
			 }
		 }
		 if(p1.getShipsDestroyed().size()==5 && p2.getShipsDestroyed().size()!=5 ) {
			 winner=p2.getName();
		 }else if (p1.getShipsDestroyed().size()!=5 && p2.getShipsDestroyed().size()==5 ) {
			 winner=p1.getName();
		 }
		 
	
		 if(winner.equals(p1.getName())) {
			 return 1;
		 }else if(winner.equals(p2.getName())) {
			 return 2;
		 }
		return 3;
	}
	
}
