package Assignments.Assign11;
import java.io.*;
public class PaypalStrategy implements InnerPaymentStrategy.PaymentStrategy{
     String email_id,paswrd;
	public void info() throws IOException{
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Your Email ID : ");
		email_id=b.readLine();
		System.out.print("Enter Your Password : ");
		paswrd=b.readLine();
	}
	
	public void pay(double amnt) {
		System.out.println(amnt+" Paid using Paypal Successfully\nThank You !!");
	}
}

