# OOPs Pillars:
- Oops has four strong fundamental concept which makes life easy.
```
Inheritance
Abstraction
Encapsulation
Polymorphism
```

## Inheritance:
>Inheritance is concept where one class ***( called subclass )***
can acquire the attribute and behaviour
from another class ***( called super class)*** .

>In English Where ever you are seeing ***is a*** in word LHS inherits from RHS. 


cat **is an** Animal.<br/>
Dog **is an** Animal. <br/>
here cat inherits attributes and behaviours from Animals.


### Why we need Inheritance :
1. **Code Reusability:** Inherit common code across multiple classes to avoid duplication.
2. **Maintainability:** Easier to manage and update code when common behaviors are centralized in a superclass.
3. **Extensibility:** You can add new features to existing classes by extending them without modifying the original code.
4. **Polymorphism:** Enables flexible and dynamic behavior by allowing objects of different classes to be treated as objects of a common superclass.

### How we can achieve inheritance in java:
1. **extends** key word
    ```java
   class Vehicle {  // Superclass
    String brand = "Ford";

    void honk() {
        System.out.println("Beep beep!");
    }
    }
    
    class Car extends Vehicle {  // Subclass
    String modelName = "Mustang";
    }
   ```
2. **implements** key word
    ```java
   interface Animal {
      default void eat() {
          System.out.println("Eating...");
      }
      void bark();
    }
    
    class Dog implements Animal {
      void bark() {
          System.out.println("Barking...");
      }
    }
   ```
   >we can see what is interface later on .

## Types of Inheritance in java
- ***Single Inheritance:*** One class inherits from another.
- ***Multilevel Inheritance:*** A chain of inheritance from one class to another.
- ***Hierarchical Inheritance:*** Multiple classes inherit from a single superclass.
- ***Multiple Inheritance:*** Achieved via interfaces since Java does not support direct multiple inheritance.
- ***Hybrid Inheritance:*** A mix of multiple inheritance types, typically involving interfaces.

## Generalisation and Specialisation
- If you are learning inheritance we have to know some term and concept
- This will help you to understand inheritance and write code with propose and clear

### Generalisation
>If you are framing an entity or class in java if you feel that entity need more then one place
You will Design the class as superclass which mean only generic information should contain in that class
not specific details

### Specialisation
> Since you are deriving class from another class will be always lesser generic from super class.

Superclass always generic <br>
Subclass always less generic

![inheritance generic and specific](https://sourcemaking.com/files/sm/images/uml/img_120.jpg)


> ⚠️ in hierarchic more up you go will be generic

> ⚠️ in hierarchic more low you go will be specific

![more up generic](https://sourcemaking.com/files/sm/images/uml/img_121.jpg)

![more up generic](https://sourcemaking.com/files/sm/images/uml/img_122.jpg)