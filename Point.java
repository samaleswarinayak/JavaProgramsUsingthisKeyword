/* DESIGN A CLASS POINT WITH DATA MEMBERS AS XCO AND YCO. THE CLASS SHOULD HAVE A PARAMETERIZED CONSTRUCTOR TO INITIALIZE ITS DATA MEMBERS. DEFINE A METHOD DISTANCEBETPOINTS WHICH RETURN THE DISTANCE BETWEEN TWO POINTS. DEFINE ANOTHER METHOD ISTRIANGLE WHICH TAKES THREE POINT CLASS OBJECT AS PARAMETER AND RETURNS TRUE IF THE THREE POINTS FORM A TRIANGLE OTHERWISE FALSE. */

class Point
{

	int xCO,yCO,result;
	Point(int xCO,int yCO)
	{
		this.xCO=xCO;
		this.yCO=yCO;
	}
	int distanceBetPoints(Point ob1,Point ob2)
	{
		
		result=(int) (Math.sqrt(Math.pow((ob2.xCO-ob1.xCO),2)+Math.pow((ob2.yCO-ob1.yCO),2)));//If you dont want to typecast then use Double datatype
		return result;

	}
	 static boolean isTriangle(Point ob1,Point ob2,Point ob3)
	{
		if(ob1.result+ob2.result>ob3.result)
			return true;
		else if(ob2.result+ob3.result>ob1.result)
			return true;
		else if(ob3.result+ob1.result>ob2.result)
			return true;
		return false;

	}
	public static void main(String[] args) 
	{
		boolean x;
		Point ob1=new Point(2,3);
		Point ob2=new Point(4,5);
		Point ob3=new Point(5,6);

		ob1.result=ob1.distanceBetPoints(ob1,ob2);
		ob2.result=ob2.distanceBetPoints(ob2,ob3);
		ob3.result=ob3.distanceBetPoints(ob3,ob1);

		x= Point.isTriangle(ob1,ob2,ob3);
		System.out.println(x);	

	}
}
