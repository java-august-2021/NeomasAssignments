public class Bat {

    //attributes
    private int humanSnacksEaten=0;
    private int townsAttacked=0;
    private int energyLevel=300;

    //create bat instance
    public Bat(){
    }

    public void fly(){
        System.out.println("chrip click click SCREECH");
        energyLevel-=50;
    }

    public void eatHumans(int num){
        System.out.println("At first silence, and then screaming.");System.out.println("silence resumes");
        energyLevel +=25;
        humanSnacksEaten+=num;
    }

    public void attackTown(){
        townsAttacked+=1;
        energyLevel-=100;
        if(townsAttacked==1){
            System.out.println("It's a bird! It's a plane! It's ... a flesh-eating, fire-breating vampire bat??????? (town on fire)");
        } else {
            System.out.println(String.format("Unfortuately town number %s was not warned about the fire-breating vampire bat due to the previous town burning down. Alas. (town %s on fire)", townsAttacked, townsAttacked));
        }
    }
}
