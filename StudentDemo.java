/* DEFINE A CLASS StudentDemo HAVING DATA MEMBER NAME,ROLL_NO, MARKS AND SIC_NO USING CONSTRUCTOR */

class StudentDemo
{
	int roll;
	float mark;
	String name,sic;
	StudentDemo(String name,int roll, String sic,float mark)
	{
		this.name= name;
		this.roll=roll;
		this.mark=mark;
		this.sic=sic;	
	}
	void show()
	{
		System.out.println("Name: "+name);
		System.out.println("Roll: "+roll);
		System.out.println("Mark: "+mark);
		System.out.println("SIC: "+sic);				
	}
}
class StudentDemo
{
	public static void main(String args[])
	{
		StudentDemo ob = new StudentDemo("Samaleswari",31,"FCS11658",85.6f);
		ob.show();
	}
}
