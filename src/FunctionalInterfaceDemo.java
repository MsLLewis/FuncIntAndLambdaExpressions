@FunctionalInterface
public interface FunctionalInterfaceDemo {

    int sum(int a, int b);

    default int multiply(int a, int b){
        return a * b;
    }
}