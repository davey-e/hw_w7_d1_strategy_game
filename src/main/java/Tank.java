public class Tank extends Troop implements IMove{

    public Tank(String name, int healthValue, int attackValue, int speed){
        super(name, healthValue, attackValue, speed);
    }

    public String move(){
        return "I am moving at speed " + this.getSpeed() + ". A bit slow!";
    }

}
