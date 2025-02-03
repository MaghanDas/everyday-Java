
// theory
// Abstraction is a process of hiding the implementation details and showing
// only functionality to the user.

// Abstraction lets you focus on what the object does instead of how it does it.

// There are two ways to achieve abstraction in java

// 1.Abstract class (0 to 100%)
// 2.Interface (100%)

// we cannot create objects of abstract class
// we cannot create static methods as abstract , bcus they cant be overriden.
// we cannot create abstract constructor in abstract class
// but we can create static method in abstract class and can call it by classname.methodname;
// we can create normal function in abstract class aswell
// An abstract class can have a data member, abstract method, method body (non-abstract method),
// constructor, and even main() method.
public class Abstractions {

     public Abstractions() {
        System.out.println("Bike is created");
    }
    abstract void run ();
    void changeGear() {
        System.out.println("changing the gear");
    }
}

 class Honda extends Abstractions {

 }
