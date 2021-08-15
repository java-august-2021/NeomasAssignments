
public class Mammal {
    // attributes
    public int energyLevel=100;
    
    // new mammal instance
    public Mammal() {
    }

    // new mammal instance engery level override
    public Mammal(int energyLevel) {
        this.energyLevel = energyLevel;
    }

    public int displayEnergy() {
        System.out.println(String.format("Energy level is %s.", energyLevel));
        return this.energyLevel;
    }


}
