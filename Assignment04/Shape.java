package Assignments.Assignment04;

abstract class Shape{
    double base, height;
    abstract void computeArea();
    Shape(){
        base = 0;
        height = 0;
    }
    Shape(double b, double h){
        base = b;
        height = h;
    }
    double getBase(){
        return base;
    }
    double getHeight(){
        return height;
    }
    void setBase(double b){
        base = b;
    }
    void setHeight(double h){
        height = h;
    }
}
class Triangle extends Shape{
   void computeArea() {
         System.out.println("Area of Triangle is: "+(0.5*base*height));
   }
}
class Rectangle extends Shape{
    void computeArea(){
        System.out.println("Area of Rectangle is: "+(base*height));
    }
}   