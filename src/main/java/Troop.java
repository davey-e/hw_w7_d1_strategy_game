public abstract class Troop {

    private String name;
    private int healthValue;
    private int attackValue;

    public Troop(String name, int healthValue, int attackValue){
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getName() {
        return this.name;
    }

    public int getHealthValue() {
        return this.healthValue;
    }

    public void setHealthValue(int newHealthValue) {
        this.healthValue = newHealthValue;
    }

    public int getAttackValue() {
        return this.attackValue;
    }

    public String shout(String battleCry){
        return battleCry;
    }

}
