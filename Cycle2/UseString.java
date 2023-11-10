import java.util.Scanner;

public class UseString{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String str1 = sc.nextLine(), str3;
		StringBuffer str2 = new StringBuffer(str1);
		
		
		System.out.print("1. Insert a string\n2. Modify character\n3. Append a string\nEnter option number: ");
		int choice = sc.nextInt(),pos;
		sc.nextLine();
		
		switch (choice){
			case 1:
				System.out.print("Enter string: ");
				str3 = sc.nextLine();
				System.out.print("Enter position: ");
				pos = sc.nextInt();
				str2.insert(pos, str3);
				
				str1 = str1.substring(0, pos) + str3 + str1.substring(pos, str1.length());
				break;
			case 2:
				System.out.print("Enter character: ");
				char ch = sc.next().charAt(0);
				System.out.print("Enter position: ");
				pos = sc.nextInt();
				str2.setCharAt(pos, ch);
				
				str1 = str1.substring(0,pos) + ch + str1.substring(pos+1, str1.length());
				break;
			case 3:
				System.out.print("Enter string: ");
				str3 = sc.nextLine();
				str1 += str3;
				str2.append(str3);
				break;
			default:
				System.out.println("Invalid option number.");
				break;
		}
		System.out.println("1."+str1+"\n2."+str2);
		
	}
}
