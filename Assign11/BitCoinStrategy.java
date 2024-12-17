package Assignments.Assign11;
import java.io.*;
public class BitCoinStrategy implements InnerPaymentStrategy.PaymentStrategy{
    public String name, key;
    @Override
    public void pay(double amnt) {
        System.out.println(amnt+" Paid using Bitcoin Successfully\nThank You !!");
    }
    @Override
    public void info() throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Your Username : ");
        name=b.readLine();
        System.out.print("Enter Your Bitcoin key : ");
        key=b.readLine();
    }
}
