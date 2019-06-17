package dev.fileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] input) throws FileNotFoundException
	{
		JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        String path = null;
		int returnValue = jfc.showOpenDialog(null);
		// int returnValue = jfc.showSaveDialog(null);

		if (returnValue == JFileChooser.APPROVE_OPTION) {
			File selectedFile = jfc.getSelectedFile();
			path = selectedFile.getAbsolutePath();
		}

	
	    String line = "" ;
	    try(FileReader reader = new FileReader(path);
	             BufferedReader br = new BufferedReader(reader))
	    {
	    	
	        while((line = br.readLine()) != null)
	        {
	        	String[] arr = line.split(" ");   
	        	for(int i = 0; i < arr.length; i++){
	        		System.out.println(arr[i]);
	        	}
	        }

	       }
	    catch(FileNotFoundException ex)
	    {
	        System.out.println("file not found '");
	    }
	    catch(IOException ex)
	    {
	        System.out.println("Error reading file name '");
	    }
	    
	}
}
