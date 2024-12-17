package Assignments.Assignment03;

import java.util.Scanner;
// import Assignments.Assignment03.Employee.AssistantProfessor;
// import Assignments.Assignment03.Employee.AssociateProfessor;
// import Assignments.Assignment03.Employee.professor;
// import Assignments.Assignment03.Employee.Programmer;

public class Assignment03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice = 0;
        Employee E = new Employee();
        Employee.Programmer p = E.new Programmer();
        Employee.professor pr = E.new professor();
        Employee.AssistantProfessor aspf = E.new AssistantProfessor();
        Employee.AssociateProfessor asp = E.new AssociateProfessor();

        do{
            System.out.println("\n******MENU******\n");
            System.out.println("1.Programmer");
            System.out.println("2.Professor");
            System.out.println("3.Assistant Professor");
            System.out.println("4. Associate professor");
            System.out.println("5.Exit");
            System.out.println("Enter your choice: ");
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    p.Read();
                    p.display();
                    p.calc();
                    break;
                case 2:
                    pr.Read();
                    pr.display();
                    pr.calc();
                    break;
                case 3:
                    aspf.Read();
                    aspf.display();
                    aspf.calc();
                    break;
                case 4:
                    asp.Read();
                    asp.display();
                    asp.calc();
                    break;
                case 5:
                   System.out.println("Existing program !!!!");
                    break;
            }
        }while(choice != 5);
        scan.close();
    }
}
