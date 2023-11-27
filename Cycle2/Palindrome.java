import java.util.Scanner;

class Palindrome{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String str = sc.nextLine();
		
		for(int i=0; i<str.length()/2; i++){
			if(str.charAt(i) != str.charAt(str.length()-i-1)){
				System.out.println(str + " is not a palindrome.");
				return;
			}
		}
		
		System.out.println(str + " is a palindrome.");
	}
}
