import java.util.Scanner;

public class Reverse{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String str1 = sc.nextLine();
		String str2 = "";
		for(int i=0; i<str1.length(); i++){
			str2 = str1.charAt(i) + str2;
		}
		System.out.println("Reversed String: "+ str2);
	}
}
