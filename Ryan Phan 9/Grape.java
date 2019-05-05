/*  Name: Ryan Phan
 *  Teacher: Mr.Rosen
 *  Date: October 22, 2018
 *  This class contains the draw commands and animations for the grape.
 */

import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class Grape extends Thread
{
    private Console c;

    // Colours Used For The Grape: 1
    // -------------------------------------------------------------------------------------
    private Color black = new Color (0, 0, 0);          // Text color and faces


    // Method used to output dialogue for the fruits.
    public void dialogue ()
    {
	// Local Color Variables
	Color white = new Color (242, 242, 242);    // Used to erase dialogue

	c.setColor (white);
	c.drawString ("Pineapple: GRAPES, ORANGES, COME ON!!! HURRY!", 5, 470);

	c.setColor (black);
	c.drawString ("Grape: HURRY UP ORANGE!!! YOU'RE TOO SLOW!!!", 5, 470);
    }


    // Animates the grape running across the counter.
    public void grapeMoveRight ()
    {
	// Local Color Variables
	Color wallGrey = new Color (83, 104, 120);  // Used for erase
	Color leafGreen = new Color (0, 153, 76);   // Top leaves on grape
	Color purple = new Color (78, 45, 107);     // Grape Colour

	// Loop used to animate the grape running right
	for (int x = 0 ; x < 840 ; x++)
	{
	    // Erase
	    c.setColor (wallGrey);
	    c.fillRect (-72 + x, 374, 57, 64);

	    // Stem and Leaves
	    c.setColor (leafGreen);
	    c.fillArc (-57 + x, 372, 20, 20, 135, 180);
	    c.fillArc (-50 + x, 373, 20, 20, 225, 180);
	    c.setColor (Color.black);
	    c.fillRect (-46 + x, 378, 6, 20);

	    // Bottom Grape
	    c.setColor (purple);
	    c.fillOval (-54 + x, 417, 20, 20);
	    c.setColor (black);
	    c.drawOval (-54 + x, 417, 20, 20);

	    // Middle Grapes
	    c.setColor (purple);
	    c.fillOval (-63 + x, 402, 20, 20);
	    c.setColor (black);
	    c.drawOval (-63 + x, 402, 20, 20);
	    c.setColor (purple);
	    c.fillOval (-45 + x, 402, 20, 20);
	    c.setColor (black);
	    c.drawOval (-45 + x, 402, 20, 20);

	    // Top Grapes
	    c.setColor (purple);
	    c.fillOval (-38 + x, 387, 20, 20);
	    c.setColor (black);
	    c.drawOval (-38 + x, 387, 20, 20);
	    c.setColor (purple);
	    c.fillOval (-71 + x, 387, 20, 20);
	    c.setColor (black);
	    c.drawOval (-71 + x, 387, 20, 20);
	    c.setColor (purple);
	    c.fillOval (-54 + x, 387, 20, 20);
	    c.setColor (black);
	    c.drawOval (-54 + x, 387, 20, 20);

	    // Faces
	    c.setColor (black);
	    c.fillOval (-48 + x, 395, 2, 2);
	    c.fillOval (-40 + x, 395, 2, 2);

	    c.drawLine (-48 + x, 400, -44 + x, 403);
	    c.drawLine (-40 + x, 400, -44 + x, 403);

	    c.fillOval (-58 + x, 410, 2, 2);
	    c.fillOval (-50 + x, 410, 2, 2);

	    c.drawLine (-56 + x, 415, -50 + x, 415);

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


    public Grape (Console con)
    {
	c = con;
    }


    public void run ()
    {
	dialogue ();
	grapeMoveRight ();
    }
}


