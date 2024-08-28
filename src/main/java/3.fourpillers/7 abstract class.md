# Abstract Class
- In java Abstract class are one of the key concept.
- We all know for abstraction we have interface.
- But the problem with interface is we can't have the method with body.
- In some cases we need both mix of concrete and abstract methods.
- Abstract help us to overcome this.

> Abstract class can have Constructors, concrete, abstract, attributes.

## Key Features of Abstract Classes:
- **Cannot be initiated :** By nature abstract class will have concrete and abstract method it's possible to initiate
- **Abstract Methods :** can abstract method like `void eat();`
- **Concrete Methods :** can also have concrete methods mean method with body `void eat(){ System.out.println("food are eatable"") }`
- **Constructors :** can also have constructor will call while subclass call super method.
- **Inheritance :** A subclass can extend only one abstract class as single inheritance model.
The subclass must Implement all abstract method from abstract class unless subclass also abstract class.
- **Use Case :** Abstract class are useful when you want share the code among several related subclass and some method should implement by subclass.

## Implementation

```java
abstract class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    abstract void sound();
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    void sound() {
        System.out.println(name + " says: Bark");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.sound(); // Output: Buddy says: Bark
    }
}
```