/**
 * "Class Description"
 *
 * @author Harold Agnote
 */
public class Person
{
	/** First name of the person */
	private String name;
	/** Location where the person lives */
	private String address;
	/** Initializes a person’s name and address
	 * @param n First name.
	 * @param a Street address.
	 */
	public Person(String n, String a) {
		name = n;
		address = a;
	}
	/** Displays a person’s information */
	public void display() {
		System.out.println(name);
		System.out.println(address);
	}
	/** Accesses a person's name
	 * @return the name of the person object.
	 */
	public String getName() {
		return name;
	}
	/** Accesses a person's address
	 * @return the street address of the person object
	 */
	public String getAddress() {
		return address;
	}
}
