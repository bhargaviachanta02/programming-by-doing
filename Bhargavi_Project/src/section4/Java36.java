package section4;

import java.util.Scanner;

public class  Java36
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        double m, kg, bmi;
        String cat="";
        
        System.out.print("Your height in meters: ");
        m = keyboard.nextDouble();
        System.out.print("Your weight in kilograms: ");
        kg = keyboard.nextDouble();
        System.out.println("");
        
        bmi = kg/(m * m);
        
        if (bmi < 15.0)
        {
            cat = "very severely underweight";
        }
        
        if (bmi >= 15.0 && bmi <= 16.0)
        {
            cat = "severely underweight";
        }
        
        if (bmi >= 16.1 && bmi <= 18.4)
        {
            cat = "underweight";
        }
        
        else if (bmi >= 18.5 && bmi <= 24.9)
        {
            cat = "normal weight";
        }
        
        if (bmi >= 25.0 && bmi <= 29.9)
        {
            cat = "overweight";
        }
        
        if (bmi >= 30.0 && bmi <= 34.9)
        {
            cat = "moderately obese";
        }
        
        if (bmi >= 35.0 && bmi <= 39.9)
        {
            cat = "severely obese";
        }
        
        if (bmi >= 40.0 )
        {
            cat = "very severly obese";
        }
        
        System.out.println("Your BMI: " + bmi );
        System.out.println("BMI Category: " + cat );
    }
}
