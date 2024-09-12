package test;
class Overriding{
void MKT(){
	System.out.println("superclass");}}

public class Overridemmo extends Overriding
{
void MKT(){
	System.out.println("subclass");}	
	public static void main(String[] args) {
		Overridemmo o1 =new Overridemmo();
		o1.MKT();}}
		
