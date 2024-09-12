package test;

public class Crosskt {

	abstract class google
	{
	 abstract void google_auth() ;
	 abstract void google_login();
	 
	  void facebook_login() 
	  {
	   System.out.println("xza");
	  }
	 
	  void facebook_auth() 
	  {
	   
	  }
	  
	public static class  InterfaceOne  extends google

	{
	public static void main(String[] args)
	{
	 
	 InterfaceOne s1 = new InterfaceOne();
	 
	 s1.google_auth();
	 s1.facebook_login();
	}
	void google_auth()
	{
	  System.out.println("abc"); 
	}

	void google_login()
	{ 
	 
	}


	}
}}
