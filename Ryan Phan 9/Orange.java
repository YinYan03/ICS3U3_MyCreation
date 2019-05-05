/*  Name: Ryan Phan
 *  Teacher: Mr.Rosen
 *  Date: October 22, 2018
 *  This class contains the draw commands and animations for the orange.
 */

import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class Orange extends Thread
{
    private Console c;

    // Colours Used For The Orange: 1
    // -------------------------------------------------------------------------------------
    private Color black = new Color (0, 0, 0);          // Text color and faces

    // Method used to output dialogue for the fruits.
    public void dialogue ()
    {
	// Local Color Variables
	Color white = new Color (242, 242, 242);    // Used to erase dialogue

	try
	{
	    sleep (1500);
	}
	catch (Exception e)
	{
	}

	c.setColor (white);
	c.drawString ("Grape: HURRY UP ORANGE!!! YOU'RE TOO SLOW!!!", 5, 470);

	c.setColor (black);
	c.drawString ("Orange: BUT WE DIDN'T TELL WATERMELON!!!", 5, 470);
    }


    // Animates the orange running across the counter.
    public void orangeMoveRight ()
    {
	// Local Color Variables
	Color wallGrey = new Color (83, 104, 120);  // Used for erase
	Color leafGreen = new Color (0, 153, 76);   // Top leaves on orange
	Color orange = new Color (255, 128, 0);     // Orange Body Colour


	// Loop used to animate the orange running right
	for (int x = 0 ; x < 840 ; x++)
	{
	    // Erase
	    c.setColor (wallGrey);
	    c.fillRect (-191 + x, 344, 82, 94);

	    // Stem and Leaves
	    c.setColor (leafGreen);
	    c.fillArc (-165 + x, 341, 20, 20, 135, 180);
	    c.setColor (black);
	    c.fillRect (-154 + x, 346, 7, 15);

	    // Body
	    c.setColor (orange);
	    c.fillOval (-190 + x, 357, 80, 80);

	    // Eyes
	    c.setColor (black);
	    c.fillOval (-163 + x, 395, 6, 6);
	    c.fillOval (-143 + x, 395, 6, 6);

	    // Mouth
	    c.drawLine (-150 + x, 410, -155 + x, 405);
	    c.drawLine (-150 + x, 410, -145 + x, 405);

	    // Used to delay the animation
	    try
	    {
		sleep (3);
	    }
	    catch (Exception e)
	    {
	    }

	}

    }


    //basic cloud
    public Orange (Console con)
    {
	c = con;
    }


    public void run ()
    {
	dialogue ();
	orangeMoveRight ();
    }
}


