import java.util.Date;

public class AlfredQuotes {
    // generic greeting
    public String basicGreeting() {
        System.out.println("Hello, lovely to see you. How are you?");
        return "Hello, lovely to see you. How are you?";
    }

    // greet guests by name and time of day
    public String guestGreeting(String name, String dayPeriod) {
        String myGuestGreeting = String.format("%s, %s. Lovely to see you.", dayPeriod, name);
        System.out.println(myGuestGreeting);
        return myGuestGreeting;
    }

    // announces the date
    public String dateAnnouncement() {
        Date todaysDate = new Date();
        System.out.println(String.format("Today is %s", todaysDate));
        return "placeholder";
    }

    // disses "Alexis"
    public String respondBeforeAlexis(String conversation) {
        String myString = conversation;
        int enemyRobot = conversation.indexOf("Alexis");
        int goodRobot = conversation.indexOf("Alfred");
        if(enemyRobot != -1) {
            System.out.println("Right away coding genius! She certainly isn't sophisticated enough for that.");
            return "Right away coding genius! She certainly isn't sophisticated enough for that.";
        } else if (goodRobot != -1) {
            System.out.println("At your service. As you wish, naturally.");
            return "At your service. As you wish, naturally.";
        } else {
            System.out.println("Right. And with that I shall retire.");
            return "Right. And with that I shall retire.";
        }
    }

    // do these clothes match
    public String checkMyFashion(String tieColor, String shirtColor) {
        if(tieColor.equals(shirtColor)) {
            System.out.println("Why yes! These match nicely.");
            return "Why yes! These match nicely.";
        } else {
            System.out.println("Um... I would try something else.");
            return "Um... I would try something else.";
        }
    }
}