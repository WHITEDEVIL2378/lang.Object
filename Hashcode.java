class Hashcode
{
	int i;
	Hashcode(int i)
	{
		this.i = i;
	}
	public String toString()     //our class toString() method called so hashCode() method not called
	{
		return i + "";
	}
	public int hashCode()               //object class toString() method called but our own class hashCode() method called
	{
		return i;
	}
	public static void main(String args[])//object class toString() method called so object class hashCode() method called
	{
		Hashcode s1 = new Hashcode(10);
		Hashcode s2 = new Hashcode(100);
		System.out.println(s1);
		System.out.println(s2);
	}
}
		
