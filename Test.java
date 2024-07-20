class ToString
{
	String name;
	int rollno;
	Test(String name,int rollno)
	{
		this.name = name;
		this.rollno = rollno;
	}
	public static void main(String args[])
	{
		Test s1 = new Test("durga",101);
		Test s2 = new Test("Ravi",102);
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s2);
	}
}
		
