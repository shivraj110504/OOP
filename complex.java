package Assignments;
import java.util.Scanner;

public class complex{
    private float real;
    private float img;

    complex(){
        real = 0;
        img = 0;
    }
    complex(float real, float img){
        this.real = real;
        this.img = img;
    }

    public void add(complex c1, complex c2){
        float areal, aimg;
        areal = c1.real + c2.real;
        aimg = c1.img + c2.img;
        System.out.println("The additionn is: " + areal + " + " + aimg + "i");
    }
    public void subs(complex c1, complex c2){
        float sreal, simg;
        sreal = c1.real -c2.real;
        simg = c1.img - c2.img;
        System.out.println("The substraction is: " + sreal + " + " + simg + "i");
    }
    public void multiplication(complex c1, complex c2){
        float mreal, mimg;
        mreal = c1.real * c2.real - c1.img * c2.img;
        mimg = c1.img * c2.real + c2.real * c1.img;
        System.out.println("Teh multiplication is: " + mreal + " + " + mimg+ "i");
    }
    public void division(complex c1, complex c2){
        float dreal, dimg, deno;
        deno = c2.real * c2.real + c2.img + c2.img;
        dreal = c1.real * c2.real + c1.img * c2.img;
        dimg = c1.img * c2.real - c2.img * c1.real;
        System.out.println("Teh multiplication is: " + dreal + " + " + dimg+ "i");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int ch = 0;
        float num1, num2, num3, num4;
        System.out.println("Enter the first number: ");
        num1 = scan.nextFloat();
        num2 = scan.nextFloat();
        complex c1 = new complex(num1, num2);

        System.out.println("Enter the another two numbers: ");
        num3 = scan.nextFloat();
        num4 = scan.nextFloat();
        complex c2 = new complex(num3, num4);

        complex c3 = new complex();
        do{
            System.out.println("******MENU*******");
            System.out.println("1.Add\n 2.Subs\n3.Mul\n 4.Div\n 5.Exit");
            System.out.println("Enter your choice: ");
            ch = scan.nextInt();
            switch (ch) {
                case 1:
                    c3.add(c1, c3);
                    break;
                case 2:
                c3.subs(c1,c2);
                break;
                case 3:
                c3.multiplication(c1, c2);
                break;
                case 4:
                c3.division(c1,c2);
                break;
                case 5:
                System.exit(0);
            }
        }while(ch != 5);


    }
}