package s1;
import java.util.Scanner;
public class DemoString1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=s.nextLine();
		System.out.println("String : "+s1);
		System.out.println("Count : "+s1.length());
		s.close();
		System.out.println("=====Display Using Index======");
		for(int i=0;i<=s1.length()-1;i++) {
			System.out.print(s1.charAt(i)+" ");
		}
		System.out.println("\n=====Display reverse String======");
		for(int i=s1.length()-1;i>=0;i--) {
			System.out.print(s1.charAt(i)+" ");
		}
	}

}
