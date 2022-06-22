package ContohAbstak;

public class Main {
    public static void main(String[] args) {
        // objek dari class triangle
        Triangle triangle = new Triangle(4,6);

        // objek dari class circle
        Circle circle = new Circle(8);

        System.out.println("Luas segitiga: " + triangle.getArea());
        System.out.println("Luas lingkaran: " + circle.getArea());
    }
}
