public class StringPractice {
    public static void main(String[] args) {
        String ninja = "Coding Dojo is Awesome!";
        int length = ninja.length();
        System.out.println( "String Length is: " + length);
        String string1 = "My name is ";
        String string2 = "Michael";
        String string3 = string1.concat(string2);
        System.out.println(string3);
        String string4 = "Welcome," + " ninja" + "!";
        System.out.println(string4);
        String ninja2 = String.format("Hi %s, you owe me $%.2f !", "Jack", 25.0);
        System.out.println(ninja2);
        String ninja3 = "Welcome to Coding Dojo!";
        int a = ninja3.indexOf("Coding");
        int b = ninja3.indexOf("co");
        int c = ninja3.indexOf("pizza");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        String sentence = "     spaces everywhere!   ";
        System.out.println(sentence.trim());
        String test1 = "HELLO";
        String test2 = "world";
        System.out.println(test1.toLowerCase());
        System.out.println(test2.toUpperCase());
        String test3 = new String("word");
        String test4 = new String("word");
        System.out.println(test3 == test4); // is this false because new creates a new instantce and they are not the same instance? This would be a good way to check that the data you want to retrieve is what you are getting...
        System.out.println(test3.equals(test4)); //When would you use .equals vs ==
    }
}
