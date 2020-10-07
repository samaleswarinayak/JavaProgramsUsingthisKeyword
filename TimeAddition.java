/* WAP TO PRINT THE TIME IN HH:MM:SS FORMAT AFTER ADDITION OF TWO TIMES. INPUT SHOULD BE USING CONSTRUCTOR */

class Time
{
	int hr,min,sec,day=0;
	Time(int hr,int min,int sec)
	{
		this.hr=hr;
		this.min=min;
		this.sec=sec;
	}
	void display()
	{
		System.out.println("time is :"+day+" day  "+hr+"Hour:"+min+"Minute:"+sec+"Second");
	}
	void manipulate()
	{
		while(hr>24)
		{
			hr=hr-24;
			day++;
		}
		while(min>60)
		{
			min=min-60;
			hr++;
			while(hr>24)
			{
				hr=hr-24;
				day++;
			}
		}
		while(sec>60)
		{
			sec=sec-60;
			min++;
			while(min>60)
			{
				min=min-60;
				hr++;
				while(hr>24)
				{
					hr=hr-24;
					day++;
				}
			}
		}
	}
	void add(Time ob1,Time ob2)
	{
		hr= ob1.hr+ob2.hr;
		min=ob1.min+ob2.min;
		sec=ob1.sec+ob2.sec;
	
	}
}
class TimeAddition
{
	public static void main(String args[])
	{
		Time ob= new Time(35,12,80);
		Time ob1= new Time(16,23,67);
		ob.add(ob,ob1);
		ob.manipulate();
		ob.display();	
	}
}
