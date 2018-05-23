package fr.battleship;

import java.util.ArrayList;

public class Fleet {
	private ArrayList<Ship> flota = new ArrayList<Ship>();
	private ArrayList<Coordonnes> positions = new ArrayList<Coordonnes>();
	private Ship s1;
	private Ship s2;
	private Ship s3;
	private Ship s4;
	private Ship s5;
	
	
	public void addShip(Ship s) {
		flota.add(s);
		for ( Coordonnes key : s.getPos().keySet() ) {
			positions.add(key);
			
		}
		
	}
	public void fleetClear() {
		flota.clear();
		positions.clear();
	}

	public Fleet( Ship s1, Ship s2, Ship s3, Ship s4, Ship s5) {
		
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		this.s4 = s4;
		this.s5 = s5;
		
		flota.add(s1);
		flota.add(s2);
		flota.add(s3);
		flota.add(s4);
		flota.add(s5);
	}
	
	public Fleet(ArrayList<Ship> flota, ArrayList<Coordonnes> positions) {
		this.flota = flota;
		this.positions = positions;
	}
	
	public Fleet() {
	
	}
	public boolean validationAddShip(Ship s) {
		//this.getFlota().add(s);
		boolean result = true;
		
			for (int i=0;i<positions.size(); i++) {
				for ( Coordonnes key : s.getPos().keySet() ) {
					if(key.compare(positions.get(i))) {
						//System.out.println("Supraposition de bateau");
						result=false;
					}
				}
			}
			if (result) {
				for ( Coordonnes key : s.getPos().keySet() ) {
					positions.add(key);
				}
			}
			return result;
	}
	
	public ArrayList<Ship> getFlota() {
		return flota;
	}
	public void setFlota(ArrayList<Ship> flota) {
		this.flota = flota;
	}
	public Ship getS1() {
		return s1;
	}
	public void setS1(Ship s1) {
		this.s1 = s1;
	}
	public Ship getS2() {
		return s2;
	}
	public void setS2(Ship s2) {
		this.s2 = s2;
	}
	public Ship getS3() {
		return s3;
	}
	public void setS3(Ship s3) {
		this.s3 = s3;
	}
	public Ship getS4() {
		return s4;
	}
	public void setS4(Ship s4) {
		this.s4 = s4;
	}
	public Ship getS5() {
		return s5;
	}
	public void setS5(Ship s5) {
		this.s5 = s5;
	}
	public ArrayList<Coordonnes> getPositions() {
		return positions;
	}
	public void setPositions(ArrayList<Coordonnes> positions) {
		this.positions = positions;
	}
	
	
	
}
