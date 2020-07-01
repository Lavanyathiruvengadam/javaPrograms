import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class PhaseProjectDemo {
	File referenceFile = new File("C:\\");
	public void retrieveFile()
	 {
	    
   	if(referenceFile.isDirectory())
		 {
	    List<String> referenceList= Arrays.asList(referenceFile.list());
		Collections.sort(referenceList);
	    System.out.println("ASCENDING ORDER");
	    for(String str : referenceList)
		   System.out.println(str);
		System.out.println("DESCENDING ORDER");
		Collections.sort(referenceList,Collections.reverseOrder());
	    for(String str : referenceList)
		   System.out.println(str);
	     }
		else
		System.out.println(referenceFile.getAbsolutePath() + "is not directory");
	  }
				
  public void searchFile()
	  {
	   	
	    if(referenceFile.isDirectory())
		  {
		List<String> referenceList= Arrays.asList(referenceFile.list());
	    File fsearch = new File("c://Lavanya/javainner.txt");
	    if(fsearch.exists())
	       System.out.println("file exists");
	    else 
	       System.out.println("file not found");
		  }
	    else
	        System.out.println(referenceFile.getAbsolutePath() + "is not directory");
	   }
	       	 
   public void deleteFile()
	   {
	     
	     if(referenceFile.isDirectory())
	       {
	     List<String> referenceList= Arrays.asList(referenceFile.list());
	     File delFile = new File("c://Lavanya/yesters.txt");
	     if (delFile.delete())
	       System.out.println("file deleted");
	     else 
	       System.out.println("not deleted");
	       }
	     else
	       System.out.println(referenceFile.getAbsolutePath() + "is not directory");
	    }
    public void addFile()
	    {
		  File f = new File("musical.txt");
		  boolean result;
		  try {
		  result=f.createNewFile();
		  if(result)
		    System.out.println("file added :"+ f.getCanonicalPath());
		  else
		    System.out.println("file exists :"+f.getCanonicalPath());
			  }
		  catch (IOException e)
		      {
		     e.printStackTrace();
		      }
		}
   public void closeFile()
	    {
	         System.exit(0);
	    }
public static void main(String[] args) throws IOException { 
		PhaseProjectDemo ref =new PhaseProjectDemo();
		System.out.println("Enter option :\n 1:search\n 2:delete\n 3:retrieve\n 4:close\n 5.add\n");
		int expr = new java.util.Scanner(System.in).nextInt();
		switch(expr) {
		case 1:
		{
			ref.searchFile();
			break;
		}
		case 2:
		{
	        ref.deleteFile();
			break;
		
		}
		case 3:
		{
			ref.retrieveFile();
			break;
		}
		case 4:
		{
			ref.closeFile();
			break;
		}
		case 5:
		{
			ref.addFile();
			break;
		}
		default:
			System.out.println("invalid option");
		}
		
	}
	}

			

