import java.net.*;
import java.io.*;
import java.util.Scanner;
public class ServerChat extends Thread {
	private ServerSocket server;
	private Socket sock;
	private BufferedReader read;
	private PrintStream write;
	public ServerChat( ) {
		try {
			server = new ServerSocket( 1235 );
			System.out.print( "Waiting... " );
			sock = server.accept( );
			read = new BufferedReader( new InputStreamReader(
					sock.getInputStream( )));
			write = new PrintStream( sock.getOutputStream( ) );
			System.out.println( "Connected." );
		} catch( IOException e ) {
			e.printStackTrace( );
		}
	}
	public void run( ) {
		while( true ) {
			try {
				System.out.println( "Client: "+ read.readLine( ) );
			} catch( IOException e ) {
				e.printStackTrace( );
			}
		}
	}
	public void write( ) {
		Scanner in = new Scanner( System.in );
		while( true ) {
			System.out.print( "Server -> " );
			write.println( in.nextLine( ) );
		}
	}
	public static void main( String args[] ) {
		ServerChat chat = new ServerChat( );
		chat.start( );
		chat.write( );
	}
}