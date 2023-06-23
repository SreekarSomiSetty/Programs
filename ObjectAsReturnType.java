package packprac;

public class ObjectAsReturnType
{
	public static void main(String[]args)
	{
		ObjectAsReturnType obj1=new ObjectAsReturnType();
		UntStudent s2=obj1.m1();
		System.out.println(s2.id+"----"+s2.name);
		
		
	}
	
	UntStudent m1()
	{
		UntStudent s1=new UntStudent();
		s1.id=123;
		s1.name="Sreekar";
		return s1;
	}

}

class UntStudent
{
	int id;
	String name;
	
}
