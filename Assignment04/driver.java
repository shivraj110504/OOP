package Assignments.Assignment04;

import java.util.Scanner;

public class driver {
    public static void main(String[] args) {
        int choice = 0;
        System.out.println("Enter base and height of Triangle");
        Scanner scan = new Scanner(System.in);
        double b = scan.nextDouble();
        double h = scan.nextDouble();
        do{
            System.out.println("\n******MENU******\n");
            System.out.println("1.Triangle");
            System.out.println("2.Rectangle");
            System.out.println("3.Exit");
            System.out.println("Enter your choice: ");
            choice = scan.nextInt();
            Shape s;
            switch (choice) {
                case 1:
                    s= new Triangle();
                    s.setBase(b);
                    s.setHeight(h);
                    s.computeArea();
                    break;
                case 2:
                    s = new Rectangle();
                    s.setBase(b);
                    s.setHeight(h);
                    s.computeArea();
                    break;
                case 3:
                    System.out.println("Existing program !!!!");
                    break;
            }
        }while(choice != 3);
    }
}
