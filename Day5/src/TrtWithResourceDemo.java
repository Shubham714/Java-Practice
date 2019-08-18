import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TrtWithResourceDemo {

	static void readFile() {
		 
		try(FileInputStream fin=new FileInputStream("D://abc.txt");)
		{
			System.out.println("File Opened");
		}catch(IOException e){
			System.out.println("FileNotFoundException:"+e.getMessage());
		}
		System.out.println("File close");
	}
	public static void main(String[] args) {
		readFile();
	}
}
