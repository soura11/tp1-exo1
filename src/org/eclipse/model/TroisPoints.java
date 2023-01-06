package org.eclipse.model;

public class TroisPoints {
	private Point premier;
	private Point deuxième;
	private Point troisième;
	
	public TroisPoints() {
		
	}

	public TroisPoints(Point premier, Point deuxième, Point troisième) {
		super();
		this.premier = premier;
		this.deuxième = deuxième;
		this.troisième = troisième;
	}

	public Point getPremier() {
		return premier;
	}

	public void setPremier(Point premier) {
		this.premier = premier;
	}

	public Point getDeuxième() {
		return deuxième;
	}

	public void setDeuxième(Point deuxième) {
		this.deuxième = deuxième;
	}

	public Point getTroisième() {
		return troisième;
	}

	public void setTroisième(Point troisième) {
		this.troisième = troisième;
	}
	public boolean sontAlignes() {
		var d1 = Point.distance(premier, deuxième);
		var d2 = Point.distance(premier, troisième);
		var d3 = Point.distance(troisième, deuxième);
		return (d1 == d2 + d3 || d2 == d1 + d3 || d3 == d1 + d2);
		
	}
	public boolean estIsocele() {
		var d1 = Point.distance(premier, deuxième);
		var d2 = Point.distance(premier, troisième);
		var d3 = Point.distance(troisième, deuxième);
		return (d1 == d2 || d1 == d3 || d3 == d2);
			
	}

	@Override
	public String toString() {
		return "TroisPoints [premier=" + premier + ", deuxième=" + deuxième + ", troisième=" + troisième + "]";
	}
	

}
