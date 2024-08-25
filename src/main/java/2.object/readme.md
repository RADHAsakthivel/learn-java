# Object in JAVA
- Object's are instance of a class .
- It is created at runtime and occupies memory.
- Each object have different value but share same structure as class.

## Create Object
- We can create Object by using new key word.

### Example
```
    Refer classInOops for class reference
    
    Jclass objectOne = new Jclass(
                        "sakthivel",
                        "rahakrishnan",
                        29
                    );
                    
    Jclass objectTwo = new Jclass(
                    "sakthivel",
                    "rahakrishnan",
                    29
                );
```

- In above code we are creating instance class which is called object with _new_ keyword.
- You can notice ObjectOne and ObjectTwo are instance from same class but with diff value.

## new Keyword

- _new_  is a reserved word in java.
- This word used before class while creating an instance.
- Technically _new_ will create object and assign that to some memory.
- The assigned memory address will save in ```LHS``` variable.