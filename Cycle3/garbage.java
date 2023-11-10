import java.util.Scanner;

class Employee{
	String name;
	int id;
	
	Employee(String name, int id){
		this.name = name;
		this.id = id;
	}
	
	void show(){
		System.out.println("Name: "+name+", Id: "+id);
	}
	public void finalize(){
		System.out.println("Garbage collected");
	}
}


public class garbage{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter id of employee 1: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter name of employee 1: ");
		String name = sc.nextLine();
		Employee e1 = new Employee(name, id);
		
		System.out.print("Enter id of employee 2: ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter name of employee 2: ");
		name = sc.nextLine();
		Employee e2 = new Employee(name, id);
		
		System.out.print("Enter id of employee 3: ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter name of employee 3: ");
		name = sc.nextLine();
		Employee e3 = new Employee(name, id);
		
		e1.show();
		e2.show();
		e3.show();
		e1=e2=null;
		
		System.gc();
		e3.show();	
		
	}
}
