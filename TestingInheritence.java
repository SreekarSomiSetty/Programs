package packprac;

class parent 
{
	void m1()
	{
		System.out.println("Hey I am from parent m1 method");
	}

}

class child extends parent
{
	void m2()
	{
		System.out.println("Hey I a from child m2 method");
	}
}

class TestingInheritence
{
	public static void main(String[]args)
	{
		child c=new child();
		c.m1();
		c.m2();
	}
}

