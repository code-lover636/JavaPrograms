import java.util.Scanner;

class InternetUsers{
	static int count=0;
	static int happyCustomers;
	final static int MAX_TIME = 2;
	String loginName;
	InternetUsers(String name){
		loginName = name;
	}
	static{
		System.out.println("Let's start browsing.");
		System.out.println("Maximum " + MAX_TIME + " hours allowed");
		happyCustomers = count +1;
	}
	static void show(){
		System.out.println("Count "+ count + ", happy customers: " + happyCustomers);
	}
	void compute(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Are you happy (yes/no): ");
		String isHappy =  sc.nextLine();
		if(isHappy.toLowerCase().equals("yes") ){
			happyCustomers++;
			System.out.println(loginName);
		}
	}
}

public class UseStatic{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name: ");
		String name =  sc.nextLine();
		InternetUsers  in1 = new InternetUsers(name);
		InternetUsers.show();
		in1.compute();
	}
}
