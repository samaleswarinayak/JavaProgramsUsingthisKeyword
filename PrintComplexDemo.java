/* WAP TO ADD TWO ComplexDemo NUMBER USING CONSTRUCTOR, USE this KEYWORD TO INITIALIZE */

class ComplexDemo
{
	int real,img;
	ComplexDemo(int real,int img)
	{
		this.real=real;
		this.img=img;	
	}
	ComplexDemo()
	{
		real = 0;
		img = 0;
	}
	ComplexDemo add(ComplexDemo ob1)
	{
		ComplexDemo ob4 = new ComplexDemo();
		ob4.real=ob1.real + real;
		ob4.img=ob1.img + img;
		return ob4;
	}
	void display()
	{
	System.out.println("ComplexDemo number is : "+real+"+"+img+"i");

		
	}
	
}
class PrintComplexDemo
{
	public static void main(String args[])
	{
		ComplexDemo ob=new ComplexDemo(3,6);
		ComplexDemo ob1=new ComplexDemo(2,2);
		ComplexDemo ob2 = new ComplexDemo();
		ob2= ob.add(ob1);//Passing of object and Return of Object
		ob2.display();
	}
}
