package AlannaBotscharowProgram5;
/*
 * Alanna Botscharow
 * 9/18
 * Chapter 2 program 6. Displays the area and perimeter of a rectangle with the width of 4.5, and height of 7.9. 
 */
public class Program6 {
	
	public static void main(String[] args) {
		//Formula for area of a rectangle: area = length * width 
		//Width = 4.5 
		//length = 7.9 
		
		
	double length;
	double width;
	double area; 
	double perimeter;
	
	
		length = 7.9; 
		width = 4.5;
		perimeter = length + length + width + width; 
		area = length * width; 
		
	System.out.println("the perimeter of the rectangle is: " + perimeter);
	System.out.println("the area of the rectangle is: " + area);
	
		
		
	}

}
