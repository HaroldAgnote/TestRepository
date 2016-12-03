import java.net.*;
import java.io.*;
import java.util.Scanner;
public class ClientChat extends Thread {
	private Socket sock;
	private BufferedReader read;
	private PrintStream write;
	public ClientChat( ) {
		try {
			System.out.print( "Requesting Connection... " );
			sock = new Socket( "localhost", 1235 );
			read = new BufferedReader( new InputStreamReader(
					sock.getInputStream( )));
			write = new PrintStream( sock.getOutputStream( ) );
			System.out.println("Connected.");
		} catch( IOException e ) {
			e.printStackTrace( );
		}
	}
	public void run( ) {
		while( true ) {
			try {
				System.out.println( "Server: "+ read.readLine( ) );
			} catch( IOException e ) {
				e.printStackTrace( );
			}
		}
	}
	public void write( ) {
		Scanner in = new Scanner( System.in );
		while( true ) {
			System.out.print( "Client -> " );
			write.println( in.nextLine( ) );
		}
	}
	public static void main( String args[] ) {
		ClientChat chat = new ClientChat( );
		chat.start( );
		chat.write( );
	}
}