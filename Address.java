import java.io.*;
class Customer{
String customerName;
String customerEmail;
String customerType;
Address customerAddress;
Customer(String customerName,String customerEmail,String customerType,Address customerAddress)
{
this.customerName=customerName;
this.customerEmail=customerEmail;
this.customerType=customerType;
this.customerAddress=customerAddress;
}
void displayDetails()
{
System.out.println("Name: "+customerName);
System.out.println("E-mail: "+customerEmail);
System.out.println("Type: "+customerType);
customerAddress.displayAddress();
}
}
class Address{
String street;
String city;
int pincode;
String country;
Address(String street,String city,int pincode,String country)
{
this.street=street;
this.city=city;
this.pincode=pincode;
this.country=country;
}
void displayAddress()
{
System.out.println("Street: "+street);
System.out.println("City: "+city);
System.out.println("Pincode: "+pincode);
System.out.println("Country: "+country);
}
}


class Test{
public static void main(String args[])
throws IOException
{
String name,email,type,add,city,country;
int pincode;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter the Customer Details");
System.out.println("Enter the name");
name=br.readLine();
System.out.println("Enter the email");
email=br.readLine();
System.out.println("Enter the type");
type=br.readLine();

System.out.println("Enter Customer Address");
System.out.println("Enter the street");
add=br.readLine();
System.out.println("Enter the city");
city=br.readLine();
System.out.println("Enter the pincode");
pincode=Integer.parseInt(br.readLine());
System.out.println("Enter the country");
country=br.readLine();
Address ad=new Address(add,city,pincode,country);
Customer cus=new Customer(name,email,type,ad);

cus.displayDetails();
}
}