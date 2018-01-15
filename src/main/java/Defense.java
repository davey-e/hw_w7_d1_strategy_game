public abstract class Defense {

    private String type;
    private int healthValue;
    private int attackValue;

    public Defense(String type, int healthValue, int attackValue){
        this.type = type;
        this.healthValue = healthValue;
        this.attackValue = attackValue;
    }

    public String getType() {
        return this.type;
    }

    public int getHealthValue() {
        return this.healthValue;
    }

    public int getAttackValue() {
        return this.attackValue;
    }

    public void setHealthValue(int newHealthValue) {
        this.healthValue = newHealthValue;
    }
}
