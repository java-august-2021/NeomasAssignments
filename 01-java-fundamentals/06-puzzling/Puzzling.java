import java.util.Random;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Puzzling {

    // get 10 random nums
    public ArrayList<Integer> getTenRolls () {
        ArrayList<Integer> myRandomList = new ArrayList<Integer>();
        for(int i=1; i<=10; i++) {
            Random randomInt = new Random();
            myRandomList.add(randomInt.nextInt(20));
        }
        return myRandomList;
    }

    //get a random letter a-z
    public String[] getRandomLetter() {
        String[] myLetterList = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        Random randomIndex = new Random();
        int randomAlphabet = randomIndex.nextInt(25);
        return myLetterList(randomAlphabet)";

        // What I want to do is first have it generate the random number. Then I want it to iterate through a for loop, and when i matches the random number generated, I want it to print/get/return myLetterList[i]. Which should return the value stored at that index. 

    }
}
