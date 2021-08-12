public class FizzBuzzTest {
    public static void main(String[] args) {
        FizzBuzz tester = new FizzBuzz();

        // FizzBuzz test
        System.out.println(tester.fizzBuzz(9));
        System.out.println(tester.fizzBuzz(10));
        System.out.println(tester.fizzBuzz(15));
        System.out.println(tester.fizzBuzz(16));
        System.out.println(tester.fizzBuzz(2));

        for (int i = 1; i <=50; i++) {
            System.out.println(tester.fizzBuzz(i));
        }

        // FizzBuzz overhaul method test
        System.out.println(tester.fizzBuzz(9, "3mult", "5mult", "15mult"));
        System.out.println(tester.fizzBuzz(10, "3mult", "5mult", "15mult"));
        System.out.println(tester.fizzBuzz(15, "3mult", "5mult", "15mult"));
        System.out.println(tester.fizzBuzz(16, "3mult", "5mult", "15mult"));
        System.out.println(tester.fizzBuzz(2, "3mult", "5mult", "15mult"));
    }
}
