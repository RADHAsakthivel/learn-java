# Access modifier
- Access modifier are some sort look like shared and exclusive lock in filesystem.
- You can decide class, attributes, methods, upto which level it should be available or visible.

## Types of Access modifier
- Public
- Private
- Protected
- Default

## Public
- In interface method are not mentioned any Access modifier it will consider as public.
- Public make member to be available to all class in project or all package in project.
```java
    class Animal{
        string[] data;
        Animal(){
            this.string = new List<String>();
        }
        
        public walk(){
            System.out.println("all animal can able to walk");
        }
    }
```

## Private
- Private in Java makes a member (method or field) accessible only within the same class. This means that other classes, even those in the same package, cannot directly access private members.
- In below code `privateMethod` only available only inside the class
- public Method visible for all the package in project.
```java
public class MyClass {
    private int privateField = 10;

    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    public void publicMethod() {
        // Accessing private members within the same class
        System.out.println(privateField);
        privateMethod();
    }
}
```

## Protected
- Makes member to be visible in subclass and same package.
- Not visible for second level subclass ( this scenario in multi level inheritance )

```java
class PackageOne{
    PackageOne(){
        
    }
    
    protected string protectedMethod(){
        System.out.println("protected");
        return "protected";
    }
}

class PackageOneDiffClass extends  PackageOne{
    String protectedString;
    PackageOneDiffClass() {
        this.protectedString = protectedMethod();
    }    
}

class PackageTwo extends  PackageOne{
    String protectedString;
    PackageOneDiffClass() {
        this.protectedString = protectedMethod();
    }
}

class PackageTwoDiff extends  PackageTwo{
    String protectedString;
    PackageOneDiffClass() {
        // compiler error because protectedMethod not method of superclass
        // it's belongs to grand Super class
        this.protectedString = protectedMethod();
    }
}
```

## Default
- Default make sure member only visible in same package
- Not even visible for subclass from diff package

```java
class PackageOne{
    PackageOne(){
        
    }
    // if we don't mention any access modifier in class it will consider as default
    string protectedMethod(){
        System.out.println("protected");
        return "protected";
    }
}

class PackageOneDiffClass extends  PackageOne{
    String protectedString;
    PackageOneDiffClass() {
        this.protectedString = protectedMethod();
    }    
}

class PackageTwo extends  PackageOne{
    String protectedString;
    // compiler error because protectedMethod has default modifier
    // So protectedMethod is only available in same package
    // current class belongs to diff package 
    PackageOneDiffClass() {
        this.protectedString = protectedMethod();
    }
}

class PackageTwoDiff extends  PackageTwo{
    String protectedString;
    PackageOneDiffClass() {
        // compiler error because protectedMethod not method of superclass
        // it's belongs to grand Super class
        this.protectedString = protectedMethod();
    }
}
```


|           | same class | same package | same package non-child | other package | other package non-child |
|-----------|------------|--------------|------------------------|---------------|-------------------------|
| Public    | ✅          | ✅            | ✅                      | ✅             | ✅                       |
| Protected | ✅          | ✅            | ✅                      | ✅             | ❌                       |
| Default   | ✅          | ✅            | ✅                      | ❌             | ❌                       |
| Private   | ✅          | ❌            | ❌                      | ❌             | ❌                       |