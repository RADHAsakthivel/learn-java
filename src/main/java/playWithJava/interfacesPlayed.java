package playWithJava;

public interface interfacesPlayed {
    static final boolean water = true;
    void eat();

    default void reproduce(){
        System.out.println("All living this can able to reproduce");
    }

    static void sleep(){
        System.out.println("All living this can able to sleep");
    }

    //static final energy(){} you can't use static final method inside interface .

}
