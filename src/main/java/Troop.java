public abstract class Troop {

    private String name;
    private int healthValue;
    private int attackValue;
    private int speed;

    public Troop(String name, int healthValue, int attackValue, int speed){
        this.name = name;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
        this.speed = speed;
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

    public int getSpeed() {
        return this.speed;
    }

    public String shout(String battleCry){
        return battleCry;
    }

    public void attack(Defense defense){
        defense.setHealthValue(defense.getHealthValue() - this.attackValue);
    }

}
