public class Rifleman extends Troop implements IMove{

    public Rifleman(String name, int healthValue, int attackValue, int speed){
        super(name, healthValue, attackValue, speed);
    }

    public String move(){
        return "I am moving at speed " + this.getSpeed() + ". Not bad!";
    }
}
