
public class Mammal {
    // attributes
    public int energyLevel=100;
    public int health=50;

    // constructor overloading
    public Mammal(int energyLevel, int health) {
        this.energyLevel = energyLevel;
        this.health = health;
    }

    // methods
    public int displayEnergy() {
        System.out.println(String.format("Energy level is %s.", energyLevel));
        return this.energyLevel;
    }

    
}
