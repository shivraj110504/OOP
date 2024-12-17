package Assignments.Assign11;
import java.io.*;
public class CreditcadStartegy implements InnerPaymentStrategy.PaymentStrategy{
    public String name,card_no,cvv,dob;
	public void info() throws IOException{
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Your Name : ");
		name=b.readLine();
		System.out.print("Enter Your Card Number : ");
		card_no=b.readLine();
		System.out.print("Enter Your CVV : ");
		cvv=b.readLine();
		System.out.print("Enter Your Date Of Expiry : ");
		dob=b.readLine();
	}
	public void pay(double amnt) {
		System.out.println(amnt+" Paid using Credit card Successfully\nThank You !!");
	}
}
