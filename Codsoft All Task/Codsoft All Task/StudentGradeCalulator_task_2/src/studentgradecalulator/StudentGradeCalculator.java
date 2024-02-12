package studentgradecalulator;

import java.util.Scanner;

class StudentGradeCalculator
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of subject ");
		float subject=input.nextInt();
	     if(subject<=0)
	     {
	    	 System.out.println("invalid number ");
	    	 return;
	     }
	     float TotalMarks=0;
	     for(int i=1;i<=subject;i++)
	     {
	    	 System.out.println("Enter the Marks of subject :"+i);
	    	 float marks=input.nextFloat();
	    	 
	    	 if(marks<0 || marks>100)
	    	 {
	    		 System.out.println("invalid number of range please enter number 0 to 100");
	    	      return;
	    	 }
	    	 TotalMarks +=marks;
	     }
		
		float per = TotalMarks/subject;
		System.out.println("Total :"+TotalMarks);
		System.out.println("Percentage :"+per+"%");	
		if(per>=90)
			System.out.println("Grade A");
		else if(per>=80)
			System.out.println("Grade B");
		else if(per>=70)
			System.out.println("Grade C");
		else if(per>=60)
			System.out.println("Grade D");
		else if(per>=40)
			System.out.println("Grade E");
		else
			System.out.println("Grade F");
	}
}
