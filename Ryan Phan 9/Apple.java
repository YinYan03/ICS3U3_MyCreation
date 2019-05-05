/*  Name: Ryan Phan
 *  Teacher: Mr.Rosen
 *  Date: October 22, 2018
 *  This class contains the draw commands for the apples!
 *  This class contains 3 overloaded constructors!!!
 *  The basic constructor creates a basic red apple in a specific predetermined location.
 *  The 2nd constructor allows a parameter pass to change the apple color and to change the distance
 *  from the inital predetermined position.
 *  The 3rd constructor does the same as the second constructor but this time with a new delay time
 *  used to control the speed of the animation.
 */

import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class Apple extends Thread
{
    private Console c;
    private Color appleColor;
    private int delay = 10;
    private int space;

    // Colours Used For The Apples: 4
    // -------------------------------------------------------------------------------------
    private Color wallGrey = new Color (83, 104, 120); // Color used for the erase
    private Color black = new Color (0, 0, 0);         // Color used for stem and faces
    private Color leafGreen = new Color (0, 153, 76);  // Color used for the apple leaf

    public void appleWalkLeft ()
    {
	// Loop used to animate the apples walking in
	for (int x = 0 ; x <= 400 ; x++)
	{
	    // Erase
	    c.setColor (wallGrey);
	    c.fillRect (730 + space - x, 354, 81, 84);

	    // Stem and Leaf
	    c.setColor (leafGreen);
	    c.fillArc (770 + space - x, 358, 20, 20, 45, 180);
	    c.setColor (Color.black);
	    c.fillRect (765 + space - x, 355, 5, 20);

	    // Apple Body
	    c.setColor (appleColor);
	    c.fillArc (730 + space - x, 358, 80, 80, 180, 180);
	    c.fillArc (750 + space - x, 368, 60, 61, 0, 180);
	    c.fillArc (730 + space - x, 368, 60, 60, 0, 180);

	    // Apple Eyes
	    c.setColor (black);
	    c.fillOval (757 + space - x, 397, 6, 6);
	    c.fillOval (777 + space - x, 397, 6, 6);

	    // Apple Mouth
	    c.drawLine (770 + space - x, 410, 765 + space - x, 405);
	    c.drawLine (770 + space - x, 410, 775 + space - x, 405);

	    // Used to delay the animation
	    try
	    {
		sleep (delay);
	    }
	    catch (Exception e)
	    {
	    }
	}


    }


    public void appleRunRight ()
    {
	// Used to make the apples wait before moving.
	try
	{
	    sleep (4750);
	}
	catch (Exception e)
	{
	}

	// Loop used to animate the apples running away
	for (int x = 0 ; x <= 400 ; x++)
	{
	    // Erase
	    c.setColor (wallGrey);
	    c.fillRect (329 + space + x, 354, 81, 84);

	    // Stem and Leaf
	    c.setColor (leafGreen);
	    c.fillArc (370 + space + x, 358, 20, 20, 45, 180);
	    c.setColor (Color.black);
	    c.fillRect (365 + space + x, 355, 5, 20);

	    // Apple Body
	    c.setColor (appleColor);
	    c.fillArc (330 + space + x, 358, 80, 80, 180, 180);
	    c.fillArc (350 + space + x, 368, 60, 61, 0, 180);
	    c.fillArc (330 + space + x, 368, 60, 60, 0, 180);

	    // Apple Eyes
	    c.setColor (black);
	    c.fillOval (357 + space + x, 397, 6, 6);
	    c.fillOval (377 + space + x, 397, 6, 6);

	    // Apple Mouth
	    c.drawLine (370 + space + x, 410, 365 + space + x, 405);
	    c.drawLine (370 + space + x, 410, 375 + space + x, 405);

	    // Used to delay the animation
	    try
	    {
		sleep (2);
	    }
	    catch (Exception e)
	    {
	    }
	}
    }


    // Default Apple
    public Apple (Console con)
    {
	c = con;
	appleColor = new Color (255, 51, 51);  // Default Apple Color
    }


    // Apple with spacing and a colour parameter
    public Apple (Console con, Color n, int s)
    {
	c = con;
	appleColor = n;
	space = s;
    }


    // Apple with a Color parameter, spacing, and a new delay time
    public Apple (Console con, Color n, int s, int t)
    {
	c = con;
	appleColor = n;
	space = s;
	delay = t;
    }


    public void run ()
    {
	appleWalkLeft ();
	appleRunRight ();
    }
}


