package org.eclipse.model;

public class Point {
	private double abs;
	private double ord;

	public Point() {
	
}

	public Point(double abs, double ord) {
		super();
		this.abs = abs;
		this.ord = ord;
	}

	public double getAbs() {
		return abs;
	}

	public void setAbs(double abs) {
		this.abs = abs;
	}

	public double getOrd() {
		return ord;
	}

	public void setOrd(double ord) {
		this.ord = ord;
	}
	public double calculerDistance(Point p) {
		return Math.sqrt(Math.pow(this.abs - p.abs , 2) + Math.pow(this.ord - p.ord , 2));
	}
	public static double distance(Point p1, Point p2) {
		return p1.calculerDistance(p2);
	}
	
	  public Point calculerMilieu(Point p) { 
		  var absM = (this.abs + p.abs)/2;
		  var ordM = (this.ord + p.ord)/2;
		  return new Point(absM , ordM);
	 
	 
		
	}

	@Override
	public String toString() {
		return "(" + abs + ", " + ord + ")";
	}


}
