# Class in JAVA

## Definition
- classes are blueprint of entity.
- we can create n number of object using class.

## Components of class
- There are three components in java and **two** are most important.
- ```atributs, behaviours/methods, constructor```

## Attributes in class
- Are variable which hold some value with explicit types.
    ### Example
    ```
    class User(){
        String firstName;  ---> Attributes
        String secondName;  ---> Attributes
        int age;      ---> Attributes
    }
  ```

## Methods/Behaviours in class
- Are variable which hold some value with explicit types.
  ### Example
    ```
    class User(){
        String firstName;  ---> Attributes
        String secondName;  ---> Attributes
        int age;      ---> Attributes
  
        public void fullName(){
            System.Out.PrintLn(
                this.firstName + 
                " " + 
                this.secondName
            )
        }
    }
  ```