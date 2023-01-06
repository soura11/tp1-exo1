package org.eclipse.model;

public class TroisPoints {
	private Point premier;
	private Point deuxi�me;
	private Point troisi�me;
	
	public TroisPoints() {
		
	}

	public TroisPoints(Point premier, Point deuxi�me, Point troisi�me) {
		super();
		this.premier = premier;
		this.deuxi�me = deuxi�me;
		this.troisi�me = troisi�me;
	}

	public Point getPremier() {
		return premier;
	}

	public void setPremier(Point premier) {
		this.premier = premier;
	}

	public Point getDeuxi�me() {
		return deuxi�me;
	}

	public void setDeuxi�me(Point deuxi�me) {
		this.deuxi�me = deuxi�me;
	}

	public Point getTroisi�me() {
		return troisi�me;
	}

	public void setTroisi�me(Point troisi�me) {
		this.troisi�me = troisi�me;
	}
	public boolean sontAlignes() {
		var d1 = Point.distance(premier, deuxi�me);
		var d2 = Point.distance(premier, troisi�me);
		var d3 = Point.distance(troisi�me, deuxi�me);
		return (d1 == d2 + d3 || d2 == d1 + d3 || d3 == d1 + d2);
		
	}
	public boolean estIsocele() {
		var d1 = Point.distance(premier, deuxi�me);
		var d2 = Point.distance(premier, troisi�me);
		var d3 = Point.distance(troisi�me, deuxi�me);
		return (d1 == d2 || d1 == d3 || d3 == d2);
			
	}

	@Override
	public String toString() {
		return "TroisPoints [premier=" + premier + ", deuxi�me=" + deuxi�me + ", troisi�me=" + troisi�me + "]";
	}
	

}
