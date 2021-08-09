public class ImportDemoTest { //is the purpose of this class to host/run all the other classes? Like each class has its own java file but then we call new instances of something using the main method??? Function please!
    public static void main(String[] args) {
        ImportDemo iD = new ImportDemo(); //the class ImportDemo is now a "variable type you can declate to call a new instance??????"
        String currentDate = iD.getCurrentDate();
        System.out.println(currentDate);
    }
}
