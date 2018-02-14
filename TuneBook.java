package ie.dit;
import java.util.ArrayList;
import java.io.*;

//create tunebook class and a tune array list of Tune objects called tunes
public class TuneBook{
	
	ArrayList<Tune> tunes = new ArrayList<Tune>();
	
	public TuneBook1()
    {
		//load the file
        loadfile(abc.txt);
    }
		
	public void loadfile(String arg)
    {
        BufferedReader inputStream = null;

        try {
            inputStream = new BufferedReader(new FileReader(String));
            
			//set var string l
            String l;
            while ((l = inputStream.readLine()) != null) {
				
				//if it starts with x get the number nd set it
				if(l startsWith('X'))
				{
					tunes.Tune.x.add(l);
                }
				
				//use an if/else to determine whether or not it is the first title or not and set it based on this
				if(l startsWith('T'))
				{
					tunes.Tune.title.add(l);
                }
				
				else(l startsWith('X'))
				{
					tunes.Tune.alttitle.add(l);
                }
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        } 
        finally 
        {
            if (inputStream != null) {
                try
                {
                    inputStream.close();
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
    }
}