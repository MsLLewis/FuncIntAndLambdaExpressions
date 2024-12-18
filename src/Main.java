import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Supplier;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Gymnastics gymnastics = new Gymnastics();
        gymnastics.displayPlayerIDs();


        /*
        // Step 1: Create a Supplier that supplies the value "Laptop"
        Supplier<String> prodSupp = () -> "Laptop";
        Supplier<String> prodSupp2 = () -> "Computer";
        Supplier<String> prodSupp3 = () -> "MacBook";

        // Step 2: Create an ArrayList to store the values
        List<String> productList = new ArrayList<>();
        productList.add(prodSupp.get());
        productList.add(prodSupp2.get());
        productList.add(prodSupp3.get());
*/

        // Step 3: Use the Supplier to add values to the ArrayList
//        for (int i = 0; i < 5; i++) { // Add 5 "Laptop" strings
//            productList.add(prodSupp.get());
//            productList.add(prodSupp2.get());
//        }

        // Step 4: Print the ArrayList
     //   System.out.println("Products in the list: " + productList);


      //  SupplierPredicateExample supplierPredicate = new SupplierPredicateExample();
      //  supplierPredicate.useSupplierAndPredicate();

        /*
        LambdaExpressions lambdaExpressions = new LambdaExpressions();
        lambdaExpressions.useBIConsumer();
        lambdaExpressions.useBIFunction();
        lambdaExpressions.useMultiStatementAndParams();

*/
/*

        LambdaExpressions lambdaExpressions = new LambdaExpressions();
        lambdaExpressions.useNoParam();
        lambdaExpressions.useNoParamNoParenthesis();
        lambdaExpressions.useOneParamNoBracketAndParenthesis();

*/
        /*
        CompareClass compareObj = new CompareClass();
        int resultInteger = compareObj.compareIntegers.compare(60, 55);
        System.out.println(resultInteger);


        String resultString = compareObj.compareStrings.compare("h", "H");
        System.out.println(resultString);
*/




/*
        Calculator c = new Calculator();

        //invoke  overriden the abstract  method
        int resultAbstractMethod = c.fObj.sum(5,5);
        System.out.println("Result Abstract method: " + resultAbstractMethod);


        //invoke default method, not required to override, simply use it
        int resultDefaultMethod = c.fObj.multiply(4, 5);
        System.out.println("Result Default method: " + resultDefaultMethod);

*/

        /*
        RegularClass regularClass = new RegularClass();
        regularClass.hObjone.say();
        regularClass.hObjTwo.say();

        regularClass.hObjone.sleep();
        regularClass.hObjTwo.sleep();

        //Act like the Math class  Math.PI;
        Human.communicate();
        */








    }
}