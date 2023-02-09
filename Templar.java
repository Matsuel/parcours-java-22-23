public class Templar extends Character implements Tank, Healer {
    private final int healCapacity;
    private final int shield;

    Templar(String name, int maxHealth, int healCapacity, int shield){
        super(name,maxHealth);
        this.healCapacity=healCapacity;
        this.shield=shield;
    }

    @Override
    public int getHealCapacity(){
        return this.healCapacity;
    }

    @Override
    public void heal(Character ch){
        ch.currentHealth+= this.healCapacity;
    }

    public int getShield(){
        return this.shield;
    }

    @Override
    public String toString(){
        if (this.getCurrentHealth()==0)return this.getName()+ "has been beaten, even with its "+this.getShield()+" shield. So bad, it could heal "+this.getHealCapacity()+ " HP.";
        return this.getName()+" is a strong Templar with "+this.getCurrentHealth()+" HP. It can heal "+this.getHealCapacity()+" HP and has a shield of "+this.shield+".";
    }
}