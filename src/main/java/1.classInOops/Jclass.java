package classInOops;

public class Jclass {
    //Atribut
    int age;
    String firstName;
    String lastName;

    //constructor
    public Jclass(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    //method
    public void fullName(){
        System.out.println(firstName + " " + lastName);
    }

    //method
    public void age(){
        System.out.println(age);
    }
}
