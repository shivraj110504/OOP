package Assignments;

import java.util.Scanner;

interface vehicle{
    void grearup();
    void speedup();
    void status();
}
class car1 implements vehicle{
int grear, speed, speed2;
void initioal(){
    int a,b;
    while (1>0) {
        System.out.println("Enter the gear which car is running");
        Scanner scan = new Scanner(System.in);
        a=scan.nextInt();
        if (a>5) {
            System.out.println("Invalid Inputs");
        }else{
            break;
        }
        scan.close();
    }
    grear=a;
    while (1>0) {
        System.out.println("Enter the speed at which car is running (km/h): ");
        Scanner scan = new Scanner(System.in);
        b = scan.nextInt();
        if (b>345) {
            System.out.println("invalid input");
        }else
        break;
        scan.close();
    }
    speed=b;
}
public void grearup(){
    int c ;
    while (1>0) {
        System.out.println("Enteer how many gear you want to increase: ");
        Scanner scan = new Scanner(System.in);
        c = scan.nextInt();
        if (c>5) {
            System.out.println("Invalid Inputs");
        }else
        break;
        scan.close();
    }
    grear = (grear + c);
}
public void speedup(){
    int d;
    while (1>0) {
        System.out.println("Enter speed to increase: ");
        Scanner scan = new Scanner(System.in);
        d = scan.nextInt();
        if ((speed+d)>436) {
            System.out.println("invalid input");
        }else
        break;
        scan.close();
    }
    speed = (speed+d);
}
public void brakes(){
    int e;
    while (1>0) {
        System.out.println("Enter speed to bedecremented after applying brakes: ");
        Scanner scan = new Scanner(System.in);
        e = scan.nextInt();
        if (e>speed) {
            System.out.println("Speed to be decremented cant be greater than original:");
        }else
        break;
        scan.close();
    }
    speed2 = speed-e;
}
public void status(){
    System.out.println("Current gear of car: "+grear);
    System.out.println("Current speed of car: "+speed+" km/h");
    System.out.println("Speed after applying brakes: "+speed2+" km/h");
}
}

class bike1 implements vehicle{
    int grear, speed, speed2;
    void initioal(){
        int a,b;
        while (1>0) {
            System.out.println("Enter the gear which bike is running");
            Scanner scan = new Scanner(System.in);
            a=scan.nextInt();
            if (a>4) {
                System.out.println("Invalid Inputs(should be less than or equal to 4)");
            }else{
                break;
            }
            scan.close();
        }
        grear=a;
        while (1>0) {
            System.out.println("Enter the speed at which bike is running (km/h): ");
            Scanner scan = new Scanner(System.in);
            b = scan.nextInt();
            if (b>200) {
                System.out.println("invalid input");
            }else
            break;
            scan.close();
        }
        speed=b;
    }
    public void grearup(){
        int c ;
        while (1>0) {
            System.out.println("Enteer how many gear you want to increase: ");
            Scanner scan = new Scanner(System.in);
            c = scan.nextInt();
            if (c>5) {
                System.out.println("Invalid Inputs(must be less than 4)");
            }else
            break;
            scan.close();
        }
        grear = (grear + c);
    }
    public void speedup(){
        int d;
        while (1>0) {
            System.out.println("Enter speed to increase: ");
            Scanner scan = new Scanner(System.in);
            d = scan.nextInt();
            if ((speed+d)>200) {
                System.out.println("invalid input");
            }else
            break;
            scan.close();
        }
        speed = (speed+d);
    }
    public void brakes(){
        int e;
        while (1>0) {
            System.out.println("Enter speed to bedecremented after applying brakes: ");
            Scanner scan = new Scanner(System.in);
            e = scan.nextInt();
            if (e>speed) {
                System.out.println("Speed to be decremented cant be greater than original:");
            }else
            break;
            scan.close();
        }
        speed2 = speed-e;
    }
    public void status(){
        System.out.println("Current gear of bike: "+grear);
        System.out.println("Current speed of bike: "+speed+" km/h");
        System.out.println("Speed after applying brakes: "+speed2+" km/h");
    }
}

class bicycle1 implements vehicle{
    int grear, speed, speed2;
    void initioal(){
        int a,b;
        while (1>0) {
            System.out.println("Enter the gear which car is running");
            Scanner scan = new Scanner(System.in);
            a=scan.nextInt();
            if (a>10) {
                System.out.println("Invalid Inputs");
            }else{
                break;
            }
            scan.close();
        }
        grear=a;
        while (1>0) {
            System.out.println("Enter the speed at which bicycle is running (km/h): ");
            Scanner scan = new Scanner(System.in);
            b = scan.nextInt();
            if (b>50) {
                System.out.println("invalid input");
            }else
            break;
            scan.close();
        }
        speed=b;
    }
    public void grearup(){
        int c ;
        while (1>0) {
            System.out.println("Enteer how many gear you want to increase: ");
            Scanner scan = new Scanner(System.in);
            c = scan.nextInt();
            if (c>10) {
                System.out.println("Invalid Inputs");
            }else
            break;
            scan.close();
        }
        grear = (grear + c);
    }
    public void speedup(){
        int d;
        while (1>0) {
            System.out.println("Enter speed to increase: ");
            Scanner scan = new Scanner(System.in);
            d = scan.nextInt();
            if ((speed+d)>50) {
                System.out.println("invalid input");
            }else
            break;
            scan.close();
        }
        speed = (speed+d);
    }
    public void brakes(){
        int e;
        while (1>0) {
            System.out.println("Enter speed to bedecremented after applying brakes: ");
            Scanner scan = new Scanner(System.in);
            e = scan.nextInt();
            if (e>speed) {
                System.out.println("Speed to be decremented cant be greater than original:");
            }else
            break;
            scan.close();
        }
        speed2 = speed-e;
    }
    public void status(){
        System.out.println("Current gear of bicycle: "+grear);
        System.out.println("Current speed of bicycle: "+speed+" km/h");
        System.out.println("Speed after applying brakes: "+speed2+" km/h");
    }
    }

public class Assignment05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int c;
        System.out.println("\nPress respective number to choose your option\n");
        System.out.println("\n 1.Car\n 2.Bike \n 3.Bicycle\n");
        do{
            
            c = scan.nextInt();
            switch (c) {
                case 1:
                    car1 car = new car1();
                    car.initioal();
                    car.grearup();
                    car.speedup();
                    car.brakes();
                    car.status();
                break;
                
                case 2:
                    bike1 bike = new bike1();
                    bike.initioal();
                    bike.grearup();
                    bike.speedup();
                    bike.brakes();
                    bike.status();
                break;

                case 3:
                    bicycle1 bicycle = new bicycle1();
                    bicycle.initioal();
                    bicycle.grearup();
                    bicycle.speedup();
                    bicycle.brakes();
                    bicycle.status();
                break;
                
            }
            System.out.println("do you want to continue (y/n)");
            //Scanner scan1 = new Scanner(System.in);
            char f = scan.next().charAt(0);
            if (f=='n') {
                c=4;
            }else
            System.out.println("\n 1.Car\n 2.Bike \n 3.Bicycle\n");

        }while(c!=4);
        scan.close();
    }
}
