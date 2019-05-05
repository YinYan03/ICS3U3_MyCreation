/*  Name: Ryan Phan
 *  Teacher: Mr.Rosen
 *  Date: October 22, 2018
 *  This class contains the draw commands and animations for the knife.
 */

import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class Knife extends Thread
{
    private Console c;

    // Animates the knife falling
    public void knife ()
    {
	// Local Color Variables
	Color wallGrey = new Color (83, 104, 120);    // Used for Erase
	Color silver = new Color (192, 192, 192);     // Used for the knife blade
	Color pinSilver = new Color (230, 230, 250);  // Used for the pins in the knife handle
	Color black = new Color (32, 32, 32);         // Used for the line in the knife blade
	Color brown = new Color (139, 69, 19);        // Used for the knife handle

	// Loop used to animate the Knife
	for (int y = 0 ; y < 448 ; y++)
	{
	    // Erase
	    c.setColor (wallGrey);
	    c.fillRect (47, -200 + y, 35, 130);

	    // Knife Handle
	    c.setColor (brown);
	    c.fillRect (49, -199 + y, 16, 32);

	    // Knife Blade
	    c.setColor (silver);
	    c.fillArc (16, -264 + y, 64, 192, 270, 90);
	    c.setColor (black);
	    c.drawLine (56, -160 + y, 56, -144 + y);

	    // Knife Pins
	    c.setColor (pinSilver);
	    c.fillOval (54, -195 + y, 6, 6);
	    c.fillOval (54, -180 + y, 6, 6);

	    // Used to delay the animation
	    try
	    {
		sleep (5);
	    }
	    catch (Exception e)
	    {
	    }
	}

    }


    // Explosion when the knife comes in contact with the watermelon.
    public void explode ()
    {
	// Local Variables
	Color red = new Color (153, 0, 0);        // Color used in explosion
	Color lightRed = new Color (255, 0, 0);   // Color used in explosion
	Color white = new Color (255, 255, 255);  // Ending Text

	// Loop used to animate the explosion.
	for (int x = 0 ; x < 1500 ; x++)
	{
	    c.setColor (lightRed);
	    c.fillOval (10 - x / 2, 380 - x / 2, x, x);
	    c.setColor (lightRed);
	    c.fillOval (60 - x / 2, 340 - x / 2, x, x);
	    c.setColor (red);
	    c.fillOval (100 - x / 2, 380 - x / 2, x, x);

	    try
	    {
		sleep (1);
	    }
	    catch (Exception e)
	    {
	    }
	}

	// Outputs "The End" after the explosion.
	c.setColor (white);
	c.drawString ("The End", 300, 250);
    }


    public Knife (Console con)
    {
	c = con;
    }


    public void run ()
    {
	knife ();
	explode ();
    }
}


