package fr.battleship;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;



public class AIPlayerV0 extends PlayerAI {
	public AIPlayerV0(String name, String status) {
		super(name, status);
	}
	
	
	
	public void creationFleet() {
		Ship s1;
		Coordonnes c1Start;
		Coordonnes c1End;
		Ship s2;
		Coordonnes c2Start;
		Coordonnes c2End;
		Ship s3;
		Coordonnes c3Start;
		Coordonnes c3End;
		Ship s4;
		Coordonnes c4Start;
		Coordonnes c4End;
		Ship s5;
		Coordonnes c5Start;
		Coordonnes c5End;

		
		do {
			Random r1 = new Random();
			Random r2 = new Random();
			char x1Start = (char)(r2.nextInt('K' - 'A') + 'A');
			int y1Start = r1.nextInt((10 - 1) + 1) + 1;
			
			c1Start=new Coordonnes(x1Start,y1Start);
			c1End = chooseShipEnd(c1Start, 2);
			s1 = new Ship(c1Start, c1End,"DESTROYER");
			
		}while( c1Start.validationCoordonates()!=true || c1End.validationCoordonates()!=true ||  s1.positionValidation()!=true || s1.sizeValidation()!=true || this.getF().validationAddShip(s1)!=true);
		this.getF().getFlota().add(s1);
		addMap(s1);
		
		 do {
			Random r3 = new Random();
			Random r4 = new Random();
			char x2Start = (char)(r4.nextInt('K' - 'A') + 'A');
			int y2Start = r3.nextInt((10 - 1) + 1) + 1;
			
			c2Start=new Coordonnes(x2Start,y2Start);
			c2End = chooseShipEnd(c2Start, 3);
			s2 = new Ship(c2Start, c2End,"SUBMARINE");
		
		}while( c2Start.validationCoordonates()!=true || c2End.validationCoordonates()!=true ||  s2.positionValidation()!=true || s2.sizeValidation()!=true ||  this.getF().validationAddShip(s2)!=true);
		 this.getF().getFlota().add(s2);
			addMap(s2);	
			
			
		do {
			Random r5 = new Random();
			Random r6 = new Random();
			char x3Start = (char)(r6.nextInt('K' - 'A') + 'A');
			int y3Start = r5.nextInt((10 - 1) + 1) + 1;
			
			c3Start=new Coordonnes(x3Start,y3Start);
			c3End = chooseShipEnd(c3Start, 3);
			s3 = new Ship(c3Start, c3End,"CRUISER");
			
		}while( c3Start.validationCoordonates()!=true || c3End.validationCoordonates()!=true ||  s3.positionValidation()!=true || s3.sizeValidation()!=true || this.getF().validationAddShip(s3)!=true);
		this.getF().getFlota().add(s3);
		addMap(s3);
		
		do {
			Random r7 = new Random();
			Random r8 = new Random();
			char x4Start = (char)(r8.nextInt('K' - 'A') + 'A');
			int y4Start = r7.nextInt((10 - 1) + 1) + 1;
			
			c4Start=new Coordonnes(x4Start,y4Start);
			c4End = chooseShipEnd(c4Start, 4);
			s4 = new Ship(c4Start, c4End,"BATTLESHIP");
			
		}while(c4Start.validationCoordonates()!=true || c4End.validationCoordonates()!=true || s4.positionValidation()!=true || s4.sizeValidation()!=true ||  this.getF().validationAddShip(s4)!=true);
		this.getF().getFlota().add(s4);
		addMap(s4);
		
		do {
			Random r9 = new Random();
			Random r10 = new Random();
			char x5Start = (char)(r10.nextInt('K' - 'A') + 'A');
			int y5Start = r9.nextInt((10 - 1) + 1) + 1;
			
			c5Start=new Coordonnes(x5Start,y5Start);
			c5End = chooseShipEnd(c5Start, 5);
			s5 = new Ship(c5Start, c5End,"CARRIER");
			
		}while( c5Start.validationCoordonates()!=true || c5End.validationCoordonates()!=true  || s5.positionValidation()!=true || s5.sizeValidation()!=true ||  this.getF().validationAddShip(s5)!=true);
		this.getF().getFlota().add(s5);
		addMap(s5);
	}
		

	public Coordonnes chooseShipEnd(Coordonnes c, int size) {
		Random r = new Random();
		int n = r.nextInt((4 - 1) + 1) + 1;
		if(n==1) {
			return c.down(size-1);
		}else if(n==2) {
			return c.up(size-1);
		}else if(n==3) { 
			return c.right(size-1);
		}else {
			return c.left(size-1);}
	}
	
	
	public Coordonnes attack() {
		Coordonnes cAttack;
		do {
		Random r1 = new Random();
		Random r2 = new Random();
		char x2Attack = (char)(r2.nextInt('K' - 'A') + 'A');
		int y2Attack = r1.nextInt((10 - 1) + 1) + 1;
		cAttack=new Coordonnes(x2Attack,y2Attack);
		
		}while(cAttack.validationCoordonates()!=true );
		if(this.getMap1()[cAttack.getY()-1][(int)cAttack.getX()-65]!=('S')) {
			this.getMap1()[cAttack.getY()-1][(int)cAttack.getX()-65]= '#';
		}
		return cAttack;
			
		}
	

}
