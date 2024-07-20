class Equals
{
	String name;
	int rollno;
	Equals(String name,int rollno)
	{
		this.name = name;
		this.rollno = rollno;
	}
	public static void main(String args[])
	{
		Equals s1 = new Equals("durga",101);
		Equals s2 = new Equals("Ravi",102);
		Equals s3 = new Equals("durga",101);
		Equals s4 = s1;
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
}
}
