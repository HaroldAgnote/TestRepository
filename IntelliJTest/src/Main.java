/**
 * Created by Harold on 8/6/2016.
 */
public class Main
{
    public static void main(String[]args)
    {
        Derived a = new Derived("A");
        Base b = new Base("B");
        
        Base c = new Derived( "C" );
        
        testFunction( a );
        testFunction( b );
        testFunction( c );
    }
    
    public static void testFunction(Base b)
    {
        System.out.println(b + " works!");
    }
}
