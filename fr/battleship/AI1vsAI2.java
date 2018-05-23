package fr.battleship;

import java.util.ArrayList;


public class AI1vsAI2 implements AIGame{
	public int createGame() {
		int round1=0;
		int round2=2;
		int winner=0;
		char[][] h= new char [10][10];
		ArrayList<Coordonnes> save= new ArrayList<Coordonnes>();
		ArrayList<Coordonnes> posibil= new ArrayList<Coordonnes>();
		AIPlayerV1 p1= new AIPlayerV1 ("P1", "AI1");
		AIPlayerV1 p2= new AIPlayerV1 ("P2", "AI0");
		AIPlayerV1 p3= new AIPlayerV1 ("P2", "FAIL");
	
		p1.fillBoard();
		p1.creationFleet();

		p2.fillBoard();
		p2.creationFleet();
		
	
		boolean reponse=false;
		Coordonnes c1;
		 Coordonnes c2;
		int s1=0;
		int s2=0;
		 while(p1.getShipsDestroyed().size()!=5 && p2.getShipsDestroyed().size()!=5 ) {
			 if(round1==0) {
			  c1 = p1.attack();
			 if (p2.afterAttack(c1)) {
				 h=p1.getMap1();
				 h[c1.getY()-1][(int)c1.getX()-65]= 'S';
				 p1.setMap1(h);
				 s1=s1+1;
			 }
			
			 round1=1;
			 round2=0;
			 
			 }
			 
			 
			 
		if (round2==0&&p2.getShipsDestroyed().size()!=5) {
		 if(posibil.size()==0) {
			 reponse=false;
		 }
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
			 s2 = s2+1;

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
		 round1=0;
		 round2=1;
	}
}
		 if(p1.getShipsDestroyed().size()==5 && p2.getShipsDestroyed().size()!=5 ) {
			 winner=2;
		 }else if (p1.getShipsDestroyed().size()!=5 && p2.getShipsDestroyed().size()==5 ) {
			 winner=1;
		 }
		 if(winner==1) {
			 return 1;
		 }else if(winner==2) {
			 return 2;
		 }
		return 3;
	
	}
}
