import java.util.Scanner;
class Demo{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("--------------------------------------------------------");
		System.out.println("|       SALARY INFORMATION SYSTEM                      |");
		System.out.println("--------------------------------------------------------");
		System.out.println();
		System.out.println("    [1] Calculate Income Tax");	
		System.out.println("    [2] Calculate Annual Bonus");
		System.out.println("    [3] Calculate Loan amount");
		System.out.println();
		System.out.print("Enter an option to continue >");
		int num1 = input.nextInt();
		switch(num1){
			case 1:
		System.out.println("--------------------------------------------------------");
		System.out.println("|            Calculate Income Tax                      |");
		System.out.println("--------------------------------------------------------");
		System.out.println();
		System.out.print("Input Employee name   - ");
		String name = input.next();
		System.out.print("Input Employee salary - ");
		int salary = input.nextInt();
		System.out.println();
		int tax = 0;
        if (salary > 308333) {
            tax +=  (salary - 308333 ) * 0.36;
            System.out.println("You have to pay Income Tax per month: Rs." + tax);
        } else if (salary > 266667) {
            tax += (41667 * 0.30) + (41667 * 0.24 )+ (41667 * 0.18) + (41667 * 0.12) + (41667 * 0.06);
            System.out.println("You have to pay Income Tax per month: Rs." + tax);
        } else if (salary > 225000) {
            tax += (41667 * 0.24 )+ (41667 * 0.18) + (41667 * 0.12) + (41667 * 0.06);
            System.out.println("You have to pay Income Tax per month: Rs." + tax);
        } else if (salary > 183333) {
            tax += (41667 * 0.18) + (41667 * 0.12) + (41667 * 0.06);
            System.out.println("You have to pay Income Tax per month: Rs." + tax);
        } else if (salary > 141667) {
            tax += (41667 * 0.12) + (41667 * 0.06);
            System.out.println("You have to pay Income Tax per month: Rs." + tax);
        } else if (salary > 100000) {
            tax += 41667 * 0.06;
            System.out.println("You have to pay Income Tax per month: Rs." + tax);
        }else{
			System.out.println("No tax is charged up to Rs.100000");}
        break;
        }
        
        switch(num1){
			case 2:
			System.out.println("-------------------------------------------------");
			System.out.println("|           Calculate Annual Bonus               |");
			System.out.println("-------------------------------------------------");
			System.out.println();
			System.out.print("Input Employee name   -  ");
			String name = input.next();
			System.out.print("Input Employee salary -  ");
			int salary = input.nextInt();
			int bonus = 0;
			if(salary>199999){
			    bonus += (salary - 99999)*0.10;
			    System.out.print("Annual bonus  -  " +bonus); 
			}else if(salary >299999){
			    bonus +=  (salary - 99999) * 0.15;
			    System.out.print("Annual bonus  -  " +bonus);
			}else if(salary>399999){
			    bonus += (salary - 99999) * 0.20;
			    System.out.print("Annual bonus  -  " +bonus);
			}else if(salary>400000){
			    bonus +=   (salary - 99999) * 0.35;
			    System.out.print("Annual bonus  -  " +bonus);
			}else {
				System.out.print("Annual bonus - "  +5000);
				}
		break;
	}
	    switch(num1){
		   case 3:
		   System.out.println("------------------------------------------------");
		   System.out.println("|          Calculate Loan amount               |");
		   System.out.println("------------------------------------------------");
		   System.out.println();
		   System.out.print("Input Employee name   - ");
		   String name = input.next();
		   System.out.print("Input Employee salary - ");
		   double salary = input.nextDouble();
		   if(salary<=50000){
			   System.out.print("You can not get a loan because your salary less than Rs. 50000");
			   }	   
		   System.out.print("Enter number of year : ");
		   int years = input.nextInt();
		
		   if(years>5){
			System.out.print("The Maximum loan period is 5 years.");
			
			}
			double monthlyInstallment = salary * 0.60;
			double annualInterestRate = 0.15;
			double r = annualInterestRate/100;
			int n = years *12;
			
			double loanAmount = monthlyInstallment * (1-(1/Math.pow(1+(r/12),n))) / (r/12) ;
			loanAmount = Math.round(loanAmount/1000) * 1000;
			
			System.out.println("You can get Loan Amount : " +loanAmount);
			
							
		}			
	}
 }
