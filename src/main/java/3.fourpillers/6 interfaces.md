 # Interface
 > We all know that class are blueprint of object (attributes and behaviour) <br>
 > Similarly `Interface` is blueprint of methods.

## Key Features
- ***Abstract Methods:*** An interface can contain abstract methods, which must be implemented by any class that implements the interface. Abstract methods do not have a body in the interface.
- ***Default Methods:*** Since Java 8, interfaces can have default methods with a body. These methods provide a default implementation that can be overridden by implementing classes.
- ***Static Methods:*** Interfaces can have static methods with a body, which can be called using the interface name. These methods cannot be overridden by implementing classes.
- ***Constants:*** Interfaces can contain constants (static final variables). These are public, static, and final by default.
 
## Use of Interface
- Interface provides the very strong `abstraction` .
- Because Interface don't contain implementation .
- It only contains methods definition not method body .

## Syntax
```java
interface LivingThings{
    static final boolean needWater = true;
    void walk();
    void eat();
    
    // Default method (with a body)
    default void defaultMethod() {
     System.out.println("All living things able to reproduce");
    }
   
    // Static method (with a body)
    static void staticMethod() {
     System.out.println("This is a static method");
    }
}

class Human implements LivingThings{
    @Override
    void walk(){
        System.out.println("Human can walk");
    }

    @Override
    void eat(){
        System.out.println("Human can veg and non-veg");
    }
    
    void speak(){
        System.out.println("Human can speak");
    }
}

class Animal implements LivingThings{
    @Override
    void walk(){
        System.out.println("All animal can walk");
    }

    @Override
    void eat(){
        System.out.println("Animal can veg and non-veg");
    }
    
    void FourLegs(){
        System.out.println("Most of the animal have four legs except monkey");
    }
}

class Bird implements LivingThings{
    @Override
    void walk(){
        System.out.println("All Bird can walk");
    }

    @Override
    void eat(){
        System.out.println("Bird can veg and non-veg");
    }
    
    void fly(){
        System.out.println("All birds can fly except penguin");
    }
} 
```

> Here `walk();` and `eat();` are abstracted in interface and implemented all class which implements it. 

>You can't use static and final keyword at same time

## Extending Interfaces
- Interfaces can extend other interfaces using the extends keyword. An interface can extend multiple interfaces.
```java
public interface AnotherInterface extends MyInterface {
    void anotherMethod();
}
```

## Multiple Inheritance
- As we discussed inheritance gives you the ability to do multiple inheritance in java .

```java
public class MultiInterfaceClass implements MyInterface, AnotherInterface {
    @Override
    public void abstractMethod() {
        System.out.println("Implementing abstract method");
    }

    @Override
    public void anotherMethod() {
        System.out.println("Implementing another method");
    }
}
```
## Functional Interfaces
- A functional interface is an interface with exactly one abstract method. They are used in lambda expressions and method references.
- `@FunctionalInterface` is optional but highly recommended . 

```java
@FunctionalInterface
public interface MyFunctionalInterface {
    void singleAbstractMethod();

    // Other methods, such as default or static methods, are allowed
}
```


## Default and Static Method Resolution
- When a class implements an interface that contains default methods, it can choose to override them. 
- If a class implements multiple interfaces with conflicting default methods, the class must override the conflicting methods to resolve the ambiguity.

```java
public interface Interface1 {
    default void method() {
        System.out.println("Interface1");
    }
}

public interface Interface2 {
    default void method() {
        System.out.println("Interface2");
    }
}

public class MyClass implements Interface1, Interface2 {
    @Override
    public void method() {
        // Resolves the conflict by providing its own implementation
        System.out.println("MyClass");
    }
}
```

## Interface Inheritance and Polymorphism
- Interfaces support polymorphism
- Allowing you to use an interface type to refer to any object that implements that interface.
- This is useful for writing flexible and reusable code.

```java
public class Example {
    public static void main(String[] args) {
        MyInterface obj = new MyClass();
        obj.abstractMethod(); // Calls the implemented method
        obj.defaultMethod();  // Calls the default method from the interface
    }
}
```