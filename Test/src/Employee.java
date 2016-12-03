/**
 * "Class Description"
 *
 * @author Harold Agnote
 */
public class Employee extends Person
{
	/** The Employee’s job description */
	private String jobDesc;
	/** The Employee’s annual income */
	private double salary;
	/** Initializes an Employee.
	 * @param n The name.
	 * @param a The address.
	 * @param d The job description.
	 * @param s The salary.
	 */
	public Employee(String n, String a, String d, double s) {
		super(n, a);
		jobDesc = d;
		salary = s;
	}
	/** Method to have an employee do their job */
	public void doJob() {
		//cannot access name directly, must use getName()
		System.out.println("My name is "+ getName());
		System.out.println("Work Work Work");
	}
	/** Displays an Employee */
	@Override
	public void display() {
		super.display();
		System.out.println(jobDesc);
		System.out.println(salary);
	}
}
