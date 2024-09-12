package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptionhandle 
{
	public static void main(String[] args) 
	{
	try  {	
		
	Scanner s1=new Scanner(System.in);
	System.out.println("please enter your age");
    int age=       s1.nextInt();
}
catch(InputMismatchException al)
{
System.out.println("sorry but this donest seems your age,please check again");
Scanner s2=new Scanner(System.in);
System.out.println("please enter your age again");
int age1=        s2.nextInt();
}
}
}