package Java_Design_Patterns;

interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Circle drawn");
    }
}

class Square implements Shape {
    public void draw() {
        System.out.println("Square drawn");
    }
}

class ShapeFactory {
    public Shape getShape(String type) {
        if (type.equalsIgnoreCase("circle")) return new Circle();
        else if (type.equalsIgnoreCase("square")) return new Square();
        return null;
    }
}

public class Factory {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape s1 = factory.getShape("circle");
        s1.draw();
    }
}
