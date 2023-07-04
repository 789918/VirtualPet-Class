public class VirtualPet {

     private String name;
    private int hunger;
    private int thirst;
    private int boredom;

    public VirtualPet(String name) {
        this.name = name;
        this.hunger = 50;
        this.thirst = 50;
        this.boredom = 50;
    }

    public String getName() {
        return name;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getBoredom() {
        return boredom;
    }

    public void feed() {
        hunger -= 20;
        thirst += 10;
        boredom += 10;
    }

    public void water() {
        hunger += 10;
        thirst -= 20;
        boredom += 10;
    }

    public void play() {
        hunger += 10;
        thirst += 10;
        boredom -= 20;
    }

    public void tick() {
        hunger += 5;
        thirst += 5;
        boredom += 5;
    }
}
    

