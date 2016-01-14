package delete_add_file;

import java.io.File;

public class delete {
	
	public void delete(File f)
	{
		try{
    		   	
    		if(f.delete()){
    			System.out.println(f.getName() + " is deleted!");
    		}else{
    			System.out.println("Delete operation is failed.");
    		}
    	   
    	}catch(Exception e){
    		
    		e.printStackTrace();
    		
    	}
	}
	
	public void deletefolder(File f)
	{
		if(f.exists()){
			if(f.isDirectory()){
				 
	    		//directory is empty, then delete it
	    		if(f.list().length==0){
	    			
	    		   f.delete();
	    		   System.out.println("Directory is deleted : " 
	                                                 + f.getAbsolutePath());
	    			
	    		}else{
	    			
	    		   //list all the directory contents
	        	   String files[] = f.list();
	     
	        	   for (String temp : files) {
	        	      //construct the file structure
	        	      File fileDelete = new File(f, temp);
	        		 
	        	      //recursive delete
	        	     delete(fileDelete);
	        	   }
	        		
	        	   //check the directory again, if empty then delete it
	        	   if(f.list().length==0){
	           	     f.delete();
	        	     System.out.println("Directory is deleted : " 
	                                                  + f.getAbsolutePath());
	        	   }
	    		}
	    		
	    	}else{
	    		//if file, then delete it
	    		f.delete();
	    		System.out.println("File is deleted : " + f.getAbsolutePath());
	    	}
		}else{
			System.out.println("Folder doesn't exist");
		}
	}

}
