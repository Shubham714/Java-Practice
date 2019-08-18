import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Rover{
	
	int roverPosition(int n, int ncmd, List<String> cmd) {
		// i and j represents row and column respectively
		int i=0,j=0;
		
		for(int count=0;count<ncmd;count++)
		{
			if(cmd.get(count).equals("UP")) //if command UP minus the row
			{
				if((i-1)<0)
				{
					continue;
				}
				else
				{
					i=i-1;
				}
			}
			
			else if(cmd.get(count).equals("DOWN")) //if command DOWN add the row
			{
				if((i+1)==n)
				{
					continue;
				}
				else
				{
					i=i+1;
				}
			}
			
			if(cmd.get(count).equals("LEFT")) //if command LEFT minus the column
			{
				if((j-1)<0)
				{
					continue;
				}
				else
				{
					j=j-1;
				}
			}
			
			else if(cmd.get(count).equals("RIGHT")) //if command RIGHT add the column
			{
				if((j+1)==n)
				{
					continue;
				}
				else
				{
					j=j+1;
				}
			}
		}
		return((i*n)+j); //as per the formula given in problem statement
	}
	public static void main(String[] args) {
		List<String> cmd=new ArrayList<String>(); //to store the commands
		Scanner s=new Scanner(System.in);
		int n;
		int ncmd;
		String str;
		System.out.println("Enter the size of matrix=");
		n=s.nextInt();
		System.out.println("Enter how many commands do u have=");
		ncmd=s.nextInt();
		System.out.println("Enter Commands=");
		for(int i=0;i<ncmd;i++)
		{
			str=s.next();
			cmd.add(str);
		}
		Rover r=new Rover();
		int pos=r.roverPosition(n, ncmd, cmd);
		System.out.println(pos);
		s.close();
	}
}