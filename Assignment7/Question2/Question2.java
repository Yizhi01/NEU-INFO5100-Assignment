package assignment7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Question2 {
	public static void parse(File file) throws Exception {
		   RandomAccessFile input = null;
		   String line = null;
		   try {
		       input = new RandomAccessFile(file, "r");
		       while ((line = input.readLine()) != null) {
		           System.out.println(line);
		       }
		       return;
		   }catch (FileNotFoundException e) {
			   e.printStackTrace();
		   }catch (IOException e) {
			   e.printStackTrace();
		   }
		   finally {
		       if (input != null) {
		           input.close();
		       }
		   }
		}
}
