package Assignments.Assign11;
import java.io.IOException;
import java.util.Scanner;

public class Assignment11 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
		ShoppingCart cart = new ShoppingCart();
		Item item1 = new Item("Clothes",100);
		Item item2 = new Item("Shoes",1250);
		Item item3 = new Item("Books",400);
		cart.addItem(item1);
		cart.addItem(item2);
		cart.addItem(item3);
		cart.removeItem(item1);
		int ch;
		do{
			System.out.print("\n1.By Card \t2.By Paypal \t3.By Bitcoin \nHow will you do the payment : ");
			ch =sc.nextInt();
			switch(ch){
				case 1 : cart.pay(new CreditcadStartegy());
					break;
				case 2 :cart.pay(new PaypalStrategy());
					break;
				case 3 :cart.pay(new BitCoinStrategy());
					break;
				default:System.out.print("\nPlease Enter correct choice 1/2/3");
			}
		}while (ch<4);
        sc.close();

    }
}
