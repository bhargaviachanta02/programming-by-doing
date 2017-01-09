package section4;

import java.util.Scanner;

public class Java33
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        String r1="", r2="", r3="",r4="", r5="", r6="", r7="";
        
        System.out.println( "WELCOME TO TINY ADVENTURE!" );
        System.out.println( "" );
        
        System.out.println( "You are in a creepy house! Would you like to go 'upstairs' or into the 'bathroom' " );
        System.out.print( "choose one path and type it: " );
        r1 = keyboard.next();
        System.out.println( "" );
        
       
        if ( r1.equals("upstairs"))
        {
            System.out.println( "You walk straight upstairs. To the left there is an open kitchen. To the right there is a closet with a red cloth on it. You may go into the 'kitchen' or open the 'closet' " );
            System.out.print( "choose one path and type it: " );
            r2 =keyboard.next();
            System.out.println( "" );
            
            if ( r2.equals("left"))
            {
                System.out.println( "You turn left and go into the kitchen where you see blood everywhere on the floor. However, there are a banana and an apple on the counter. Would you like to choose 'banana' or 'apple'? " );
                System.out.print( "choose one path and type it: " );
                r4 =keyboard.next();
                 System.out.println( "" );
            }
                if ( r4.equals("banana"))
                   
                {
                    System.out.println( "The banana looks fine on the outside but there is a huge worm hidding under the peel");
                }
                else if ( r4.equals("apple"))
                   
                {
                    System.out.println( "Ok eat apple and go back to ur home!" );
                }
        }
           
        
                else if ( r2.equals("right"))
            {
                System.out.println( "You open the closet, but unfortunately, you touch the red cloth. Now your hand is rubbed with blood. Would you choose to 'ignore' the blood or 'wipe' it on your pants? " );
                System.out.print( "choose one path and type it: " );
                r5 =keyboard.next();
                System.out.println( "" );
            }
                    if ( r5.equals("ignore"))
                    {
                        System.out.println( "You are an interesting person, but you're dead by now. " );
                    }
                    else if ( r5.equals("wipe"))
                    {
                        System.out.println( "Lucky you! You survived!" );
                    }
        
        else if( r1.equals("bathroom"))
        {
            System.out.println( "You walk into the bathroom with fear. There is no light, but you see a sink and a bathtub. You would like to wash yourself, since you have not taken a shower for days. Would you like to choose to wash your face at the 'sink' or take a bath using the 'bathtub'? ") ;
            System.out.print( "choose one path and type it: " );
            r3 =keyboard.next();
            System.out.println( "" );
        }
            if ( r3.equals("sink"))
            {
                System.out.println( "You walk over to the sink, and see a 'soap' and a 'facial cleanser'. Which one will you choose to use to wash your face? " );
                System.out.print( "choose one path and type it: " );
                r6 =keyboard.next();
            }
                if ( r6.equals("soap"))
                {
                    System.out.println( "Good choice! There is no posion on the soap. " );
                }
                else if (r6.equals("facial cleanser"))
                {
                    System.out.println( "Haha fancy huh? You're dead. " );
                }
            
            else if ( r3.equals("bathtub"))
            {
                System.out.println( "You walk to the bathrub. Then you are thinking about whether to use hot water or cold water. If you want to use hot water, turn the switch to the 'left'. If you want to use cold water, turn the switch to the 'right'. " );
                System.out.print( "choose one path and type it " );
                r7 =keyboard.next();
                System.out.println( "" );
            }
                    if ( r7.equals("left"))
                    {
                        System.out.println( "You are burned with boiling hot water. Sorry, you're dead!" );
                    }
                    else if ( r7.equals("right"))
                    {
                        System.out.println( "Oh hey! you survived! The water is actually pretty warm." );
                    }
      
}
}

