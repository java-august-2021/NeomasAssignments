public class AlfredTest {
    public static void main(String[] args){
        AlfredQuotes alfredBot = new AlfredQuotes();

        // test strings
        String testGreeting = alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting("Junior Nielson", "Good morning");
        String testDateAnnouncement = alfredBot.dateAnnouncement();
        String testSnark1 = alfredBot.respondBeforeAlexis("Alfred is the best.");
        String testSnark2 = alfredBot.respondBeforeAlexis("Alexis, what is the date today?");
        String testSnark3 = alfredBot.respondBeforeAlexis("What should I wear tomorrow?");
        String testFashion1 = alfredBot.checkMyFashion("blue", "blue");
        String testFashion2 = alfredBot.checkMyFashion("gray", "green");
    }
}