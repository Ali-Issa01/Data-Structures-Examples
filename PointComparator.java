package com.AliIssa;

import java.util.Comparator;

public class PointComparator implements Comparator<Point>{

	// first we compare the point using the x-coordinates, if they are the same we use y-coordinates
	public int compare(Point pt1, Point pt2) {
		if(pt1.getX()!= pt2.getX()) {
			return pt1.getX()-pt2.getX();
		}
		else {
		return pt1.getY()-pt2.getY() ;
		}
	}
}
