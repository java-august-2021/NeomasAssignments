public class BasicJavaTest {
    public static void main(String[] args) {

        BasicJava tester = new BasicJava();
        
        // methods tests
        //tester.print255();
        //tester.printOdds255();
        //System.out.println(tester.sumTo255());

        int[] testArray1 = {2, 6, 10, 9};
        int[] testArray2 = {-2, -6, -10, -9};
        int[] testArray3 = {-10, 0, 8, 15, -1};
        //tester.iterateArray(testArray);
        //System.out.println(tester.findMax(testArray1));
        //System.out.println(tester.findMax(testArray2));
        //System.out.println(tester.findMax(testArray3));

        //System.out.println(tester.oddArray());
        //System.out.println(tester.getAverage(testArray1));
        //System.out.println(tester.getAverage(testArray2));
        //System.out.println(tester.getAverage(testArray3));

        //System.out.println(tester.greaterThanY(testArray1, 11));
        for(int i=0; i < tester.squareValues(testArray3).length; i++) {
            System.out.println(testArray3[i]);
        }
    }
}
