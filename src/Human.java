@FunctionalInterface
public interface Human {

    void say();



    default void sleep(){
        System.out.println("This is the default method. ");
    }

    static void communicate(){
        System.out.println("This is the static method. ");
    }

}
