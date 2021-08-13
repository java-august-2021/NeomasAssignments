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
    public char getRandomLetter() {
        char[] alphabet = new char[26];
        int i=0;
        Random alphaIndex = new Random();
        int myRandomNum = alphaIndex.nextInt(25);

        for(char letter = 'a'; letter <= 'z'; ++letter){
            alphabet[i] = letter;
            i += 1;
        }

        return alphabet[myRandomNum];
    }

    // get a random int method to use inside the random letter method
    public String generatePassword() {
        String newPassword = "";
        for(int i = 1; i <= 8; i++) {
            char nextLetter = getRandomLetter();
            newPassword += nextLetter;
        }
        return newPassword;
    }

    public ArrayList getNewPasswordSet(int num) {
        ArrayList<String> myPasswordSet = new ArrayList<String>();
        for(int i = 1; i <= num; i++) {
            myPasswordSet.add(generatePassword());
        }
        return myPasswordSet;
    }
}
