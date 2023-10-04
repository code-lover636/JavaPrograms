import java.util.Scanner;

class Prime{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		int num = sc.nextInt();
		
		if(num<2){
			System.out.println(num + " is not prime.");
			return;
		}
		
		for(int factor=2; factor<=Math.sqrt(num); factor++){
			if(num%factor==0){
				System.out.println(num + " is not prime.");
				return;
			}
		}
		System.out.println(num + " is prime.");
	}
}
