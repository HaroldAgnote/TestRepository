/**
 * Created by Harold on 8/6/2016.
 */
public class Main
{
    public static void main(String[]args)
    {
        TestClass test = new TestClass();
        TestClass testTwo = new TestClass("Hi, there!");
        TestClass testThree = new TestClass("Hello, there!");

        System.out.println(test);
        System.out.println(testTwo);
        System.out.println(testThree);
    }
}