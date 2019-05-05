/*  Name: Ryan Phan
 *  Teacher: Mr.Rosen
 *  Date: October 22, 2018
 *  This class contains the draw commands and animations for the pineapple.
 */

import java.awt.*;
import hsa.Console;
import java.lang.*;     // to access Thread class

public class Pineapple extends Thread
{
    private Console c;

    // Colours Used For The Pineapple: 3
    // -------------------------------------------------------------------------------------
    private Color white = new Color (242, 242, 242);    // Used to erase dialogue
    private Color black = new Color (0, 0, 0);          // Text color and faces
    private Color wallGrey = new Color (83, 104, 120);  // Used for erase
    private Color orange = new Color (230, 184, 0);     // Lines in the watermelon
    private Color leafGreen = new Color (0, 153, 0);    // Top leaves on pineapple
    private Color yellow = new Color (255, 255, 0);     // Pineapple colour

    // Method used to output dialogue for the fruits.
    public void dialogue ()
    {
	try
	{
	    sleep (2000);
	}
	catch (InterruptedException e)
	{
	}
	c.setColor (black);
	c.drawString ("Pineapple: Apples!!! You guys need to run!", 5, 470);


	try
	{
	    sleep (1500);
	}
	catch (InterruptedException e)
	{
	}
	c.setColor (white);
	c.drawString ("Pineapple: Apples!!! You guys need to run!", 5, 470);

	c.setColor (black);
	c.drawString ("Pineapple: The humans are trying to eat us!!!", 5, 470);

	try
	{
	    sleep (2000);
	}
	catch (InterruptedException e)
	{
	}
	c.setColor (white);
	c.drawString ("Pineapple: The humans are trying to eat us!!!", 5, 470);

	c.setColor (black);
	c.drawString ("Pineapple: What are you waiting for?! RUN!!!", 5, 470);

	try
	{
	    sleep (2000);
	}
	catch (InterruptedException e)
	{
	}
	c.setColor (white);
	c.drawString ("Pineapple: What are you waiting for?! RUN!!!", 5, 470);

	c.setColor (black);
	c.drawString ("Apples: AHHHH! RUNNNNNNN!!!", 5, 470);
    }


    // Extra dialogue used after the pineapple runs left.
    public void dialogueTwo ()
    {
	try
	{
	    sleep (1500);
	}
	catch (InterruptedException e)
	{
	}

	c.setColor (white);
	c.drawString ("Apples: AHHHH! RUNNNNNNN!!!", 5, 470);

	c.setColor (black);
	c.drawString ("Pineapple: GRAPES, ORANGES, COME ON!!! HURRY!", 5, 470);
    }


    // Used to animate the pineapple running offscreen to the right.
    public void pineappleRunsRight ()
    {
	// Loop used to animate the pineapple running
	for (int x = 0 ; x < 640 ; x++)
	{
	    // Erase
	    c.setColor (wallGrey);
	    c.fillRect (2 + x, 326, 77, 112);

	    // Top leaves
	    c.setColor (leafGreen);
	    c.fillMapleLeaf (16 + x, 326, 50, 60);

	    // Body of pineapple
	    c.setColor (yellow);
	    c.fillOval (4 + x, 338, 74, 100);

	    // Lines on pineapple
	    c.setColor (orange);
	    c.drawLine (17 + x, 350, 65 + x, 426);
	    c.drawLine (07 + x, 370, 50 + x, 436);
	    c.drawLine (33 + x, 340, 75 + x, 406);

	    c.drawLine (65 + x, 350, 17 + x, 426);
	    c.drawLine (75 + x, 370, 33 + x, 436);
	    c.drawLine (50 + x, 340, 7 + x, 406);

	    // Draws the mouth
	    c.setColor (black);
	    c.drawArc (37 + x, 388, 10, 10, 180, 180);

	    // Draws the eyes
	    c.fillOval (25 + x, 377, 8, 8);
	    c.fillOval (49 + x, 377, 8, 8);

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


    // Animates the pineapple entering the scene.
    public void pineappleMoveRight ()
    {
	// Loop used to animate the pineapple walking right.
	for (int x = 0 ; x < 290 ; x++)
	{
	    // Erase
	    c.setColor (wallGrey);
	    c.fillRect (-88 + x, 326, 77, 112);

	    // Top leaves
	    c.setColor (leafGreen);
	    c.fillMapleLeaf (-74 + x, 326, 50, 60);

	    // Body of pineapple
	    c.setColor (yellow);
	    c.fillOval (-86 + x, 338, 74, 100);

	    // Lines on pineapple
	    c.setColor (orange);
	    c.drawLine (-73 + x, 350, -25 + x, 426);
	    c.drawLine (-83 + x, 370, -40 + x, 436);
	    c.drawLine (-57 + x, 340, -15 + x, 406);

	    c.drawLine (-25 + x, 350, -73 + x, 426);
	    c.drawLine (-15 + x, 370, -57 + x, 436);
	    c.drawLine (-40 + x, 340, -83 + x, 406);

	    // Draws the mouth
	    c.setColor (black);
	    c.drawArc (-53 + x, 388, 10, 10, 180, 180);

	    // Draws the eyes
	    c.fillOval (-65 + x, 377, 8, 8);
	    c.fillOval (-41 + x, 377, 8, 8);

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


    // Animates the pineapple running left, to call the orange and the grape over.
    public void pineappleRunsLeft ()
    {
	// Loop used to animate the pineapple running left
	for (int x = 0 ; x < 200 ; x++)
	{
	    // Erase
	    c.setColor (wallGrey);
	    c.fillRect (202 - x, 326, 77, 112);

	    // Top leaves
	    c.setColor (leafGreen);
	    c.fillMapleLeaf (216 - x, 326, 50, 60);

	    // Body of pineapple
	    c.setColor (yellow);
	    c.fillOval (204 - x, 338, 74, 100);

	    // Lines on pineapple
	    c.setColor (orange);
	    c.drawLine (217 - x, 350, 265 - x, 426);
	    c.drawLine (207 - x, 370, 250 - x, 436);
	    c.drawLine (233 - x, 340, 275 - x, 406);

	    c.drawLine (265 - x, 350, 217 - x, 426);
	    c.drawLine (275 - x, 370, 233 - x, 436);
	    c.drawLine (250 - x, 340, 207 - x, 406);

	    // Draws the mouth
	    c.setColor (black);
	    c.drawArc (237 - x, 388, 10, 10, 180, 180);

	    // Draws the eyes
	    c.fillOval (225 - x, 377, 8, 8);
	    c.fillOval (249 - x, 377, 8, 8);

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


    public Pineapple (Console con)
    {
	c = con;
    }


    public void run ()
    {
	pineappleMoveRight ();
	dialogue ();
	pineappleRunsLeft ();
	dialogueTwo ();
	pineappleRunsRight ();
    }
}


