/*  Name: Ryan Phan
 *  Teacher: Mr.Rosen
 *  Date: October 22, 2018
 *  This class is NOT a Thread!!!  There are no moving objects. This class draws the background.
 */


import java.awt.*;
import hsa.Console;
import java.lang.*;     // Used to access Thread class.

// Class used to make background
public class Background
{
    // Global Variables
    private Console c;

    // This method draws the background (which is a kitchen countertop).
    public void drawBackground ()
    {
	// Total Number of Colours Used: 10
	// -------------------------------------------------------------------------------------
	Color wallGrey = new Color (83, 104, 120);     // Local colour variable for the wall
	Color white = new Color (242, 242, 242);       // Local colour variable for the countertop
	Color cabinentWhite = new Color (238, 234, 247); // Local colour variable for the cabinent
	Color totalWhite = new Color (255, 255, 255);  // Local colour variable for the cabinent doors
	Color black = new Color (0, 0, 0);             // Local colour variable for the outlines of objects
	Color blueGrey = new Color (176, 196, 222);    // Local colour variable for the magnetic knife holder.
	Color grey = new Color (112, 128, 144);        // Local colour variable for my name
	Color silver = new Color (192, 192, 192);      // Local colour variable for the knife blades
	Color brown = new Color (139, 69, 19);         // Local colour variable for the knife hilts
	Color hiltBlack = new Color (32, 32, 32);      // Local colour variable for the kinfe hilts

	// Loop used to make the countertop and the wall
	for (int x = 0 ; x < 640 ; x++)
	{
	    c.setColor (wallGrey);
	    c.drawRect (0, 0, x, 438);
	    c.setColor (white);
	    c.drawRect (0, 438, x, 250);
	}

	// Top outline of the countertop
	c.setColor (black);
	c.drawLine (0, 438, 640, 438);

	// Loop used to make the cabinets
	for (int x = 0 ; x < 400 ; x++)
	{
	    c.setColor (cabinentWhite);
	    c.drawRect (240, 0, x, 125);
	}

	// Loop to make the cabinent doors
	for (int x = 1 ; x <= 144 ; x++)
	{
	    c.setColor (totalWhite);
	    c.drawRect (248, -1, x, 121);
	    c.drawRect (408, -1, x, 121);
	    c.drawRect (568, -1, x, 121);
	}

	// Outline of cabinent doors and the handles

	c.setColor (black);
	c.drawRect (248, -1, 144, 121);
	c.drawLine (360, 80, 360, 96);
	c.drawLine (400, 0, 400, 125);

	c.setColor (black);
	c.drawRect (408, -1, 144, 121);
	c.drawLine (520, 80, 520, 96);
	c.drawLine (560, 0, 560, 125);

	c.setColor (black);
	c.drawRect (568, -1, 640, 121);


	// Loop used to make the magnetic knife holder
	for (int x = 0 ; x < 223 ; x++)
	{
	    c.setColor (blueGrey);
	    c.drawRoundRect (560 - x, 180, 36, 45, 10, 10);
	}

	// Draws my name in the knife holder
	c.setColor (grey);
	c.drawString ("RYAN PHAN", 430, 205);


	// Loop used to make a silver knife blade (Leftmost knife)
	for (int x = 0 ; x < 10 ; x++)
	{
	    c.setColor (silver);
	    c.drawRect (362, 180, x, 45);
	}

	// Blade outline
	c.setColor (black);
	c.drawLine (364, 222, 364, 212);
	c.drawRect (362, 180, 10, 45);

	// Loop used to make the tip of the blade
	for (int x = 0 ; x < 10 ; x++)
	{
	    c.setColor (silver);
	    c.drawArc (352 + x, 170 + x, 20 - 2 * x, 20 - 2 * x, 0, 90);
	    c.drawArc (351 + x, 170 + x, 20 - 2 * x, 20 - 2 * x, 0, 90);
	}

	// Tip outline
	c.setColor (black);
	c.drawArc (352, 170, 20, 20, 0, 90);
	c.drawLine (362, 170, 362, 180);

	// Loop used to draw the knife hilt
	for (int x = 0 ; x < 5 ; x++)
	{
	    c.setColor (brown);
	    c.drawRect (363, 226, x, 20);
	}

	// Loop to draw the cleaver hilt (The knife on the right side)
	for (int x = 0 ; x < 5 ; x++)
	{
	    c.setColor (hiltBlack);
	    c.drawRect (565, 226, x, 20);
	}

	// Loop used to draw the cleaver blade
	for (int x = 0 ; x < 20 ; x++)
	{
	    c.setColor (silver);
	    c.drawRect (564, 172, x, 55);
	}

	// Used to outline the blade
	c.setColor (black);
	c.drawRect (564, 172, 20, 55);

	// Loop used to draw the little circle in the cleaver
	for (int x = 0 ; x < 5 ; x++)
	{
	    c.setColor (wallGrey);
	    c.drawOval (576 + x, 176 + x, 5 - x * 2, 5 - 2 * x);
	}

	// Used to outline the little circle in the cleaver
	c.setColor (black);
	c.drawOval (576, 176, 5, 5);
    }


    public Background (Console con)
    {
	c = con;
	drawBackground ();
    }
}
