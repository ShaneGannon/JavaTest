package ie.dit;
import java.util.ArrayList;
import java.io.*;

public class Tune{

	//create the private fields
	private int x;
	
	private String title;
	private String alttitle;
	private String notation;

	//create the public accessors
	public fields(int x, String title, String alttitle, string notation)
	{
		this.x = x;
		this.title = title;
		this.alttitle = alttitle;
		this.notation = notation;
	}
	
	//create toString method
	public String toString()
	{
		if(alttitle != null)
		{
			return "(" + x + ", " + title + ", " + alttitle + "\n)";
		}
		
		else
		{
			return"(" + x + ", " + title + "\n)";
		}
	}
}