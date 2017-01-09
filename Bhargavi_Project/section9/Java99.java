package section9;

public class Java99
{
	public static void main( String[] args )// same output it generates for both programmes
	{
		double a;
		
		a = triangleArea(3, 3, 3);
		System.out.println("A triangle with sides 3,3,3 has an area of " + a );// errors can easily fix function used program

		a = triangleArea(3, 4, 5);
		System.out.println("A triangle with sides 3,4,5 has an area of " + a );
 
		a = triangleArea(7, 8, 9);
		System.out.println("A triangle with sides 7,8,9 has an area of " + a );

		System.out.println("A triangle with sides 5,12,13 has an area of " + triangleArea(5, 12, 13) );
		System.out.println("A triangle with sides 10,9,11 has an area of " + triangleArea(10, 9, 11) );
		System.out.println("A triangle with sides 8,15,17 has an area of " + triangleArea(8, 15, 17) );
	}
 
	public static double triangleArea( int a, int b, int c )//HeronsFormula is 30 lines and HeronsFormulaNoFunction is 50
	{
		//  computes the area of a triangle With lengths a, b, and c
		double side, Area;

		side = (a + b + c) / 2;
		Area = Math.sqrt( side*(side - a)*(side - b)*(side - c) );

		return Area;
		// ^ after computing the area, "return" it
	}
}