package Assignment2;

/**
 * Assignment for your lecture 2. Please finish all the questions under 'Assignment'
 * Please try to think the extra credit question. 
 * The deadline of this assignment is 09/21/2018 23:59 PST.
 * Please feel free to contact Amanda and Zane for any questions.
 */

class Employee {
    String name;
    int age;
    Gender gender;
    double salary;// salary per month


    public Employee(String name, int age, Gender gender, double salary) {
    		//write your code here
    	this.name =name;
		this.age =age;
		this.gender =gender;
		this.salary =salary;
    }

    public String getName() {
    		//write your code here
    	return name;
    }

    public void setName(String name) {
    		//write your code here
    	this.name= name;
    }
    
    public void raiseSalary(double byPercent) {
    	salary = byPercent *salary;
	}
}
enum Gender {
    MALE,
    FEMALE;
}


public class assignment2 {
    // Assignment

    /**
     * Write a method to calculate the Social Security Tax of an employee and print it.
     * If the salary is less than or equal to 8900, the Social Security Tax is 6.2% of the salary.
     * If the salary is more than 8900, the Social Security Tax is 6.2% of 106,800.
     */
    public double socialSecurityTax(Employee employee) {
        //write your code here
    	double tax;
    	if(employee.salary <= 8900){
    		tax = 0.062*employee.salary;
    	}else {
    		tax = 0.062*106800;
    	}
    	System.out.println("The the Social Security Tax of this employee is " + tax);
    	return tax;
}
    
    
    /**
     * Write a method to calculate an employee's contribution for insurance coverage and print it.
     * Amount of deduction is computed as follows:
     * If the employee is under 35, rate is 3% of salary; if the employee is between 35 and 50(inclusive), rate is 4% of salary;
     * If the employee is between 50 and 60(exclusive), rate is 5% of salary; If the employee is above 60, rate is 6% of salary.
     */
    public double insuranceCoverage(Employee employee) {
    	//write your code here
    	double insurance = 0;
    	if (employee.age >0 && employee.age < 35 ) {
    		insurance = employee.salary *0.03;
    	}else if (employee.age >=35 && employee.age <= 50) {
    		insurance = employee.salary *0.04;
    	}else if (employee.age > 50 && employee.age < 60) {
    		insurance = employee.salary *0.05;
    	}else if (employee.age >=60 ) {
    		insurance = employee.salary *0.06;
    	}else {
    		System.out.println("Age is wrong.");
    	}
    	System.out.println("The deduction of this employee is " + insurance);
    	return insurance;
    }
   
    
	/**
	 * Write a method to sort three employees' salary from low to high, and then print their name in order.
	 * For example, Alice's salary is 1000, John's salary is 500, Jenny's salary is 1200, you should print:
	 * John Alice Jenny
	 */
	public void sortSalary(Employee e1, Employee e2, Employee e3) {
		//write your code here
		String min = e1.name;
		String mid = e2.name;
		String max = e3.name;
		if((e1.salary <e2.salary) && (e1.salary < e3.salary)) {
			min = e1.name;
			if (e2.salary <e3.salary) {
				mid = e2.name; 
				max = e3.name;
			}else {
				mid = e3.name;
				max = e2.name;
			}
		}else if ((e2.salary <e1.salary) && (e2.salary < e3.salary)) {
			min = e2.name;
			if (e1.salary <e3.salary) {
				mid = e1.name; 
				max = e3.name;
			}else {
				mid = e3.name;
				max = e1.name;
			}
		}else if ((e3.salary <e1.salary) && (e3.salary < e2.salary)) {
			min = e3.name;
			if (e1.salary <e2.salary) {
				mid = e1.name; 
				max = e2.name;
			}else {
				mid = e2.name;
				max = e1.name;
			}
		}
		System.out.println("List employees' name by salary: " + min +" "+ mid + " " + max );
	}
		
	/**
     * Write a method to raise an employee's salary to three times of his/her original salary.
	 * Eg: original salary was 1000/month. After using this method, the salary is 3000/month.
	 * Do not change the input of this method.
	 * Try to add a new method in Employee class: public void raiseSalary(double byPercent)
	 */
	public void tripleSalary(Employee employee) {
	//write your code here
		employee.raiseSalary(3);
	}	
	
	
		//Extra credit

	    /**
	     * I have written some code below. What I want is to swap two Employee objects.
	     * One is Jenny and one is John. But after running it, I got the result below:
	     * Before: a=Jenny
	     * Before: b=John
	     * After: a=Jenny
	     * After: b=John
	     * There is no change after swap()! Do you know the reason why my swap failed?
	     * Write your understanding of the reason and explain it.
	     */
	    /*
	     write your understanding here.
	     Because this swap method applied the rules of call by value. If we use the rules of call by reference the value will changed .
	     
	    */
	    public static void main(String[] args) {
	        Employee a = new Employee("Jenny", 20, Gender.FEMALE, 2000);
	        Employee b = new Employee("John", 30, Gender.MALE, 2500);
	        System.out.println("Before: a=" + a.getName());
	        System.out.println("Before: b=" + b.getName());
	        swap(a, b);
	        System.out.println("After: a=" + a.getName());
	        System.out.println("After: b=" + b.getName());
	        
	      //  Employee c = new Employee("Alice", 20, Gender.FEMALE, 1000);
	       // sortSalary(a,b,c);
	        
	          
	    }

	    public static void swap(Employee x, Employee y) {
	        Employee temp = x;
	        x = y;
	        y = temp;
	      //  System.out.println("After: x=" + x.getName());
	     //   System.out.println("After: y=" + y.getName());
	    }
	}
