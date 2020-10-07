/*Use of this keyword in Java*/

class EmployeeTest
{
		int empid;
		float salary;
		String name;
		EmployeeTest()
		{
			this(11,5000.55f,"Shree");
			System.out.println("Default Constructor");
		}
		EmployeeTest(int empid,float salary, String name)
		{
			this.empid = empid;
			this.salary = salary;
			this.name = name;
		}
		void display(String company)
		{
			System.out.println("I am working at "+company+" Company");
		}
		void show()
		{
			System.out.println("Name = "+name);
			System.out.println("Employee Id = "+empid);
			System.out.println("Salary = "+salary);
			this.display("Company Java");
		}
}
class EmployeeDemo
{
	public static void main(String args[])
	{
		System.out.println("\nValues of first object");
		EmployeeTest ob = new EmployeeTest();//Default Constructor
		ob.show();
		System.out.println("\nValues of second object");
		EmployeeTest ob1 = new EmployeeTest(22,6000.66f,"Sam");//Parameterized Constructor
		ob1.show();
	}
}
