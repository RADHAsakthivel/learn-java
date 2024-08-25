# Single Inheritance

> Single inheritance will one superclass and one subclass <br>
> In real world mostly all entity have capability to derive multiple inheritance.

> ⚠️ Multiple level and Multiple inheritance are different

![single inheritance image](https://ik.imagekit.io/upgrad1/abroad-images/imageCompo/images/3ORR5LC.jpg)

```java
class Father{
    String name;
    int age;
    
    Property getAllProperty(){
        //code
    }

    Property getBankBalance(){
        //code
    }
}

class Daughter extends father{
    String name;
    int age;
    String fatherName = super.name;
}

public class shadow{
    Daughter person = new Daughter();
    
    void property(){
        person.getAllProperty(); // call getAllProperty method in Father class
    }
    
    //if you want to access Father name and age you can use super keyword in inheriting class
    void getFatherName(){
        System.out.println(person.fatherName);
    }
}
```