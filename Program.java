package com.sunbeam;
//final Keyword 
/* final field can be initialized using field initializer, obj initializer, or constructor.
 * Once initialized, it cannot be modified again.
 * However, final fields must be initialized (in any of the above options). If not, compiler raise error.
 */ 
class Circle 
{
	private double radius; 
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	private final double PI = 3.14; //field initializer
	{
		//PI = 3.14; //Object init--// NOT ALLOWED because already init in field init 
	}
	public Circle(double radius) {
		//PI = 3.14; // NOT ALLOWED because already init in field init 
		this.radius = radius;
	}
	public double calcArea( )
	{
		return PI * this.radius * this.radius; 
	}
	public double calcPeri( )
	{
		return 2 * PI * this.radius;  
	}
	
	
}
public class Program {

	public static void main(String[] args) {
		final int a; //final var declaration 
		a = 20; // assignment 
		//a = 30; // NOT OK 
		
		Circle c1 = new Circle(4.1); 
		System.out.println("Area : "+c1.calcArea());
		System.out.println("Peri : "+c1.calcPeri());
		final double radius = 14.3; 
		final Circle c2 = new Circle(radius); 
		c2.setRadius(radius);
		//c2 = null; 
		
		//int final b = 30;// NOT OK  

	}

}
