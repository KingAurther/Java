
public class ClassA
{
 static int a=0;
 int b=0;
 ClassA()
 {
	 a++;
	 b++;
	 System.out.println("Static variable==:"+a);
	 System.out.println("natance variable==:"+b);
	 System.out.println("----------------");
	 
 }
 void display()
 {
	 System.out.println("********accesing static variable********");
	 System.out.println(ClassA.a);
	 System.out.println(a);
	 System.out.println(new ClassA().a);
	 
 }
 public static void main(String[] args) 
 {
	 new ClassA();
	 new ClassA();
	 new ClassA();
	 System.out.println("#####################");
	 new ClassA().display();
	
}
}
