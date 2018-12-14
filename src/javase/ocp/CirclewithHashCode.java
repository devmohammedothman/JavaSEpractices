package javase.ocp;

import java.util.HashSet;

public class CirclewithHashCode {

	private int xpos,ypos,radius;
	
	public CirclewithHashCode(int x, int y , int r)
	{
		xpos = x;
		ypos = y;
		radius = r;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//defince object from HashSet and fill with Circle object
		HashSet<CirclewithHashCode> circleSet = new HashSet<>();
		
		CirclewithHashCode obj = new CirclewithHashCode(10, 20, 30);
		
		circleSet.add(obj);
		
		System.out.println("object exist in hash set "+circleSet.contains(new CirclewithHashCode(10, 20, 30)));
	}
	
	//override equal method
	public boolean equals(Object arg)
	{
		if(arg == null ) return false;
		if(this == arg) return true;
		
		if(arg instanceof CirclewithHashCode)
		{
			CirclewithHashCode current = (CirclewithHashCode) arg;
			
			if(this.xpos == current.xpos && this.ypos == current.ypos && this.radius == current.radius)
			{
				return true;
			}
		}
		return false;
	}
	
	//override hashCode method
	public int hashCode()
	{
		int hashValue = (7*xpos) ^ (11 * ypos) ^ (53 * radius);
		System.out.println("hash value is "+hashValue);
		return hashValue;
	}

}
