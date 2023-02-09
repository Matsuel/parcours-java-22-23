public class Templar extends Character implements Tank, Healer {
    private final int healCapacity;
    private final int shield;

    public Templar(String name, int maxHealth, int healCapacity, int shield, Weapon weapon){
        super(name,maxHealth,weapon);
        this.healCapacity=healCapacity;
        this.shield=shield;
    }

    @Override
    public int getHealCapacity(){
        return this.healCapacity;
    }

    @Override
    public void heal(Character ch){
        if (ch.getCurrentHealth()+this.healCapacity>ch.getMaxHealth()){
            ch.currentHealth=ch.getMaxHealth();
        }else{
            ch.currentHealth=this.healCapacity+ch.currentHealth;
        }
    }

    public int getShield(){
        return this.shield;
    }

    @Override
    public String toString(){
        if (this.getCurrentHealth()==0)return this.getName()+ " has been beaten, even with its "+this.getShield()+" shield. So bad, it could heal "+this.getHealCapacity()+ " HP.";
        if (this.weapon!=null){
            return "He has the weapon "+this.weapon.toString();
        }else{
            return this.getName()+" is a strong Templar with "+this.getCurrentHealth()+" HP. It can heal "+this.getHealCapacity()+" HP and has a shield of "+this.shield+".";
        }
    }


    public void takeDamage(int n){
        if (currentHealth-n<=0){
            currentHealth=0;
        }else{
            currentHealth-=n-this.shield;
        }
    }

    public void attack(Character ch){
        this.heal(this);
        if (this.weapon!=null){
            ch.takeDamage(this.weapon.getDamage());
        }else{
            ch.takeDamage(6);
        }
    }
}
