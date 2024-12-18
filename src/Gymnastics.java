import java.io.IOException;
import java.util.ArrayList;

public class Gymnastics implements Sport{

    //Declaring the varialbe/field as a int array
    public int[] playerIDs;

    //Constructor
    public Gymnastics(){
        //Set the int array to 11 element  - size
        playerIDs = new int[11];  //Array of size to 11
        for(int i = 0; i < playerIDs.length; i++){
            playerIDs[i] = i + 1 ;   //Assign unique IDs (1 to 11)
            System.out.println("Player ID: " + playerIDs[i]);
        }
        System.out.println("A new Gymnastics Team has been formed.");
    }


    public void displayPlayerIDs(){
        //Convert playerIDs array to an ArrayList
        ArrayList<Integer> playerList = new ArrayList<>();
        for(int id : playerIDs){
        }

        //Use forEach() to iterate and display IDs
        System.out.println("\nIterating through the Player IDs using the forEach() method: ");
        playerList.forEach(id -> System.out.println("Player ID: " + id));
    }
    @Override
    public void calculateAvgAge(int[] age) {

    }

    @Override
    public void retirePlayer(int id) {

    }
}
