package Assignments.Assignment03;

import java.util.Scanner;

public class Employee{
    String emp_name;
    int emp_id;
    String email_id;
    String Address;
    long mobile_no;
    Scanner scan = new Scanner(System.in);

    public void Read(){
        System.out.println("Enter the name: ");
        emp_name = scan.nextLine();
        System.out.println("Enter emp id: ");
        emp_id = scan.nextInt();
        System.out.println("Eneter the address: ");
        Address = scan.nextLine();
        System.out.println("Enter the email_id: ");
        email_id = scan.nextLine();
        System.out.println("enter the mobile number");
        mobile_no = scan.nextLong();

    }

    public void display(){
        System.out.println("********EMPLOYEE Details*********");
        System.out.println("Name: "+emp_name);
        System.out.println("Id: "+emp_id);
        System.out.println("Address: "+ Address);
        System.out.println("Email ID: "+email_id);
        System.out.println("Mobile no: "+mobile_no);

    }
}
    class Programmer extends Employee{
        double BP, DA, HRA, PF, SCF;
        double Gross_sal, Net_sal;
        Programmer(){
            BP=15000;
        }
        public void calc(){
            DA = 0.97*BP;
            HRA = 0.10*BP;
            PF= 0.12*BP;
            SCF = 0.001*BP;
            Gross_sal = BP + DA + HRA;
            Net_sal = Gross_sal = SCF;
            System.out.println("\n\n*******SALARY DETAILS********\n");
            System.out.println("\nBasic Pay: "+BP);
            System.out.println("\nDearness Allowance: "+DA);
            System.out.println("\nHRA: " + HRA);
            System.out.println("\nPF: "+ PF);
            System.out.println("\nStaff club Fund: " + SCF);
            System.out.println("\nGross Salary: "+ Gross_sal);
            System.out.println("\nNet Salary: "+Net_sal);
        }
    }

    class professor extends Employee{
        double BP, DA, HRA, PF, SCF;
        double Gross_sal, Net_sal;
        professor(){
            BP=52000;
        }
        public void calc(){
            DA = 0.97*BP;
            HRA = 0.10*BP;
            PF= 0.12*BP;
            SCF = 0.001*BP;
            Gross_sal = BP + DA + HRA;
            Net_sal = Gross_sal = SCF;
            System.out.println("\n\n*******SALARY DETAILS********\n");
            System.out.println("\nBasic Pay: "+BP);
            System.out.println("\nDearness Allowance: "+DA);
            System.out.println("\nHRA: " + HRA);
            System.out.println("\nPF: "+ PF);
            System.out.println("\nStaff club Fund: " + SCF);
            System.out.println("\nGross Salary: "+ Gross_sal);
            System.out.println("\nNet Salary: "+Net_sal);
        }
    }

    class AssistantProfessor extends Employee{
        double BP, DA, HRA, PF, SCF;
        double Gross_sal, Net_sal;
        AssistantProfessor(){
            BP=46000;
        }
        public void calc(){
            DA = 0.97*BP;
            HRA = 0.10*BP;
            PF= 0.12*BP;
            SCF = 0.001*BP;
            Gross_sal = BP + DA + HRA;
            Net_sal = Gross_sal = SCF;
            System.out.println("\n\n*******SALARY DETAILS********\n");
            System.out.println("\nBasic Pay: "+BP);
            System.out.println("\nDearness Allowance: "+DA);
            System.out.println("\nHRA: " + HRA);
            System.out.println("\nPF: "+ PF);
            System.out.println("\nStaff club Fund: " + SCF);
            System.out.println("\nGross Salary: "+ Gross_sal);
            System.out.println("\nNet Salary: "+Net_sal);
        }
    }
    class AssociateProfessor extends Employee{
        double BP, DA, HRA, PF, SCF;
        double Gross_sal, Net_sal;
        AssociateProfessor(){
            BP=44000;
        }
        public void calc(){
            DA = 0.97*BP;
            HRA = 0.10*BP;
            PF= 0.12*BP;
            SCF = 0.001*BP;
            Gross_sal = BP + DA + HRA;
            Net_sal = Gross_sal = SCF;
            System.out.println("\n\n*******SALARY DETAILS********\n");
            System.out.println("\nBasic Pay: "+BP);
            System.out.println("\nDearness Allowance: "+DA);
            System.out.println("\nHRA: " + HRA);
            System.out.println("\nPF: "+ PF);
            System.out.println("\nStaff club Fund: " + SCF);
            System.out.println("\nGross Salary: "+ Gross_sal);
            System.out.println("\nNet Salary: "+Net_sal);
        }
    }

