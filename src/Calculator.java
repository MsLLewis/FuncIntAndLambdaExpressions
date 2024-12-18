public class Calculator {

    FunctionalInterfaceDemo fObj = new FunctionalInterfaceDemo() {
        @Override
        public int sum(int a, int b) {
            return a + b;
        }
    };
}


