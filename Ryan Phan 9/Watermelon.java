/*  Name: Ryan Phan
 *  Teacher: Mr.Rosen
 *  Date: October 22, 2018
 *  This class contains the draw commands and animations for the watermelon.
 */

import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class Watermelon implements Runnable
{
    private Console c;

    // Colours Used For The Watermelon: 2
    // -------------------------------------------------------------------------------------
    private Color black = new Color (0, 0, 0);          // Text color and faces

    public void dialogue ()
    {
	// Local Color Variables
	Color white = new Color (242, 242, 242);    // Used to erase dialogue

	c.setColor (white);
	c.drawString ("Orange: BUT WE DIDN'T TELL WATERMELON!!!", 5, 470);

	c.setColor (black);
	c.drawString ("Watermelon: Huh? Why is everyone running?", 5, 470);
    }


    public void watermelon ()
    {
	// Local Color Variables
	Color wallGrey = new Color (83, 104, 120);  // Used for erase
	Color green = new Color (0, 102, 0);        // Watermelon Rind Colour
	Color red = new Color (153, 0, 0);          // Watermelon Innards Colour

	// Loop used for animate the watermelon moving in.
	for (int x = 0 ; x < 200 ; x++)
	{
	    // Erase
	    c.setColor (wallGrey);
	    c.fillRect (-191 + x, 375, 123, 63);

	    // Body of Watermelon
	    c.setColor (green);
	    c.fillArc (-190 + x, 317, 120, 120, 180, 180);
	    c.setColor (red);
	    c.fillArc (-180 + x, 327, 100, 100, 180, 180);

	    // Watermelon Face
	    c.setColor (black);
	    c.fillOval (-140 + x, 390, 6, 6);
	    c.fillOval (-120 + x, 390, 6, 6);

	    c.fillRect (-144 + x, 385, 10, 2);
	    c.fillRect (-124 + x, 385, 8, 2);

	    c.drawLine (-130 + x, 410, -135 + x, 405);
	    c.drawLine (-130 + x, 410, -125 + x, 405);

	    // Used to delay the animation
	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }

	}

    }


    public Watermelon (Console con)
    {
	c = con;
    }


    public void run ()
    {
	watermelon ();
	dialogue ();
    }
}



