package fr.battleship;
//import java.util.ArrayList;
import java.util.HashMap;


public class Ship {
	private Coordonnes startCoord = new Coordonnes();
	private Coordonnes endCoord = new Coordonnes();
	private int size;
	private String type;
	private boolean orizontal;
	HashMap<Coordonnes, Boolean> pos = new HashMap<Coordonnes, Boolean>();
	
	public void posClear() {
		pos.clear();
	}
	public Ship(Coordonnes startCoord, Coordonnes endCoord, String type) {
		// coord = "A2"
		this.startCoord = startCoord;
		this.endCoord = endCoord;
		this.type = type;

			if (startCoord.getY()==endCoord.getY()&& ((int)endCoord.getX() - (int)startCoord.getX()>0)) {
				size=(int)(endCoord.getX()) - (int)(startCoord.getX()) + 1;
				orizontal=true;
				for (char j = startCoord.getX(); j <= endCoord.getX() ; j+=1) {
					Coordonnes coord = new Coordonnes(j, startCoord.getY());
					pos.put(coord, false);
					
				}
			}else if (startCoord.getY()==endCoord.getY() && ((int)endCoord.getX() - (int)startCoord.getX() <0))  {
				orizontal=true;
				size=(int)(startCoord.getX()) - (int)(endCoord.getX()) + 1;
				for (char j = endCoord.getX(); j <= startCoord.getX() ; j+=1) {
					Coordonnes coord = new Coordonnes(j, startCoord.getY());
					pos.put(coord, false);
					
				}
			}else if (startCoord.getX()==endCoord.getX() && (endCoord.getY() - startCoord.getY() >0)) {
				size=endCoord.getY() - startCoord.getY() + 1;
				orizontal=false;
				for (int i = startCoord.getY(); i < endCoord.getY()+1 ; i++) {
					
						Coordonnes coord = new Coordonnes(startCoord.getX(), i);
						pos.put(coord, false);
						
				}
			}else if (startCoord.getX()==endCoord.getX() && (endCoord.getY() - startCoord.getY() <0)) {
				size= startCoord.getY() - endCoord.getY() + 1;
				orizontal=false;
				for (int j = endCoord.getY(); j <= startCoord.getY() ; j+=1) {
					Coordonnes coord = new Coordonnes(startCoord.getX(), j);
					pos.put(coord, false);
					
				}
			}
		
	}
	//validation :
	public boolean positionValidation() {
		if (startCoord.getX()==endCoord.getX()|| startCoord.getY()==endCoord.getY() ){
			return true;
		}else{
			//System.out.println("Les coordonnes ne sont pas bonnes. Ecrire de nouveau les coodonnes!");
			return false;
			}
	}
	
	public boolean sizeValidation() {
				if(type.equals("DESTROYER") && size!=2) {
					//System.out.println("wrong size! reintroduire les coordonnes!!1!!");
					return false;
				}else if(type=="SUBMARINE" && size!=3) {
					//System.out.println("wrong size! reintroduire les coordonnes!!2!!");
					return false;
				}else if(type=="CRUISER" && size!=3) {
					//System.out.println("wrong size! reintroduire les coordonnes!3!!");
					return false;
				}else  if(type=="BATTLESHIP" && size!=4) {
					//System.out.println("wrong size! reintroduire les coordonnes!!4!!");
					return false;
				}else  if(type=="CARRIER" && size!=5) {
					//System.out.println("wrong size! reintroduire les coordonnes!!5!!");
					return false;
				}else {
					return true;
					}
				
			
	}
	
	public boolean isHit(Coordonnes missilCoord) {
		boolean hits=false;
		for ( Coordonnes key : pos.keySet() ) {
				if (key.compare(missilCoord)) {
					hits = true;
				}
			}
		
		return hits;
	}
	
	public void Hit(Coordonnes missilCoord) {
		if (isHit(missilCoord)) {
			for ( Coordonnes key : pos.keySet() ) {
				if( key.compare(missilCoord)) {
					pos.put(key,true);
				}
			}
		}
	}
	

	public boolean isDestroyed() {// si tous les place ocuppes par le bateau sont distrue alors la bateau est
									// aussi
		int hits = 0;
		
		for ( Coordonnes key : pos.keySet() ) {
			if( pos.get(key)==true) {
				hits=hits+1;
			}
		}
		if(hits==size) {
			return true;
		}else
			return false;
		
		}


	public Coordonnes getStartCoord() {
		return startCoord;
	}


	public void setStartCoord(Coordonnes startCoord) {
		this.startCoord = startCoord;
	}


	public Coordonnes getEndCoord() {
		return endCoord;
	}


	public void setEndCoord(Coordonnes endCoord) {
		this.endCoord = endCoord;
	}


	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public HashMap<Coordonnes, Boolean> getPos() {
		return pos;
	}


	public void setPos(HashMap<Coordonnes, Boolean> pos) {
		this.pos = pos;
	}
	
	public void shipValidation() {
		
	}



	public boolean isOrisontal() {
		return orizontal;
	}



	public void setOrisontal(boolean orisontal) {
		this.orizontal = orisontal;
	}
	public void printShip() {
		for ( Coordonnes key : pos.keySet() ) {
			System.out.println(key);
		}
		
	}
	
}
