package Com.capgi;

public class Human {
int humanId;
String firstName;
String lastName;
public Human(int humanId, String firstName, String lastName) {
	super();
	this.humanId = humanId;
	this.firstName = firstName;
	this.lastName = lastName;
}

public void dispalydetails() {
	System.out.println(humanId+" "+firstName+" "+lastName);
	
}
}
