package javase.problems;

import java.util.ArrayList;
import java.util.Arrays;

class Point2D
{
	int x =0;
	int y = 0;
	
	Point2D(){}
	Point2D(int x , int y)
	{
		this.x = x;
		this.y = y;
	}
}


public class DXC3CodilityTask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DXC3CodilityTask3 objTest = new DXC3CodilityTask3();
		
		Point2D[] A = new Point2D [] {
    			new Point2D(3,2),
    			new Point2D(6,3),
    			new Point2D(2,5),
    			new Point2D(5,2),
    			new Point2D(0,0),
    			new Point2D(4,4),
    	} ;
        System.out.println(objTest.solution(A));
	}
	
	public int solution(Point2D[] pointsArr)
    {
		ArrayList<Point2D> points = new ArrayList<>(Arrays.asList(pointsArr));
        ArrayList<Point2D> convexHull = new ArrayList<Point2D>();

        if (points.size() < 3)
            return ((ArrayList) points.clone()).size();
 
        int minPoint = -1, maxPoint = -1;
        int minX = Integer.MAX_VALUE;
        int maxX = Integer.MIN_VALUE;
        for (int i = 0; i < points.size(); i++)
        {
        	if(points.get(i) == null)
        		return 0;
        	
            if (points.get(i).x < minX)
            {
                minX = points.get(i).x;
                minPoint = i;
            }
            if (points.get(i).x > maxX)
            {
                maxX = points.get(i).x;
                maxPoint = i;
            }
        }
        Point2D A = points.get(minPoint);
        Point2D B = points.get(maxPoint);
        convexHull.add(A);
        convexHull.add(B);
        points.remove(A);
        points.remove(B);
 
        ArrayList<Point2D> leftSet = new ArrayList<Point2D>();
        ArrayList<Point2D> rightSet = new ArrayList<Point2D>();
 
        for (int i = 0; i < points.size(); i++)
        {
        	Point2D p = points.get(i);
            if (getLocation(A, B, p) == -1)
                leftSet.add(p);
            else if (getLocation(A, B, p) == 1)
                rightSet.add(p);
        }
        hullSet(A, B, rightSet, convexHull);
        hullSet(B, A, leftSet, convexHull);
 
        return convexHull.size();
    }
	//method to find point distance in polygon
	public int getPointdistance(Point2D A, Point2D B, Point2D C)
    {
        int ABx = B.x - A.x;
        int ABy = B.y - A.y;
        int num = ABx * (A.y - C.y) - ABy * (A.x - C.x);
        if (num < 0)
            num = -num;
        return num;
    }
	
	//recursive function to get hull
	public void hullSet(Point2D A, Point2D B, ArrayList<Point2D> set,
            ArrayList<Point2D> hull)
    {
        int insertPosition = hull.indexOf(B);
        if (set.size() == 0)
            return;
        if (set.size() == 1)
        {
        	Point2D p = set.get(0);
            set.remove(p);
            hull.add(insertPosition, p);
            return;
        }
        int dist = Integer.MIN_VALUE;
        int furthestPoint = -1;
        for (int i = 0; i < set.size(); i++)
        {
        	Point2D p = set.get(i);
            int distance = getPointdistance(A, B, p);
            if (distance > dist)
            {
                dist = distance;
                furthestPoint = i;
            }
        }
        Point2D P = set.get(furthestPoint);
        set.remove(furthestPoint);
        hull.add(insertPosition, P);
 
        // Determine who's to the left of AP
        ArrayList<Point2D> leftSetAP = new ArrayList<Point2D>();
        for (int i = 0; i < set.size(); i++)
        {
        	Point2D M = set.get(i);
            if (getLocation(A, P, M) == 1)
            {
                leftSetAP.add(M);
            }
        }
 
        // Determine who's to the left of PB
        ArrayList<Point2D> leftSetPB = new ArrayList<Point2D>();
        for (int i = 0; i < set.size(); i++)
        {
        	Point2D M = set.get(i);
            if (getLocation(P, B, M) == 1)
            {
                leftSetPB.add(M);
            }
        }
        hullSet(A, P, leftSetAP, hull);
        hullSet(P, B, leftSetPB, hull);
 
    }
	
	//get point location in the polygon
	public int getLocation(Point2D A, Point2D B, Point2D P)
    {
        int cp1 = (B.x - A.x) * (P.y - A.y) - (B.y - A.y) * (P.x - A.x);
        if (cp1 > 0)
            return 1;
        else if (cp1 == 0)
            return 0;
        else
            return -1;
    }

}
