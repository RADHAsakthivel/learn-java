# Constructor in java
- Constructor are special method in class
- Constructor are called while class is initiated or created by new keyword
- It's used to assign default to attributes and perform any necessary setup for the object.

## Feature of Constructor
- Name of Constructor in java same as class name
- There id return type for constructor and not return statement
- Constructor are invoked when the class created using new key word
- Constructor can be overloaded
- Constructor can have access modifier ( By default it will have default access modifier)

## Types of Constructor
- Default constructor
- Parameterized constructor
- No args constructor

### Default Constructor
- When class doesn't have any constructor java will provide the default constructor
```java
class Student{
    string name;
    int age;
}
```
- You can see the above class not have any constructor
- But still you can create object that's because of default constructor
- Default constructor will initialize or assign value for the attribute in class

```java
class Test{
    Test(){}
    public static void Main(){
        Student userOne = new Student();
        /*
         * since i not passing any value still you will get default value for attribute 
         * userOne.name = "";
         * UserOne.age = 0;
         * So this 0 and "" are default similarly value for all types either null or default value will available
         */
    }
}
```

### Parameterized Constructor
- It's nothing but constructor with arguments
```java
class Student{
    string name;
    int age;
    Student(String _name, int _age){
        this.name = _name;
        this.age = _age;
    }
}
```
>Parameterized constructor are used to set you own value to attributes

```java
class Test{
    Test(){}
    public static void Main(){
        Student userOne = new Student("Ramesh",29);
        /* 
         * userOne.name = "Ramesh";
         * UserOne.age = 29;
         * So You are passing the value while creating object that can assigned to attributes
         */
    }
}
```

### No args Constructor
- it's similar to argument with taking no arguments

```java
class Student{
    string name;
    int age;
    Database db;
    Student(){
        this.db = new Databse();
    }
}
```
> NO args constructed to used initialize or assign some object. 

```java
class Test{
    Test(){}
    public static void Main(){
        Student userOne = new Student();
        userOne.CreateItem();
    }
}
```