package javase.problems;

import java.util.Scanner;

public class ScannerNextDoubleIssue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);

System.out.println("Enter Double");

//the Scanner.nextInt method does not consume the last newline character of your input
double v1 = sc.nextDouble();


System.out.println("Double Value is "+ v1+"Enter String1");

String s1 = sc.nextLine();

System.out.println("String Value is "+s1+"Enter String 2"); 

String s2 = sc.nextLine();

//System.out.println("String Value is "+s2+"Enter String 2"); 

System.out.println( v1+""+s1+""+ s2+" ended");



	}

}
