import java.util.Scanner;

public class ARQuestion4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the length and breadth of the rectangle: ");
        double length = scan.nextInt();
        double breadth = scan.nextInt();
        Rectangle rect = new Rectangle();
        System.out.println("The area of rectangle where no parameters passed : " + getAreaOfRectangle(rect.getLength(), rect.getBreadth()) + " sq.units");
        Rectangle rect1 = new Rectangle(length);
        System.out.println("The area of rectangle where one parameter passed : " + getAreaOfRectangle(rect1.getLength()) + " sq.units");
        Rectangle rect2 = new Rectangle(length, breadth);
        System.out.println("The area of rectangle where two parameters passed : " + getAreaOfRectangle(rect2.getLength(), rect2.getBreadth()) + " sq.units");
    }

    public static double getAreaOfRectangle(double length, double breadth) {
        return length * breadth;
    }

    public static double getAreaOfRectangle(double length) {
        return Math.pow(length, 2);
    }
}

class Rectangle {
    private double length;
    private double breadth;

    public Rectangle() {
    }

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Rectangle(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", breadth=" + breadth +
                '}';
    }
}
