package InterfaceConcept;


public class developing implements BankingClient, DomainClient { //When i use the "implements" keyword, I am saying i agree that i am responsible for implementing all the methods presenting in "bankingClient" interface.
	//this class is responsible. it is an agreement. Hover over red line on developing and implement all the classes to this class.
	//One class can implement more that one interface.

	public static void main(String[] args) {
		developing d = new developing();// The return type is developing, so i will get all the methods from developing.

		BankingClient dr = new developing(); //I changed the return type to "BankingClient" So now "dr" is responsible for calling all the methods in "BankingClient". I will not get "MyExtraMethod" when
		//I call methods with "dr" object. This is called Runtime polymorphisim.
		
		DomainClient ds = new developing();//Client is only interested in DomainClient methods that were implemented in this class which has multiple interfaces implemented. Well
		//changed the return type to DomainClient and client is able to access only methods dealing with DomainClient
		
		// Polymorphisim - you can only call particular methods in a particular interface.
		
		//DomainClient ds = d;
		
		ds.investment();
		ds.noninvesters();
		

	}

@Override
public void paycreditcard() {
	System.out.println("This is pay credit card implemented");
	
}

@Override
public void transferbalance() {
	System.out.println("This is transfer balance implemented");
	
}

@Override
public void checkingbalance() {
	System.out.println("This is checking balance implemented");
	
}

public void myExtraMethod_login() {//I can't access this method with 'bankingClient" as the return type.
	System.out.println("this is my method that i added to this class and not from interface. This is login");
}

@Override
public void investment() {
	// TODO Auto-generated method stub
	
}

@Override
public void noninvesters() {
	// TODO Auto-generated method stub
	
}

}
