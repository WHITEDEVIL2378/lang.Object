class Hashcode
{
	int i;
	Hashcode(int i)
	{
		this.i = i;
	}
	public String toString()
	{
		return i + "";
	}
	public int hashCode()
	{
		return i;
	}
	public static void main(String args[])
	{
		Hashcode s1 = new Hashcode(10);
		Hashcode s2 = new Hashcode(100);
		System.out.println(s1);
		System.out.println(s2);
	}
}
		
