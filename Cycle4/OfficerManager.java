import java.util.Scanner;

class Employee{
	String name;
	int age;
	long phNo;
	String address;
	double salary;
	
	void printSalary(){
		System.out.println("Salary: "+this.salary);
	}
}

class Officer extends Employee{
	String specialization;
	Officer(String name, int age, long phNo, String address, double salary, String spec){
		super.name = name;
		super.age = age;
		super.phNo = phNo;
		super.address = address;
		super.salary = salary;
		this.specialization = spec;
	}
}

class Manager extends Employee{
	String department;
	Manager(String name, int age, long phNo, String address, double salary, String dep){
		super.name = name;
		super.age = age;
		super.phNo = phNo;
		super.address = address;
		super.salary = salary;
		this.department = dep;
	}
}

class Hier{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		//Officer
		System.out.println("Officer: ");
		System.out.print("Enter name: ");
		String name = sc.nextLine();
		System.out.print("Enter specialization: ");
		String spec = sc.nextLine();
		System.out.print("Enter address: ");
		String address = sc.nextLine();
		System.out.print("Enter age: ");
		int age = sc.nextInt();
		System.out.print("Enter phone no: ");
		long phNo = sc.nextLong();
		System.out.print("Enter salary: ");
		double salary = sc.nextDouble();
		sc.nextLine();
		Officer o1 = new Officer(name, age, phNo, address, salary, spec);
		
		//Manager
		System.out.println("\nManager: ");
		System.out.print("Enter name: ");
		name = sc.nextLine();
		System.out.print("Enter department: ");
		String dep = sc.nextLine();
		System.out.print("Enter address: ");
		address = sc.nextLine();
		System.out.print("Enter age: ");
		age = sc.nextInt();
		System.out.print("Enter phone no: ");
		phNo = sc.nextLong();
		System.out.print("Enter salary: ");
		salary = sc.nextDouble();
		Manager m1 = new Manager(name, age, phNo, address, salary, dep);
		
		o1.printSalary();
		m1.printSalary();
		
		System.out.println("\nOFFICER:\nName: "+o1.name+",\nAge: "+o1.age+",\nphNo: "+o1.phNo+",\nAddress: "+o1.address+",\nSalary: "+o1.salary);
		System.out.println("\nMANAGER:\nName: "+m1.name+",\nAge: "+m1.age+",\nphNo: "+m1.phNo+",\nAddress: "+m1.address+",\nSalary: "+m1.salary);
	}
}
