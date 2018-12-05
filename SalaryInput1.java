import java.util.*;
class Employee
{
	String FName,LName;
	double MSalary,Gs,da=0.4,hra=0.6,TotSalary;
	int ArrayLeave[]={2,1,1,3,0,2,1,0,1,2,2,2};
	String m[]={"Jan","Feb","Mar","Apr","may","june","july","Aug","Sept","Act","Nov","Des"};

	int Leave;	
	
	
	int MaxLeave=16;
	int TotLeave = 0,GetLeave;double CostLeave;
	
	Scanner sc1=new Scanner(System.in);

	Employee(String fname,String lname,double ms)
	{
		FName =  fname;
		LName = lname;
		MSalary = ms;
	}
	
	public void Gross()
	{
		
	
		TotLeave=TotLeave+Leave;
		
		
		if(MaxLeave < TotLeave)
		{

                                          
                        CostLeave=500.0*(Leave);
                        Gs = MSalary-(MSalary*da)+(MSalary*hra)-CostLeave;
                           if(Gs<0)
                                Gs=0.0;
			TotSalary= TotSalary+Gs;

                      
			
		}
		else
		{
			
                        CostLeave=500.0*(Leave-2);
		
			Gs = MSalary-(MSalary*da)+(MSalary*hra)-CostLeave;
			
			TotSalary=TotSalary+Gs;
			
		}
		
	}

	public void SetData()
		
	{	int j;	
		for(j=0;j<12;j++)
		{	
			
			
			System.out.println("\nEnter your leaves for "+m[j]);
			Leave=sc1. nextInt();
                       if(Leave>2)
			System.out.println(" Leaves Sholude be less than 2 ");
			Gross();
                       System.out.println("Salary for month "+m[j]+" = "+Gs);		
		}
	}
	
	public void GetData()
	{
		System.out.print("Name:- "+FName+" "+LName+"\nBasic Salary:- "+MSalary+"\n\n");
	
	}
	public void Inc()
	{	
		if(MaxLeave< TotLeave)
		{	
			System.out.println("\nYou are not eligible for increament");
			System.out.println("\nYour Total Salary is = "+TotSalary+"\n");
		}
		else
		{
			System.out.println("\nYou are eligible for increament");
			TotSalary=TotSalary+(TotSalary/10);
			System.out.println("\n Your increamented salary is= "+TotSalary);
		}
	}

}
class Demo
{
	public static void main(String args[])

	{	
		String name,last;
		double salary;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your first name:-");
		name=sc.nextLine();
		
		System.out.println("Enter your last name:-");
		last=sc.nextLine();
	
		System.out.println("Enter your monthly salary:-");
		salary=sc.nextDouble();
  
		Employee e=new Employee(name,last,salary);
		e.GetData();
		e.SetData();
		e.Inc();
	}
}
	
		
	 