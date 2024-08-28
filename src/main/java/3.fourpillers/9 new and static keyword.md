# new KeyWord
- new key word not only belongs to java most of the oops language use new keyword
- we all know new is used to create a new instance of class
- But What happen when you use new keyword to create instance of class

## new KeyWord working principle
- When java see new key word it will allocate the memory in stack and heap
- LHS (left hand side from = sign) will point memory address allocated in stack
- RHS (right hand side from = sign) will point memory address allocated in heap
![memory allocation](https://i.ytimg.com/vi/KzZxR6VqcxQ/hq720.jpg)

> Same thing happen when you create a variable

![variable memory address](https://scaler.com/topics/images/example-of-string-pool-in-java.webp)

- Right now Don't care about string pool

# Static keyword
- Static keyword is one of the crucial concept in java
- Normal attribute in class that contain type is belongs to class but a variable having `static` keyword belongs to class (global) not instance.
- Don't get confused right.

## Properties of static keyword
- Class level scope
- Shared by all instance
- Can accessible without initiating class
- Early binding
- NO polymorphism (Static method are not overridden by subclass)
## Class level scope
> ***Example***<br>
> 1. You are designing the company recurring system for on campus<br>
> 2. You are providing 100 of in same collage<br>
> 3. For every student creating collage attribute for each instance is not viable solution <br>
> 4. Here you want some global variable here the static keyword comes<br>
> 5. When you define attribute as static it won't take space for every instance instead you can mention value that will available all instance with same value<br>
> 6. You can also change the value of static field but changed value is available for all instance of class.

```java
class Student{
    static string collage = "Anna university"; 
//    Student(){}
}
class Test{
    public static void main(String[] args){
        Student one = new Student();  // collage will be "Anna university";
        Student two = new Student();  // collage will be "Anna university";
        Student.collage = "Delhi university";
        Student three = new Student();  // collage will be "Delhi university";
        Student four = new Student();  // collage will be "Delhi university";
    }
}
```

## Static method binding
- In java method are bound in two ways
  1. Early Binding
  2. Late Binding

## Early Binding
- As we know static method are non-overridable so java bind the method with class in compile time.
- This is the reason we are able to access without initiating the class.
- This also a reason polymorphism not doable in early binding

## Late Binding
- It's a normally used binding, 
- In java this binding used for bind the non-static method
- JDK will bind the method to class during runtime
- This makes polymorphism possible