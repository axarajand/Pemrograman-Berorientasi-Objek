class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a rectangle");
    }
    
    // Method overloading untuk menggambar persegi panjang dengan lebar dan panjang tertentu
    void draw(int length, int width) {
        System.out.println("Drawing a rectangle with length " + length + " and width " + width);
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Rectangle();
        Rectangle rectangle = new Rectangle();
        
        shape1.draw(); // Output: Drawing a rectangle (method overridden)
        rectangle.draw(); // Output: Drawing a rectangle (method overridden)
        rectangle.draw(5, 3); // Output: Drawing a rectangle with length 5 and width 3 (method overloaded)
    }
}
