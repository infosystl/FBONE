package org.india;

public class AxisBank{

	
	public static void main(String[] args) {
		int empId=1996;
		String empName="Arun";
		String empAddress="Chennai";
		
		if(empId==1992)
		{
			System.out.println("empId=1992 correct");
		}
		
		else if(empId==1994)
		{
			System.out.println("empId=1994 correct");
		}
		else if(empId==1996)
		{
			System.out.println("empId=1996 correct");
			
			if(empAddress.equals("Chennai"))
			{
				System.out.println("empId=1996 address correct");
			}
			
		}
		else
		{
			System.out.println("empId inCorrect");
		}

		
		
		
		if(empName.equals("Arun"))
		{
			System.out.println("empName correct");
                System.out.println("empName correct1");

		}
		
		
	}
	

}
