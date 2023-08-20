import java.util.Scanner;

abstract class Shape {
    float area;

    abstract public void input();

    abstract public void Compute();

    public void disp() {
        System.out.println("The area is " + area);
    }
}

class Rectangle extends Shape {
    float length;
    float breadth;

    public void input() {
        System.out.println("Calculation of Rectangle app:");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter length of rectangle:");
        length = scan.nextFloat();
        System.out.println("Please enter the breadth of Rectangle:");
        breadth = scan.nextFloat();
    }

    public void Compute() {
        area = length * breadth;
    }
}

class Square extends Shape {
    float length;

    public void input() {
        System.out.println("Calculation of Square app:");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter length of Square:");
        length = scan.nextFloat();
    }

    public void Compute() {
        area = length * length;
    }
}

class Circle extends Shape {
    float radius;

    public void input() {
        System.out.println("Calculation of Circle app:");
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter radius of Circle:");
        radius = scan.nextFloat();
    }

    public void Compute() {
        area = 3.14f * radius * radius;
    }
}

class Geometry {
    public void poly(Shape ref) {
        ref.input();
        ref.Compute();
        ref.disp();
    }
}

public class RivisionClassIA1 {
    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        Square sq = new Square();
        Circle c = new Circle();

        Geometry g = new Geometry();
        g.poly(rec);
        g.poly(sq);
        g.poly(c);
    }
}
