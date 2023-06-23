package packprac;
import java.util.*;

public class UniversityDetails 
{
	public static void main(String[]args)
	{
		UniversityDetails ud = new UniversityDetails();
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		Universe u =ud.m1(n);
		System.out.println(u.id+"---"+u.Name);
		
		
		
	}
	Universe m1(int x)
	{
		Universe u = new Universe();
		if (x==101)
		{
			u.id=101;
			u.Name="Oxford";
		}
		else if(x==102)
		{
			u.id=102;
			u.Name="Stanford";
		}
		return u;
		
	}

}
class Universe
{
	int id;
	String Name;
}
