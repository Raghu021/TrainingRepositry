package Com.capgi;

public class Person extends Human{
	public Person(int humanId, String firstName, String lastName, String identity) {
		super(humanId, firstName, lastName);
		this.identity = identity;
	}
	public  String identity;
	public void dispalydetails() {
		super.dispalydetails();
		System.out.println(identity);
}
}

