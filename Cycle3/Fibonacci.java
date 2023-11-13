import java.util.Scanner;


class Fibonacci{
	static int fib(int num){
		if(num==0){
			return 0;
		}
		else if(num==1 || num==2){
			return 1;
		}
		
		return fib(num-1) + fib(num-2);
	}	
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num: ");
		int  num = sc.nextInt();
		
		System.out.println("Fibonacci series of " + num + "numbers:");
		int i=0;
		while(true){
			int ans = fib(i);
			if(ans <= num){
				System.out.println(ans);
			}
			else{
				break;
			}
			i++;
		}
	}
}
