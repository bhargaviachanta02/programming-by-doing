package section11;

public class Java123
{
    public static void main(String[] args)
    {
        for (int a = 10; a <= 1500; a++)
        {
            for (int b = 10; b <= 1500; b++)
            {
                if ( a + b == 60 && b - a == 14 )
                    System.out.println("\n " + a + " " + b );
            }
        }
        System.out.println();
    }
}