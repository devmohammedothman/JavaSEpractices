package javase.ocpinherit;

public class Car extends Vechile{
	
	//define instance variable with default access modifier
	//try to access this variable in another class in same package through object
	int speed;
	
	//you can't make method of parent class less restrictive
	//you can increase from default to public
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
	}

}
