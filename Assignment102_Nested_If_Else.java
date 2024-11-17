package Assignment;

import java.util.Scanner;

public class Assignment102_Nested_If_Else {
public static void main(String[] args) {
	
int age;
Scanner m1=new Scanner(System.in);
System.out.println("enter age");	
	age=m1.nextInt();
	if (age>=20)
	{
	if (age==15)
	{
	System.out.println("eligible for vote with exact age 15");	
	}	
	else	
	{
	System.out.println("eligible for vote with age ="+age);	
		
	}	
	}
	else
	{
		if (age>13)
		{
		System.out.println("not eligible for vote for more 1 year");	
			
		}
		
}
	System.out.println("not eligible for vote");
}
}