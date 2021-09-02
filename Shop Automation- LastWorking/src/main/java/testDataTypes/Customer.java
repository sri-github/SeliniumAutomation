package testDataTypes;

public class Customer {
	  public String firstName;
	  public String lastName;
	  public int age;
	  public String emailAddress;
	  public String password;
	  public Address address;
	  public PhoneNumber phoneNumber;	
	  
	  public class Address {
		  public String addressfirstName;
		  public String addresslastName;
		  public String streetAddress;
		  public String city;
		  public String postCode;
		  public String state;
		  public String country;
	  }

	  public class PhoneNumber {
		  public String mob;
	  }
	  public String aliasaddress;

}