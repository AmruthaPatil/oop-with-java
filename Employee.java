package in.ac.kletech.EmployeeDomain;

public class Employee {
	private int empID;
	private String empName;
	private double basicSal;
	private double allowance; 
	
	public Employee( int empID,String empName,double basicSal) {
		this.empID=empID;
		this.empName=empName;
		this.basicSal=basicSal;
		allowance=0.46*basicSal;
	}
	
	void display(){
		System.out.println("id: "+empID);
		System.out.println("name: "+empName);
		System.out.println("basic salary: "+basicSal );
		System.out.println("allowance: "+allowance);
	}
	
	void calNetSal(){
		double grossSal;
		double incometax;
		double netPay;
		grossSal=allowance+basicSal;
		System.out.println("gross salary: "+grossSal);
		if(grossSal<=5000){
			incometax=0;
			netPay=grossSal;
			System.out.println("incometax: "+incometax);
			System.out.println("net salary: "+netPay);
		}
		else if(grossSal>5000 && grossSal<=10000){
			incometax=0.1*grossSal;
			netPay=grossSal-incometax;
			System.out.println("incometax: "+incometax);
			System.out.println("net salary: "+netPay);
		}
		else if(grossSal>10000 && grossSal<=20000){
			incometax=0.2*grossSal;
			netPay=grossSal-incometax;
			System.out.println("incometax: "+incometax);
			System.out.println("net salary: "+netPay);
		}
		else if(grossSal>20000){
			incometax=0.3*grossSal;
			netPay=grossSal-incometax;
			System.out.println("incometax: "+incometax);
			System.out.println("net salary: "+netPay);
		}
		else
			System.out.println("invalid entry");
		
	}
	

}
