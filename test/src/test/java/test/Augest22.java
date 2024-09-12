package test;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Augest22 {
    public static void main(String[] args) {


	try {
		Scanner sc1=new Scanner(System.in);
		System.out.println("please enter your age");
		int  age=sc1.nextInt();
		
	}
	catch(InputMismatchException al)
	{
	System.out.println("sorry but this doesnt seems your age,please check again");
	Scanner s2=new Scanner(System.in);
	System.out.println("please enter your age again");
	int age1=  s2.nextInt();
	  
	
	}
    }}

