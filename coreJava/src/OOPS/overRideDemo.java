package OOPS;

class Shape{
    void draw(){
        System.out.println("Draw the Shape.....");
    }
}

class Circle extends Shape{
    @Override
    void draw(){
        System.out.println("Draw the Circle.....");
    }
}

class Rectangle extends Shape{
    @Override
    void draw(){
        System.out.println("Draw the Rectangle.....");
    }
}

public class overRideDemo {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.draw();
        Circle circle =  new Circle();
        circle.draw();
        Rectangle rectangle = new Rectangle();
        rectangle.draw();
        Shape shape1 = new Circle();
        shape1.draw();//run time polymorphism 
    }
}
