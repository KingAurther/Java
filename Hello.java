
class classA
{
    String meth1(int a,String s)
    {
        System.out.println(a+10);
        int i=new classA().meth2(30,"hello",20);
        System.out.println(i+i);
        return "java is awesome";
    }
    int meth2(int a,String s,int b)
    {
        System.out.println(a+b);
        System.out.println(s);
        return a-b;
    }
    public static void main(String[]args)
     {
        System.out.println("start");
        String data =new classA().meth1(10,"hi");
        System.out.println(data);
System.out.println("end");
        
    }
}