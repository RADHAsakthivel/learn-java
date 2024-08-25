# Encapsulation
> In **general** Encapsulation is something container contain more than 
  one element's inside .

![Encapsulation](https://www.scientecheasy.com/wp-content/uploads/2018/06/encapsulation-in-java.png)

```java
public class Student{
    String firstName; // ----> attribute ( or ) data member 
    String lastName;  // ----> attribute ( or ) data member 
    String studentId; // ----> attribute ( or ) data member 
    int age;          // ----> attribute ( or ) data member 
    ExamResult examResult; // ----> attribute ( or ) data member 
    
    //constructor
    Student(ExamResult _examResult){
        this.examResult = _examResult;
    }
    
    //Method ( or ) behaviour
    public ExamResult getResult(){
        return this.examResult.getResult(this.studentId);
    }
}
```

>In the above class attributes and method encapsulated inside the class.

## Importance of Encapsulation
- We are combining the data, and it's manipulation in one place. 
- It allows the state of object to be accessed and modified through behaviour.
- It reduces the coupling of modules and increases the cohesion inside them.
 ### Coupling of modules
 ```java
 class Database {
     public void connect() {
         System.out.println("Connecting to the database...");
     }
 
     public String query(String sql) {
         System.out.println("Executing query: " + sql);
         return "result";
     }
 }
 
 class UserService {
     private Database database = new Database();  // Tight coupling
 
     public String getUser(int userId) {
         database.connect();
         return database.query("SELECT * FROM users WHERE id = " + userId);
     }
 }
 ```
> High cohesion means that a class is focused on a single task or a group of related tasks, 
  which makes the code easier to maintain, understand, and extend.