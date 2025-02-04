public class Demo 
{
    static {
        System.out.println("In static block 1");
    }
    static {
        System.out.println("In static block 2");
    }
    public static void main(String[] args)
 {
    System.out.println("hello");
 }
 static {
    System.out.println("in static block 3");
 }
}