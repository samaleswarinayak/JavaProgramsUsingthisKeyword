/* DEFINE A CLASS EMPLOYEE HAVING DATA MEMBER, BASIC,DA HRA ,TA ,TAX USING CONSTRUCTOR TAKE INPUT 
USING CONSTRUCTOR AND DEFINE 2 METHODS:-
GROSS_SALARY()-TO CALCULATE GROSS SALARY
DISPLAY()-TO DISPLAY THE DETAILS */

class Employee
{
	int basic,da,hra,ta,tax,gs;
	Employee(int basic,int ta,int da,int hra,int tax)
	{
		this.basic=basic;
		this.ta=ta;
		this.da=da;
		this.hra=hra;
		this.tax=tax;

	}
	void gross_salary()
	{
		da=(basic*(da/100));
		ta=(basic*(ta/100));
		hra=(basic*(hra/100));
		gs=basic+da+hra-tax;
	}
	void display()
	{
		System.out.println("Basic Salary: "+basic);
		System.out.println("Travel allowance: "+ta);
		System.out.println("HRA: "+hra);
		System.out.println("DA: "+da);
		System.out.println("TAX: "+tax);
		System.out.println("Gross Salary: "+gs);
		
	}
}
class EmployeeSalaryCalulation
{
	public static void main(String args[])
	{
		Employee ob=new Employee(15000,10,5,8,8);
		ob.gross_salary();
		ob.display();
	}
}
