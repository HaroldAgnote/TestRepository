import java.util.*;
import java.util.zip.CheckedInputStream;

/**
 * "File Description"
 *
 * @author Harold Agnote
 */
public class KeyGenerator
{
    public static void main( String[] args )
    {
        char [] key = new char[24];
        
        Random random = new Random(  );
        
        for (int j = 0; j < 1000; j++)
        {
            System.out.print( "\n [ " );
            for ( int i = 0; i < key.length; i++ )
            {
                int chance = random.nextInt( 100 ) + 1;
    
                if ( chance > 70 )
                {
                    int randomLetterNum = random.nextInt( 26 ) + 65;
                    char letter = Character.toChars( randomLetterNum )[ 0 ];
                    key[ i ] = letter;
                }
                else
                {
                    int randomNumber = random.nextInt( 10 );
                    char number = Integer.toString( randomNumber ).charAt( 0 );
                    key[ i ] = number;
                }
                System.out.print( key[ i ] + " " );
            }
            System.out.println( "]" );
        }
    }
}
