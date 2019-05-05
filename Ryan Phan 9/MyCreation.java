/*  Name: Ryan Phan
 *  Teacher: Mr. Rosen
 *  Date: October 22, 2018
 *  Program Description: This class runs all the threads and classes created in the Ryan Phan 9 folder.
 *  Plot : A group of apples are walking across a kitchen counter when they are stopped by a pineapple.
 *         The pineapple tells the group about the human's plan to eat them and that they should run! The
 *         pineapple then calls to a grape and an orange to run as well. While all the fruits are running
 *         a watermelon who wasn't warned gets hit by a knife.
 */

// The "MyCreation" class.
import java.awt.*;
import hsa.Console;


public class MyCreation
{
    Console c;           // The output console

    // Adds the background to MyCreation
    public void background ()
    {
	Background b = new Background (c);
    }


    // Adds the pineapple thread to MyCreation
    public void pineapple ()
    {
	// Creates the thread
	Pineapple p = new Pineapple (c);
	// Starts the thread
	p.start ();

	// Joins with the grape thread so that it only executes when the pineapple thread is done.
	try
	{
	    p.join ();
	}
	catch (Exception e)
	{
	}
    }


    // Adds the apple thread to MyCreation
    public void apple ()
    {
	// Colours to be passed into the apple constructors
	Color green = new Color (102, 204, 0);
	Color yellow = new Color (255, 255, 51);

	// Creates the apple thread
	Apple a = new Apple (c);
	// Starts the thread
	a.start ();

	Apple a1 = new Apple (c, yellow, 105);
	// Starts the thread
	a1.start ();

	Apple a2 = new Apple (c, green, 225, 9);
	// Starts the thread
	a2.start ();

    }


    // Adds the grape thread to MyCreation
    public void grape ()
    {
	// Creates the thread
	Grape p = new Grape (c);
	// Starts the thread
	p.start ();
    }


    // Adds the orange thread to MyCreation
    public void orange ()
    {
	// Creates the thread
	Orange o = new Orange (c);
	// Starts the thread
	o.start ();

	// Joins with the watermelon thread so that it only executes when the orange thread is done.
	try
	{
	    o.join ();
	}
	catch (Exception e)
	{
	}
    }


    // Adds the watermelon thread to MyCreation
    public void watermelon ()
    {
	// Creates the thread
	Watermelon i = new Watermelon (c);
	// Starts the thread
	i.run ();
    }


    // Adds the knife thread to MyCreation
    public void knife ()
    {
	// Creates the thread
	Knife k = new Knife (c);
	// Starts the thread
	k.run ();
    }


    // Creates a new window and gives the window a title
    public MyCreation ()
    {
	c = new Console ("Fruit Salad I: The Escape");
    }


    public static void main (String[] args)
    {
	MyCreation m = new MyCreation ();
	m.background ();
	m.apple ();
	m.pineapple ();
	m.grape ();
	m.orange ();
	m.watermelon ();
	m.knife ();
    }
} // MyCreation class


