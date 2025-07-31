package Java_Principles;

//S — Single Responsibility Principle (SRP)
//A class should have only one reason to change.
//Bad
class Employee {
    void calculateSalary() { /* salary logic */ }
    void printReport() { /* report logic */ } // Violates SRP
}
//Good
class SalaryCalculator {
    void calculateSalary() {
        System.out.println("Calculating salary...");
    }
}
class ReportPrinter {
    void printReport() {
        System.out.println("Printing report...");
    }
}

//O — Open/Closed Principle (OCP)
//Software entities should be open for extension but closed for modification.
//Bad
class Shape1 {
    String type;
}
class AreaCalculator1 {
    double calculateArea(Shape1 shape) {
        if (shape.type.equals("circle")) { return 3.14 * 5 * 5; }
        else if (shape.type.equals("square")) { return 5 * 5; }
        return 0;
    }
}
//Good
interface Shape {
    double calculateArea();
}
class Circle implements Shape {
    public double calculateArea() {
        return 3.14 * 5 * 5;
    }
}
class Square implements Shape {
    public double calculateArea() {
        return 5 * 5;
    }
}
class AreaCalculator {
    double calculateArea(Shape shape) {
        return shape.calculateArea();
    }
}

//L — Liskov Substitution Principle (LSP)
//Subclasses should be substitutable for their base class without breaking functionality.
//Bad
class Bird1 {
    void fly() { System.out.println("Flying"); }
}
class Ostrich1 extends Bird1 {
    void fly() { throw new UnsupportedOperationException(); } // Violates LSP
}

//Good
interface Bird {
    void makeSound();
}
interface FlyingBird extends Bird {
    void fly();
}
class Sparrow implements FlyingBird {
    public void fly() { System.out.println("Flying"); }
    public void makeSound() { System.out.println("Chirp"); }
}
class Ostrich implements Bird {
    public void makeSound() { System.out.println("Boom"); }
}

//I — Interface Segregation Principle (ISP)
//Clients should not be forced to implement interfaces they don't use.
//Bad
interface Worker {
    void work();
    void eat(); // Not every worker needs this
}
class Robot1 implements Worker {
    public void work() { System.out.println("Working"); }
    public void eat() { } // Doesn't make sense
}

//Good
interface Workable {
    void work();
}
interface Eatable {
    void eat();
}
class Human implements Workable, Eatable {
    public void work() { System.out.println("Working"); }
    public void eat() { System.out.println("Eating"); }
}
class Robot implements Workable {
    public void work() { System.out.println("Working like a robot"); }
}

//D — Dependency Inversion Principle (DIP)
//High-level modules should not depend on low-level modules. Both should depend on abstractions.
//Bad
class MySQLDatabase1 {
    void connect() { System.out.println("Connected to MySQL"); }
}
class App1 {
    MySQLDatabase db = new MySQLDatabase();
    void start() { db.connect(); }
}

//Good
interface Database {
    void connect();
}
class MySQLDatabase implements Database {
    public void connect() { System.out.println("Connected to MySQL"); }
}
class App {
    private Database db;

    public App(Database db) {
        this.db = db;
    }

    void start() {
        db.connect();
    }
}

//
//        | Principle | Purpose                                    | Java Tip                           |
//        | --------- | ------------------------------------------ | ---------------------------------- |
//        | SRP       | One responsibility per class               | Split logic into multiple classes  |
//        | OCP       | Add new code without changing existing one | Use interfaces and polymorphism    |
//        | LSP       | Subtypes replace base type safely          | Don’t break behavior of base class |
//        | ISP       | Don't force unused methods                 | Create small, specific interfaces  |
//        | DIP       | Depend on abstraction                      | Use interfaces in constructors     |





public class Solid_Principles {
}






