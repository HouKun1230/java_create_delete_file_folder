package delete_add_file;

import java.io.File;
import java.io.IOException;

public class add {
	
	public void create(File f)
	{
		try{
			 if (f.createNewFile()){
			        System.out.println("File is created!");
			      }else{
			        System.out.println("File already exists.");
			      }
			      
		    	} catch (IOException e) {
			      e.printStackTrace();
			}
	}
	
	public void createfolder(File f)
	{
		if(!f.exists())
		{
			f.mkdir();
			System.out.println("Folder is created");
		}else{
			System.out.println("Folder already exsit");
		}
	}

}
