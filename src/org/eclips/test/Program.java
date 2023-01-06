package org.eclips.test;

import org.eclipse.model.Point;
import org.eclipse.model.TroisPoints;

public class Program {

	public static void main(String[] args) {
	Point p1 = new Point(2 , 0);
	Point p2 = new Point(6 , 0);
	Point p3 = new Point(8 , 0);
	System.out.println(p1);
	System.out.println(p2);
	System.out.println(p1.calculerDistance(p2));
	System.out.println(Point.distance(p1, p2));
	System.out.println(p1.calculerMilieu(p2));
	TroisPoints troisPoints = new TroisPoints(p1 , p2 , p3);
	System.out.println(troisPoints.sontAlignes());
	System.out.println(troisPoints.estIsocele());

	}

}
