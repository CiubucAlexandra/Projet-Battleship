package Ciubuc.Alexandra_Cristina;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class HumanPlayer extends Player{
	
	
	
	public HumanPlayer(String name, String status) {
		super(name, status);
		
		
	}

	public void creationFleet() {
		Ship s11;
		Coordonnes c11Start;
		Coordonnes c11End;
		Ship s12;
		Coordonnes c12Start;
		Coordonnes c12End;
		Ship s13;
		Coordonnes c13Start;
		Coordonnes c13End;
		Ship s14;
		Coordonnes c14Start;
		Coordonnes c14End;
		Ship s15;
		Coordonnes c15Start;
		Coordonnes c15End;
		
		
		
		System.out.println("On introduit les coordonnes de START et END des SHIPS pour " + this.getName() +  ": ");
		do {
		//coordonatesStart for ship1 HumanPlayer :
		System.out.println("Le type du bateau c'est DESTROYER donc introduire un ship avec size=2: ");
		Scanner inputStart11 = new Scanner(System.in);
		System.out.println("Coordonne de START SHIP 1 > ");
		String stringStart11 = inputStart11.nextLine();

		char x11Start = stringStart11.charAt(0);
		int y11Start = Integer.parseInt(stringStart11.substring(1));
		c11Start=new Coordonnes(x11Start,y11Start);
		
		//coordonatesEnd for ship1 HumanPlayer :
		Scanner inputEnd11 = new Scanner(System.in);
		System.out.println("Coordonne END SHIP 1 > ");
		String stringEnd11 = inputEnd11.nextLine();
		
		char x11End = stringEnd11.charAt(0);
		int y11End = Integer.parseInt(stringEnd11.substring(1));
		
		c11End=new Coordonnes(x11End,y11End);
		
		s11 = new Ship(c11Start,c11End, "DESTROYER");
		
		}while(s11.positionValidation()!=true || s11.sizeValidation()!=true || c11Start.validationCoordonates()!=true || c11End.validationCoordonates()!=true || this.getF().validationAddShip(s11)!=true );
		this.getF().getFlota().add(s11);
		addMap(s11);
		
		do {
		//coordonatesStart for ship2 HumanPlayer :
		System.out.println("Le type de du ship c'est SUBMARINE donc introduire un ship avec size= 3: ");
		Scanner inputStart12 = new Scanner(System.in);
		System.out.println("Coordonne START SHIP 2 > ");
		String stringStart12 = inputStart12.nextLine();
		
			
		char x12Start = stringStart12.charAt(0);
		int y12Start = Integer.parseInt(stringStart12.substring(1));
		c12Start=new Coordonnes(x12Start,y12Start);
		
		//coordonatesEnd for ship2 HumanPlayer :
		Scanner inputEnd12 = new Scanner(System.in);
		System.out.println("Coordonne END SHIP 2 > ");
		String stringEnd12 = inputEnd12.nextLine();
		
			
		char x12End = stringEnd12.charAt(0);
		int y12End = Integer.parseInt(stringEnd12.substring(1));
		
		c12End=new Coordonnes(x12End,y12End);
		
		
		s12 = new Ship(c12Start,c12End, "SUBMARINE");

		}while(s12.positionValidation()!=true || s12.sizeValidation()!=true || c12Start.validationCoordonates()!=true || c12End.validationCoordonates()!=true || this.getF().validationAddShip(s12)!=true);
		this.getF().getFlota().add(s12);
		addMap(s12);
		do {
		System.out.println("Le type du bateau c'est CRUISER donc introduire un ship avec size= 3: ");
		//coordonatesStart for ship3 HumanPlayer :
		Scanner inputStart13 = new Scanner(System.in);
		System.out.println("Coordonne START SHIP 3 > ");
		String stringStart13 = inputStart13.nextLine();
			
		char x13Start = stringStart13.charAt(0);
		int y13Start = Integer.parseInt(stringStart13.substring(1));
		c13Start=new Coordonnes(x13Start,y13Start);
		
		//coordonatesEnd for ship3 HumanPlayer :
		Scanner inputEnd13 = new Scanner(System.in);
		System.out.println("Coordonne END SHIP 3 > ");
		String stringEnd13 = inputEnd13.nextLine();
		
		char x13End = stringEnd13.charAt(0);
		int y13End = Integer.parseInt(stringEnd13.substring(1));
		
		c13End=new Coordonnes(x13End,y13End);
		
		s13 = new Ship(c13Start,c13End, "CRUISER");

		}while(s13.positionValidation()!=true || s13.sizeValidation()!=true || c13Start.validationCoordonates()!=true || c13End.validationCoordonates()!=true || this.getF().validationAddShip(s13)!=true);
		this.getF().getFlota().add(s13);
		addMap(s13);
		//coordonatesStart for ship4 HumanPlayer :
		do {
		System.out.println("Le type du bateau c'est BATTLESHIP donc introduire un ship avec size= 4: ");
		Scanner inputStart14 = new Scanner(System.in);
		System.out.println("Coordonne START SHIP 4 > ");
		String stringStart14 = inputStart14.nextLine();

		char x14Start = stringStart14.charAt(0);
		int y14Start = Integer.parseInt(stringStart14.substring(1));
		c14Start=new Coordonnes(x14Start,y14Start);
		
		//coordonatesEnd for ship4 HumanPlayer :
		Scanner inputEnd14 = new Scanner(System.in);
		System.out.println("Coordonne END SHIP 4 > ");
		String stringEnd14 = inputEnd14.nextLine();

		char x14End = stringEnd14.charAt(0);
		int y14End = Integer.parseInt(stringEnd14.substring(1));
		
		c14End=new Coordonnes(x14End,y14End);
		
		s14 = new Ship(c14Start,c14End, "BATTLESHIP");

		}while(s14.positionValidation()!=true || s14.sizeValidation()!=true || c14Start.validationCoordonates()!=true || c14End.validationCoordonates()!=true || this.getF().validationAddShip(s14)!=true);
		this.getF().getFlota().add(s14);
		addMap(s14);
		//coordonatesStart for ship5 HumanPlayer :
		do {
		System.out.println("Le type du bateau c'est CARRIER donc introduire un ship avec size= 5: ");
		Scanner inputStart15 = new Scanner(System.in);
		System.out.println("Coordonne START SHIP 5 > ");
		String stringStart15 = inputStart15.nextLine();

		char x15Start = stringStart15.charAt(0);
		int y15Start = Integer.parseInt(stringStart15.substring(1));
		c15Start=new Coordonnes(x15Start,y15Start);
		
		
		//coordonatesEnd for ship5 HumanPlayer :
		Scanner inputEnd15 = new Scanner(System.in);
		System.out.println("Coordonne END SHIP 5 > ");
		String stringEnd15 = inputEnd15.nextLine();

		char x15End = stringEnd15.charAt(0);
		int y15End = Integer.parseInt(stringEnd15.substring(1));
		
		c15End=new Coordonnes(x15End,y15End);
		
		s15 = new Ship(c15Start,c15End, "CARRIER");

		}while(s15.positionValidation()!=true || s15.sizeValidation()!=true || c15Start.validationCoordonates()!=true || c15End.validationCoordonates()!=true || this.getF().validationAddShip(s15)!=true);
		this.getF().getFlota().add(s15);
		addMap(s15);
		
	}
	

	//fonction qui fait generer une coordonne random qui rempli toutes les conditions
	public Coordonnes attack() {
		Coordonnes cAttack;
		do {
		Scanner inputStart11 = new Scanner(System.in);
		System.out.println("Entree la coordonne que vous voulez attaquer: > ");
		String stringStart11 = inputStart11.nextLine();

		char xAttack = stringStart11.charAt(0);
		int yAttack = Integer.parseInt(stringStart11.substring(1));
		cAttack=new Coordonnes(xAttack,yAttack);
	
		}while(cAttack.validationCoordonates()!=true );
		
		if(this.getMap1()[cAttack.getY()-1][(int)cAttack.getX()-65]!=('S')) {
			this.getMap1()[cAttack.getY()-1][(int)cAttack.getX()-65]= '#';
		}	
		return cAttack;
			
			
		}
	
	

}
