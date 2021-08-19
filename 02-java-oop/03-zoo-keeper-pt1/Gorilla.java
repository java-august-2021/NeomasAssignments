public class Gorilla extends Mammal {
    // attributes
    private int bananasEaten=0;

    public Gorilla(int energyLevel){
        super(energyLevel);
    }

    // methods
    public void throwSomething(){
        System.out.println("Oh no! The gorilla threw something!");
        this.energyLevel-=5;
    }
    
    public void eatBananas(int numOfBananas){
        System.out.println("Yum! The gorilla LOVES bananas");
        this.bananasEaten+=numOfBananas;
        this.energyLevel+=10;
    }

    public void climb(){
        System.out.println("Wowsers! The gorilla just climbed a tree!");
        this.energyLevel-=10;
    }
}
