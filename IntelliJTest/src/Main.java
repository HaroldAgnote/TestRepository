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
        TestClass testFour = new TestClass("Bye now!");
        TestClass testFive = new TestClass("Forever");

        System.out.println(test);
        System.out.println(testTwo);
        System.out.println(testThree);
    }
}
