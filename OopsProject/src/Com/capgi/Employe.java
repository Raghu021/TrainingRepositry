package Com.capgi;

public class Employe {
	int Employeid;
	String EmployeName;
	Addres addres;
	public Employe(int employeid,String employeName,Addres addres )
	{
		this.Employeid=employeid;
		this.EmployeName=employeName;
		this.addres=addres;
	}
	public void Display()
	{
		System.out.println(Employeid);
		System.out.println(EmployeName);
		System.out.println(addres.addresId);
		System.out.println(addres.addres1);
		System.out.println(addres.addres2);
		System.out.println(addres.city);
	}
	

}
