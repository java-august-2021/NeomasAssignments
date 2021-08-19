import java.util.ArrayList; 
public class BasicJava {
    // Print 1-255
    public void print255() {
        for(int i = 1; i<=255; i++) {
            System.out.println(i);
        }
    }

    //Print odds 1-255 
    public void printOdds255() {
        for(int i=1; i<= 255; i++) {
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    // Sum of 1-255
    public int sumTo255() {
        int mySum = 0;
        for(int i = 1; i <=255; i++) {
            mySum += i;
        }
        return mySum; 
    }

    // iterate through an array
    public void iterateArray(int[] myArray) {
        for(int i = 0; i<myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }

    // Find the maximum number in a given array
    public int findMax(int[] myArray) {
        int arrayMax = myArray[0];
        for(int i = 0; i < myArray.length; i++) {
            if(myArray[i] > arrayMax) {
                arrayMax = myArray[i];
            }
        }
        return arrayMax; 
    }

    // create an array with all odd numbers from 1-255
    public ArrayList<Integer> oddArray() {
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for(int i=1; i<=255; i++) {
            if(i%2 != 0) {
                myArray.add(i);
            }
        }
        return myArray;
    }

    // Get the average of the values in an array
    public float getAverage(int[] myArray) {
        float mySum = 0;
        for(int i = 1; i < myArray.length; i++) {
            mySum += myArray[i];
        }
        float arrayLength = (float) myArray.length;
        float myAverage = mySum/myArray.length;
        return myAverage; 
    }

    // return the number of values greater than y
    public int greaterThanY(int[] myArray, int y) {
        ArrayList<Integer> greaterThanArray = new ArrayList<Integer>();
        for(int i=0; i < myArray.length; i++){
            if(myArray[i] > y) {
                greaterThanArray.add(myArray[i]);
            }
        }
        return greaterThanArray.size();
    }

    //square each value in an array
    //there is a bug. the squares are not calculating correctly
    public int[] squareValues(int[] sampleArray) {
        for(int i = 0; i < sampleArray.length; i++) {
            int squareMe = sampleArray[i];
            if(squareMe < 0){
                sampleArray[i] = -(squareMe*squareMe);
            } else {
                sampleArray[i] = (squareMe*squareMe); 
            }
        }
        return sampleArray;
    }
}
