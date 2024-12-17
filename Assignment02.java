package Assignments;

import java.util.Scanner;
abstract class Publication {
	String title;
	int price, copies;
	abstract void salecopy();
	abstract void setPrice();
}
class Book extends Publication {
	String author;
	void salecopy(){
		System.out.println("Book name:"+title);
		System.out.println("Author name:"+author);
		System.out.println("Price per Book:"+price);
		System.out.println("Copies ordered:"+copies);
		System.out.println("Total sales:"+copies*price);
	}
	void ordercopies(){
		System.out.println("Enter the quantity:");
		Scanner sc1= new Scanner(System.in);
		copies= sc1.nextInt();
	}
	void setPrice(){
		System.out.println("Enter title of Book:");
		Scanner sc= new Scanner(System.in);
		title= sc.nextLine();
		System.out.println("Enter the name of author:");
		Scanner sc2= new Scanner(System.in);
		author= sc2.nextLine();
		System.out.println("Enter the price of book:");
		Scanner sc1= new Scanner(System.in);
		price= sc1.nextInt();
	}
}
class Magzine extends Publication {
	String currIssue;
	void salecopy(){
		System.out.println("Magzine name:"+title);
		System.out.println("Current Issue:"+currIssue);
		System.out.println("Price per Magzine:"+price);
		System.out.println("Copies ordered:"+copies);
		System.out.println("Total sales:"+copies*price);
	}
	void orderQty(){
		System.out.println("Enter the quantity of magzine:");
		Scanner sc= new Scanner(System.in);
		copies= sc.nextInt();
	}
	void currIssue(){
		System.out.println("The current issue of Magzine is:"+currIssue);
	}
	void receiveIssue(){
		System.out.println("\nYou will receive "+currIssue+" Magzine soon!");
	}
	void setIssue(){
		System.out.println("Enter the title of the Magzine:");
		Scanner sc= new Scanner(System.in);
		title= sc.nextLine();
		System.out.println("Enter the current Issue:");
		Scanner sc1= new Scanner(System.in);
		currIssue= sc1.nextLine();
	}
	void setPrice(){
		System.out.println("Enter the price of magzine:");
		Scanner sc= new Scanner(System.in);
		price= sc.nextInt();
	}
}
public class Assignment02 {
	public static void main(String[] args) {
		System.out.println("\n----Book Department----");
		Book b= new Book();
		b.setPrice();
		b.ordercopies();
		System.out.println("----Details of Book registred Now----");
		b.salecopy();
		System.out.println("\n----Magzine Department----");
		Magzine m= new Magzine();
		m.setIssue();
		m.setPrice();
		m.orderQty();
		System.out.println("\n----Details of Magzine Registered Now----");
		m.salecopy();
		m.receiveIssue();
	}

}
