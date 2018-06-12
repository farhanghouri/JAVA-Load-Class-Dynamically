
public class Test 
{
    static
    {
        System.out.println("Static block called");
        func();
    }
    public Test()
    {
        System.out.println("Inside Test class constructor");
    }

    public static void func(){
        System.out.println("In func Test class");
        new myMain().func();
    }

}