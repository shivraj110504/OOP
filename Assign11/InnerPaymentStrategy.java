package Assignments.Assign11;
import java.io.IOException;
public interface InnerPaymentStrategy {

    public interface PaymentStrategy {
        public void pay(double amnt);
        public void info() throws IOException;
    }
}
