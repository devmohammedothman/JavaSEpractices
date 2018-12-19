package javase.ocp;

public class RunningThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CrashThread thread1 = new CrashThread();
		CrashThread thread2 = new CrashThread();
		
		thread1.start();
		thread2.start();
	}

}
