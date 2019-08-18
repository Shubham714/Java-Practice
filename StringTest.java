import java.util.ArrayList;
import java.util.List;

public class StringTest {

	public static void main(String[] args) {
		List<String> str=new ArrayList<String>();
		str.add("Shubham");
		System.out.println(str.get(0)=="Shubham");
		
		String st="ssuttesi";
		for(int i=0;i<st.length();i++)
		{
			if(st.charAt(i)=='e')
			{
				System.out.println(i);
			}
			
		}
		
	}

}
