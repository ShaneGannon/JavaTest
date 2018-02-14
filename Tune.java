package ie.dit;
import java.util.ArrayList;

public class Tune{

	//create the private fields
	private int x;
	
	private String title;
	private String alttitle;
	private String notation;

	//create the public accessors
	public int getx()
	{
		return x;
	}
	
	public String gettitle()
	{
		return title;
	}
	
	public String getalttitle()
	{
		return alttitle;
	}
	
	public String getnotation()
	{
		return notation;
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