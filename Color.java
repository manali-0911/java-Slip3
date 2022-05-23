import java.util.*;
public class Color
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		TreeSet ts= new TreeSet();
		System.out.println("Enter number of colors you want in Tree Set: ");
		int n = sc.nextInt();
		System.out.println("Enter names of the colors: ");
		for(int i=0;i<=n;i++)
		{
			ts.add(sc.next());
		}
		int ch;
		while(true)
		{
			System.out.println("\n 1. Add A Colour: \n 2. Display The Colour: \n 3. Exit \n Enter Your Choice: ");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1: System.out.println("Enter the names of the colour to be added: ");
					ts.add(sc.next());
					System.out.println("The colour is added successfully");
					break;
				case 2: System.out.println("The names of the colours are: "+ts);
					break;
				case 3: System.exit(0);
				default: System.out.println("Enter the correct choice!");
			}
		}
	}
}
