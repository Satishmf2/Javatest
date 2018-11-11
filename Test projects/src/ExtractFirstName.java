import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

//Array list program to extract first name from the given file that has firstname and last name 
public class ExtractFirstName {
	
	ArrayList<String> name = new ArrayList<String>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ExtractFirstName().go();

	}
	
	public void go() {
		getName();
		System.out.println(name);
	
	}
	
	void getName(){
//		File file=new File("/Users/satishr/eclipse-workspace/files/names");
//		System.out.println(file);
		
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader("/Users/satishr/eclipse-workspace/files/names.rtf"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 String line = null;
		 try {
			while ((line = br.readLine()) != null) {
			   System.out.println(line);
			 }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
