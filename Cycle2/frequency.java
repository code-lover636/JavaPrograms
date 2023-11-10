import java.util.Scanner;


class frequency{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.print("Enter string: ");
		String str = sc.nextLine();
		System.out.print("Enter character to find frequency: ");
		char chr = sc.next().charAt(0);
		
		for(int ch=0; ch<str.length(); ch++){
			if(chr == str.charAt(ch) ){
				count++;
			}
		}
		System.out.println(chr + " occurs " + count + " time(s).");
	}
}
