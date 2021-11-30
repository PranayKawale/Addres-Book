package bridgelabz.mysqladdressbook;




public class AddressBookContacts 
{
	String firstName ;
	String lastName ;
	String address ;
	String city ;
	int zip ;
	long mobileNo ;
	String emailId ;


public AddressBookContacts (String firstName, String lastName, String address, String city, int zip, long mobileNo, String emailId) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.address = address;
	this.city = city;
	this.zip = zip;
	this.mobileNo = mobileNo;
	this.emailId = emailId;
	}
public String toString() {
	return "First name : "+firstName+ "  Last name : "+lastName+ "  Address : "+address+ "  City : "+city+ "  Zip code: "+zip+ "  MobileNumber : "+mobileNo+"  EmailId: "+emailId; 
	
}
}