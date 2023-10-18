package com.AliIssa;

import java.util.Arrays;
import java.util.PriorityQueue;

public class MainPoints {
	public static void main(String[] args) {
		// creating our points
		Point pt1 = new Point(0,0);
		Point pt2 = new Point(-1,0);
		Point pt3 = new Point(1,1);
		Point pt4 = new Point(1,0);
		
		//creating an array of points
		Point[] points = {pt1, pt2, pt3, pt4};
		System.out.println("Original Points Array: " + Arrays.toString(points));
		
		// Using sortpoints() method to sort the array of points
		Point[] sortedpoints = sortpoints(points);
		System.out.println("Original Points Array: " +Arrays.toString(sortedpoints));
	}
	
	public static Point[] sortpoints(Point[] points) {
		int indx = 0;
		//Creating the PriorityQueue
		PriorityQueue<Point> pointsQueue = new PriorityQueue<>(new PointComparator());// using our own comparator
		
		// Insertion step 
		for(Point point: points) {
			pointsQueue.add(point);
		}
		
		//Selection Step: Getting our values from the order queue
		while(!pointsQueue.isEmpty()) {
			points[indx++] = pointsQueue.remove();
		}
			
		return points;
		
	}

}
