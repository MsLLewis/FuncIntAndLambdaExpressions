import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class LambdaExpressions {

    /**
     * () -> {} // No parameters, with curly parentheses, expression body, void result
     */
    public void useNoParam(){
        Human HMsg = () -> {
            System.out.println("No params with curly braces");
        };
        HMsg.say();
    }

    /**
     * () -> statement/expression  //No parameters, without parentheses,expression body, void result
     */

    public void useNoParamNoParenthesis(){
        Human HMsg = () -> System.out.println("No params and without curly braces");
        HMsg.say();
    }

    /**
     * using: n → System.out.print(n)  // One parameter, without round bracket and curly parentheses
     */
     public void useOneParamNoBracketAndParenthesis(){
         HumanTwo HM2msg = st -> System.out.println(st + "One parameter, without round bracket and curly parentheses");
         HM2msg.say("Hello | ");
     }

     /*
        Using pre-built Functional Interfaces with multiple params Lambda Expressions
       Use Supplier when you need to provide values on demand.
       Use Predicate when you need to test conditions and make decisions.
       Use Consumer when you need to process data without returning anything.
       Use Bi- versions when the task involves two inputs.
      */

    //BIConsumer Used for lambdas that take two inputs but do not return anything.
    //Example: Printing the sum of two numbers.
    // Multiple parameters, no return statement: Single-line lambda
    public void useBIConsumer() {
        BiConsumer<Integer, Integer> printSum = (p, x) -> System.out.println("Sum is: " + (p + x));
        printSum.accept(10, 20);

        // Multiple parameters, no return statement: Lambda with curly braces
        BiConsumer<Integer, Integer> printSumWithBraces = (p,x) -> {
            System.out.println("Sum with braces is: " + (p + x));
        };
        printSumWithBraces.accept(15, 25);
    }

   // BIFunction Used for lambdas that take two inputs and return a value.
   // Example: Calculating and returning the sum of two numbers.
    // Multiple parameters with return statement: Explicit return
    public void useBIFunction(){
        // Multiple parameters with return statement: Explicit return
        BiFunction<Integer, Integer,Integer> sumWithReturn = (p, x) -> {
            return p + x;
        };
        System.out.println("Sum with return:  " + sumWithReturn.apply(30, 40));

        // Multiple parameters without return statement: Simplified without return keyword
        BiFunction<Integer,Integer,Integer> simpleSum = (p,x) -> p + x;
        System.out.println("Simple Sum: " + simpleSum.apply(50, 60) );

    }

    public void useMultiStatementAndParams(){
        BiFunction<Integer,Integer,Integer> detailedSum = (p, x) -> {
            System.out.println("Processing first parameter: " + p);
            System.out.println("Processing second parameter: " + x);
            return  p + x;
        };
        System.out.println("Detailed sum: " + detailedSum.apply(70, 80));
    }



    /*

     */




}
