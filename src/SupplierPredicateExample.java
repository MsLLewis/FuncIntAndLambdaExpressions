import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * A Supplier generates or supplies a default product name.
 * A Predicate checks if the stock quantity is sufficient (greater than a certain number).
 */
public class SupplierPredicateExample {

    public void useSupplierAndPredicate(){
        // Supplier: Provides a default product name
        //Supplier<String> provides a product name "Laptop".
        Supplier<String> productSupplier = () -> "Laptop";


        // Predicate: Tests if stock quantity is greater than 10
        //Predicate<Integer> checks whether the stockQuantity is greater than 10.
        Predicate<Integer> isStockSufficient = (quantity) -> quantity > 10;

        //The get() method of Supplier to retrieve the product
        //How to use Supplier and Predicate
        String product = productSupplier.get();  //Get the product name
        int stockQuantity =  7;   //Example stock quantity

        //Check stock availability using Predicate
        System.out.println("Product: " + product);
        System.out.println("Stock Quantity: " + stockQuantity);

        if(isStockSufficient.test(stockQuantity)){
            System.out.println("Stock is sufficient for " + product);
        }else {
            System.out.println("Stock is insufficient for " + product);
        }
    }
}
