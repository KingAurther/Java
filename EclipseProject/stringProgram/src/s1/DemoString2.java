package s1;
import java.util.Scanner;
public class DemoString2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String");
		String s1=s.nextLine();
		int count=0;
		System.out.print("Vowels in String : ");
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u') {
				System.out.print(s1.charAt(i)+" ");
				count++;
			}
		}
		System.out.print("\nCount : "+count);
		s.close();
	}

}
