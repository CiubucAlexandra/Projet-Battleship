package Ciubuc.Alexandra_Cristina;

import java.util.ArrayList;

public abstract class Player {
	private String name;
	private String status="human";
	private Player opponent;
	private Fleet f= new Fleet();
	private ArrayList<Coordonnes> cAttacks= new ArrayList<Coordonnes>();
	private ArrayList<Ship>shipsDestroyed = new ArrayList<Ship>();
	private ArrayList<Coordonnes> save= new ArrayList<Coordonnes>();
	
	private char[][] map= new char [10][10];
	private char[][] map1= new char [10][10];
	

	public abstract void creationFleet();
	public abstract Coordonnes attack();
	
	public ArrayList<Coordonnes> getSave() {
		return save;
	}
	public void setSave(ArrayList<Coordonnes> save) {
		this.save = save;
	}
	public void fillBoard() {
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){	
				map[i][j]='~';
			}
		}
		for(int i=0;i<10;i++){
			for(int j=0;j<10;j++){	
				map1[i][j]='~';
			}
		}
	}
	
	public char[][] getMap1() {
		return map1;
	}

	public void setMap1(char[][] map1) {
		this.map1 = map1;
	}

	public char[][] getMap() {
		return map;
	}

	public void setMap(char[][] map) {
		this.map = map;
	}

	
	
	public void addMap(Ship s) {
		for ( Coordonnes key : s.getPos().keySet() ) {
			map[key.getY()-1][(int)key.getX()-65]='X';
		}
	}
	
	public Player(String name, String status) {
		this.name = name;
		this.status = status;
		
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Player getOpponent() {
		return opponent;
	}

	public void setOpponent(Player opponent) {
		this.opponent = opponent;
	}

	public Fleet getF() {
		return f;
	}

	public void setF(Fleet f) {
		this.f = f;
	}

	public ArrayList<Coordonnes> getcAttacks() {
		return cAttacks;
	}

	public void setcAttacks(ArrayList<Coordonnes> cAttacks) {
		this.cAttacks = cAttacks;
	}


	public ArrayList<Ship> getShipsDestroyed() {
		return shipsDestroyed;
	}

	public void setShipsDestroyed(ArrayList<Ship> shipsDestroyed) {
		this.shipsDestroyed = shipsDestroyed;
	}

	public char getCharForNumber(int i) {// function to convert int in char
	    char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	    if (i > 25) {
	        return '.';
	    }
	    return alphabet[i];
	}
	public void showBoard(){
		for(int i=0;i<=10;i++){
			for(int j=0;j<=10+1;j++){
				if(i==0 && j==0){
					System.out.print(' ');
				}else if(j==0){
					System.out.print(i);
				}else if(j==1){
					if (i<10) {
						System.out.print(" ");
					}
				}else if(i==0){
					System.out.print(getCharForNumber(j-2));
				}else{
					System.out.print(map[i-1][j-2]);
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	
	public void showTirBoard(){
		for(int i=0;i<=10;i++){
			for(int j=0;j<=10+1;j++){
				if(i==0 && j==0){
					System.out.print(' ');
				}else if(j==0){
					System.out.print(i);
				}else if(j==1){
					if (i<10) {
						System.out.print(" ");
					}
				}else if(i==0){
					System.out.print(getCharForNumber(j-2));
				}else{
					System.out.print(map1[i-1][j-2]);
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public boolean afterAttack(Coordonnes c) {
		boolean succes=false;
		for(int i=0; i<this.getF().getFlota().size(); i++) {
			
			 if (this.getF().getFlota().get(i).isHit(c)) {
				 this.getF().getFlota().get(i).Hit(c);
				succes=true;
				 if (!this.getcAttacks().contains(c)) {
					 this.getcAttacks().add(c);
				 this.getMap()[c.getY()-1][(int)c.getX()-65]= '*';
				 }
				 System.out.println("Tu as reussi de me toucher un bateau!");
			 
				 if (this.getF().getFlota().get(i).isDestroyed()) {
					this.getShipsDestroyed().add(this.getF().getFlota().get(i));
					this.getF().getFlota().remove(this.getF().getFlota().get(i));
					System.out.println("Un bateau de mes bateau A ete coule!");
				}
			 
			 }
		}
		return succes;
	}
}
