package fr.battleship;

public class Coordonnes {
	private char x;
	private int y;
	
	
	public Coordonnes() {
	}

	public Coordonnes(char x, int y) {//x coloana y linia !!!!
		this.x = x;
		this.y = y;
	}

	public char getX() {
		return x;
	}

	public void setX(char x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coordonnes other = (Coordonnes) obj;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}

	public boolean compare(Coordonnes c) {
		if (this.x == c.getX()){
			if (this.y == c.getY()){
				return true;
			}
		}
		return false;
	}
	@Override
	public String toString() {
		return x + "" + y;
	}
	
	public boolean validationCoordonates() {
		if(((int)this.getX()<= 74) && (this.getY()<=10)&&(this.getY()>0)&&((int)this.getX()>= 65)) {
			return true;
		}
		//System.out.println("Les coordonnes ne sont pas bonnes!!!!");
		return false;
		
	}
	public Coordonnes down(int nb) {
		Coordonnes c1;
		int y= getY()+ nb;
		c1 = new Coordonnes(getX(), y);
		return c1;
	}
	public Coordonnes up(int nb) {
		Coordonnes c1;
		int y= getY()- nb;
		c1 = new Coordonnes(getX(), y);
		return c1;
	}
	public Coordonnes right(int nb) {
		Coordonnes c1;
		char x = (char)((int)(getX())-nb);
		c1 = new Coordonnes(x,getY());
		return c1;
	}
	public Coordonnes left(int nb) {
		Coordonnes c1;
		char x = (char)((int)(getX()) + nb);
		c1 = new Coordonnes(x, getY());
		return c1;
	}
}
