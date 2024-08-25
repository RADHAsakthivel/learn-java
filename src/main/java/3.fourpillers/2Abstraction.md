# Abstraction:
>Abstraction is a concept where essential detail of method or
class are provided to user so user can work without needing to
understand the underlying complexity .

[//]: # (>You can ***achieve abstraction*** using ***interface***)

[//]: # (but you have make all the method's as abstract what if you want)

[//]: # (some of the methods should abstract some method should concrete)

[//]: # (for this abstraction )


## Why we need Abstraction:
- Simplifies complexity systems
- Enhances Code Reusability
- Improves Maintainability
- Supports Polymorphism
- Promotes Encapsulation
- Enhances Security

1. **Simplifies complexity systems:** 
   By hiding the inner implementation
   developer can focus on relevant aspects and work with system more efficiently
    >example : Instead of worrying about how a car engine works internally, 
     a driver only needs to know how to start the car and drive it.
2. ***Enhances Code Reusability:*** 
   By abstraction common functionalities
   into ***general methods or class***, these components can be used from
   part of an application or even in different project. 
   This ensures code reusability .
    >Example: A generic database connection class can be used across 
     different parts of an application without needing to know 
     the specific details of each database interaction.
3. ***Improves Maintainability:***
   Abstracting the implementation details helps in maintaining the code. If the internal implementation of a method or class needs to change, it can be done without affecting the code that uses it, as long as the abstracted interface remains the same.
   >Example: You can change the underlying algorithm of a sorting method without changing how other parts of the code call this method.
4. ***Supports Polymorphism:***
   ```java
   // Abstract class
   abstract class Shape {
       //Abstract method (does not have a body)
       abstract void draw();
     
       // Concrete method
       void description() {
       System.out.println("This is a shape.");
     }
   }
   
   // Concrete class 1: Circle
    class Circle extends Shape {
      // Implementing the abstract method
      void draw() {
        System.out.println("Drawing a Circle");
      }
    }
   ```
   while running draw method in Circle class will be executed
   this possible by runtime polymorphism.
5. ***Promotes Encapsulation:***
   Abstraction often goes hand-in-hand with encapsulation, 
   another OOP principle. 
   By hiding the internal implementation details, 
   you protect the internal state of objects and ensure that they can only be modified in controlled ways.
   >Example: A class may expose a ```getBalance()``` method to retrieve a bank account balance without revealing how the balance is calculated internally.
6. ***Enhances Security:***
   By hiding the implementation details, 
   abstraction can prevent unintended interference with the 
   internal workings of an object, 
   reducing the risk of introducing errors or security vulnerabilities.
   >Example: A banking system might abstract the complex logic behind transaction validation, 
    exposing only the necessary methods to initiate a transaction.

## Pros and Cons of Abstraction
### Pros:
- Improved code reuse
- Increased modularity
- Improved maintainability
### Cons:
- Increased complexity and overhead
- Potential for over-engineering

> We have discussed reuse,modularity,maintainability in above
> We can see Increasing complexity, overhead and over-engineering

1. **Increased complexity and overhead :**
   1. When you are using abstraction ***You will be adding more layer*** in application.
   2. When There are more layer it's very hard to understand and debug the application.
   3. ***Lead to performance issue :*** Because additional layer need to handle more layer
   while execution this lead's to performance issue.
   >Example : interface and abstract class are extra layer in application
2. **Potential for over-engineering :**
   1. Over-engineering occurs when a system is made more complex than necessary.,
   2. Adding features, layers, or abstractions that aren't really needed.
   > This will happen when a developer use interface, abstract class that don't 
     have clear purpose.
## How to implement Abstraction in java
There are two ways to implement abstraction in java.
- Interface
- abstract class

1. Interface 
 > We can see what interface indepth down the line for now just look syntax
  ```java
     interface TransferMoney{
         int checkBalance(String accountNumber);
         boolean transferMoney(Account accountDetails, int amountToTransfer);
     }
  ```
 > Notice here interface will make all the method as abstract method
   the problem is if you want to only some method to be abstract some method to be
   concrete here is the abstract class comes to picture.


2. Abstract is a keyword in java which can be used in front of class
   ```java
    abstract class  TransferMoney{
      string getAccountHolderName(string accountNumber){
        string accountHolderName = account.getName(accountNumber);
      }
   
     abstract int checkBalance(String accountNumber);
     abstract boolean transferMoney(Account accountDetails, int amountToTransfer);
    }
   
   public class TransferClass extends  TransferMoney{
     abstract int checkBalance(String accountNumber){
        // logic here
     }
     abstract boolean transferMoney(Account accountDetails, int amountToTransfer){
        // logic here
     }
   } 
   ```
   > As discussed abstract class ensures encapsulation and polymorphism .
