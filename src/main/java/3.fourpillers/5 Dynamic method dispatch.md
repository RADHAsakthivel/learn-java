# Flow of inheritance
- What is the heading mean, when you have standalone or inherited class one from another
- How java execute method using object that present in class or parent class, how it's getting work under hood
- That what we are going to see in this section

>When you invoke a method on an object in Java, 
>the Java runtime (JVM) determines which method to execute based on several factors, <br>
> 1. Including the class of the object, 
> 2. The inheritance hierarchy, 
> 3. Whether the method is overridden in any subclass. <br>
> This process involves ***dynamic method dispatch*** and the use of ***method tables (v-tables)***

## 1. Object Creation and Class Hierarchy
- When you create an object, such as ```Child child = new Child();```, 
- Memory is allocated on the heap for that object, ***and its fields are initialized*** with default value
- The object maintains a reference to its class, which is Child in this case. The class itself knows about its superclass, which might be Parent.

## 2. Virtual Method table
- While you declare the class JVM create the virtual table which includes memory address of variable and methods.
- A Virtual Method Table (v-table) is an internal data structure used by object-oriented languages like Java to facilitate dynamic method dispatch. 
- While the exact implementation details can vary between different JVM implementations, 
- The general structure and concept remain consistent. 
- Below is a simplified visualization of how a v-table might look.

```java
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }

    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    void fetch() {
        System.out.println("Dog fetches");
    }
}
```
### For shown classes v-table looks like 

- Class Animal: The v-table for Animal would look something like this:

| Offset | Method    | Address/Pointer   |
|--------|-----------|-------------------|
| 0      | `sound()` | `Animal::sound()` |
| 1      | `eat()`   | `Animal::eat()`   |

- Class Dog: The v-table for Dog, which extends Animal, would look like this:

| Offset | Method    | Address/Pointer    |
|--------|-----------|--------------------|
| 0      | `sound()` | `Dog::sound()`     |
| 1      | `eat()`   | `Animal::eat()`    |
| 2      | `fetch()` | `Dog::fetch()`     |

## 2. Method Resolution
- When you call a method on an object, like ```dog.sound();``` the JVM starts by looking at the class of the object (Dog).
- The JVM first checks if the Child class has an implementation of sound().
- You can see that `sound()` method refer to `Dog.Sound();` so it will call the method from Dog class
- If Child does not have an implementation but the superclass Parent does, like `eat();` the JVM will resolve `eat()` to the Parent class's version.
- This makes ***RunTime polymorphism*** possible


## 3. Dynamic Method Dispatch
- ***Object Creation :*** When an object is created, it contains a hidden pointer to the v-table of its class. This allows the JVM to quickly find the correct method to call.
- ***Method Invocation :*** When a method is invoked on an object, the JVM follows these steps:
  1. **V-table Lookup :** The JVM uses the object's v-table pointer to look up the correct method in the v-table.
  2. **Method Execution :** The method pointer in the v-table is then used to execute the actual method.
  3. **Polymorphism :** Because the v-table for an object is determined by its actual class at runtime (not by the reference type), the correct method is called even when using a reference of the superclass type.
      ```java
        class Test{
            public static void Main(){
                Animal dog = new Dog();
                dog.sound(); // will call sound method in Dog class not in Animal
            }
        }
     //this is what shown in 3rd point
     ```
## 4. Flow of inheritance
- Flow of inheritance will always be from down to top (subclass to superclass).

## Quiz

- Guess what is the answer
```java
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }

    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    void fetch() {
        System.out.println("Dog fetches");
    }
}

class Test{
    public static void Main(){
        Animal dog = new Dog();
        dog.fetch();
    }
}
```
#### Take time and think what is the answer ....

> Answer : Compile-Time Error: The call dog.fetch() will result in a compile-time error because fetch() is not declared in the Animal class, which is the type of the reference.

> Because Parent Animal doesn't have the reference of `fetch()` method that is only available in Dog class child