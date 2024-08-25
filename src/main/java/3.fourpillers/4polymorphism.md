> ⚠️ **Pre-request :** Before moving to Polymorphism you should have strong understanding of inheritance and it's types

# Polymorphism
- **Polymorphism** is a Greek word derived from two components:
  1. Poly: Meaning "many" or "multiple"
  2. Morph: Meaning "form" or "shape" or "duplicate" or "imitate"
  >Therefore, polymorphism literally means "many forms" or "having multiple forms."

## Polymorphism in java
>In the context of programming, it refers to the ability of objects of different types to be treated as  same type.
>Don't scare will see example .

## Types of Polymorphism
- Compile time Polymorphism
- Run time Polymorphism

![overload and override illustration](https://scaler.com/topics/images/overloading-and-overriding-in-python-1.webp)

### Compile time Polymorphism OR Method overload

>Compile time Polymorphism easy to understand from the name Method overload
>we can understand single method is overloaded by different types

```java
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class Calculate{
    public static void addition(){
        Calculator calculator = new Calculator();
        int calInt = calculator.add(4,5);
        double calDouble = calculator.add(4.2,5.3);
        
        system.out.println("calInt :" + calInt);
        system.out.println("calDouble :" + calDouble);
    }
}
```
- You can see the above code will single method ***add*** but execute different method as per input methods


>without overload, you will achieve above scenario by using control flow like if and else

```java
class Calculator {
    // Single method returning a Number type
    public Number add(Number a, Number b) {
        if (a instanceof Integer && b instanceof Integer) {
            return a.intValue() + b.intValue();
        } else if (a instanceof Double && b instanceof Double) {
            return a.doubleValue() + b.doubleValue();
        } else {
            throw new IllegalArgumentException("Unsupported types");
        }
    }
}

class Calculate {
    public static void addition() {
        Calculator calculator = new Calculator();
        
        // Add integers
        Number calInt = calculator.add(4, 5);
        System.out.println("calInt: " + calInt.intValue());
        
        // Add doubles
        Number calDouble = calculator.add(4.2, 5.3);
        System.out.println("calDouble: " + calDouble.doubleValue());
    }

    public static void main(String[] args) {
        addition();
    }
}
```

> 📌 You can see how polymorphism help write clean, maintainable code


### Run-time Polymorphism OR Method overriding
>From name itself you understand unlike method overload, override will occur in runtime

```java
class Animal{
    String name;
    void sound(){
        System.out.println("Each animal have their unique sound");
    }
}

class cat extends Animal{
    @Override
    void sound(){
        System.out.println("Cats sounds like meow !!!");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog sounds like bow !!!");
    }
}

class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();  // Each animal have their unique sound

        Animal cat = new Cat();
        cat.sound();  // Cats sounds like meow !!!

        Animal dog = new Dog();
        dog.sound();  // Dog sounds like bow !!!
    }
}
```

***Code without runtime polymorphism***
```java
class Animal {
    String name;

    // General sound method for animals
    void generalSound() {
        System.out.println("Each animal has their unique sound");
    }
}

class Cat extends Animal {
    // Specific method for cat sound
    void catSound() {
        System.out.println("Cats sound like meow!!!");
    }
}

class Dog extends Animal {
    // Specific method for dog sound
    void dogSound() {
        System.out.println("Dogs sound like bow bow");
    }
}

class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.generalSound();  // Each animal have their unique sound

        Cat cat = new Cat();
        cat.catSound();  // Cats sounds like meow !!!

        Dog dog = new Dog();
        dog.dogSound();  // Dog sounds like bow !!!
    }
}
```
>🤔 You might think the above approach looks very straightforward and simple, 
    but imagine handling an application with multiple modules and components. 
    In such cases, is it really a viable solution to create separate methods for every single class?

## Comparison of overload vs override
| Method Overloading                                                                                           | Method Overriding                                                                                                                  |
|--------------------------------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------------------|
| Compile-time Polymorphism.                                                                                   | Run-time Polymorphism.                                                                                                             |
| Occurs in the same class.                                                                                    | Occurs in two classes via inheritance.                                                                                             |
| Methods must have the same name and different parameters.                                                    | Methods must have the same name and same parameters.                                                                               |
| Parameters must differ in number, type, or both.                                                             | Parameters and return types must be the same.                                                                                      |
| Return type can be different.                                                                                | Return type must be the same or a subtype.                                                                                         |
| Improves code readability.                                                                                   | Achieves runtime polymorphism and dynamic dispatch.                                                                                |
| Can occur within the same class or its subclasses.                                                           | Occurs in a subclass that inherits from a superclass.                                                                              |
| Allows same method name for similar operations.                                                              | Redefines a method in the subclass with a specific implementation.                                                                 |
| Determined at compile-time.                                                                                  | Determined at runtime.                                                                                                             |
| Multiple methods can have the same name with different parameters in the same class or its subclasses.       | Provides a specific implementation of a method defined in the superclass in its subclass.                                          |
| Method overloading is used for creating methods with similar functionalities but different input parameters. | Method overriding is used for providing a specific implementation of a method in a subclass.                                       |
| The choice of which method to invoke is made at compile-time based on the method signature.                  | The choice of which method to invoke is made at runtime based on the object’s type.                                                |
| Method overloading is less related to inheritance and polymorphism.                                          | Method overriding is a fundamental concept in object-oriented programming and is closely related to inheritance and polymorphism.  |