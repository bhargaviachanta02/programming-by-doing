package section13;

public class Java142
{
	public static void main( String[] args )
	{

		int[] arr1 = new int[10];
		int[] arr2 = new int[10];
		int i;

		for ( i = 0; i < arr1.length; i++ )// set random values into arr1
		{
		arr1[i] = 1 + (int)(Math.random() * 100);
		}
		
		// copying part:

		for ( i = 0; i < arr2.length; i++ )// copy arr1 to arr2
		{
			arr2[i] = arr1[i];
		}
		arr1[(arr1.length - 1)] = -9;// replacing arr1 last val to -7
        
		
		// After replacing printing the values of array1 :
		
		System.out.print( "Array 1: " );
		for ( i = 0; i < arr1.length; i++ )
		{
			System.out.print( arr1[i] + " " );
		}
		System.out.println();
		
		
		// After replacing printing the values of array2 :
	
		System.out.print( "Array 2: " );
		for ( i = 0; i < arr2.length; i++ )
		{
		System.out.print( arr2[i] + " " );
		}
		System.out.println();
    }
}

