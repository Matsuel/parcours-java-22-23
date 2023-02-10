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

    // @Override
    // public String toString(){
    //     if (this.getCurrentHealth()==0)return this.getName()+ " has been beaten, even with its "+this.getShield()+" shield. So bad, it could heal "+this.getHealCapacity()+ " HP.";
    //     if (this.getWeapon()!=null){
    //         return "He has the weapon "+this.getWeapon().toString();
    //     }else{
    //         return this.getName()+" is a strong Templar with "+this.getCurrentHealth()+" HP. It can heal "+this.getHealCapacity()+" HP and has a shield of "+this.shield+".";
    //     }
    // }

    @Override
    public String toString() {
        if(this.getWeapon()!=null && this.getCurrentHealth()==0){
            return this.getName()+" is a strong Templar and is dead. He has a weapon "+this.getWeapon().toString();
        }else if (this.getCurrentHealth()==0 && this.getWeapon()==null){
            return this.getName()+" is a strong Templar and is dead";
        
        }else if (this.getWeapon()!=null && this.getCurrentHealth()!=0){
            return this.getName()+ " is a strong Templar with "+this.getCurrentHealth()+" HP. It can heal "+this.getHealCapacity()+" and has a shield of "+this.getShield()+". He has the weapon "+this.getWeapon().toString();
        } 
        else{
            return this.getName()+ " is a strong Templar with "+this.getCurrentHealth()+" HP";
        }
    }

    @Override
    public void takeDamage(int n){
        if (currentHealth-n<=0){
            currentHealth=0;
        }else{
            currentHealth-=n-this.shield;
        }
    }

    @Override
    public void attack(Character ch) throws DeadCharacterException{
        this.heal(this);
        if (this.getWeapon()!=null){
            ch.takeDamage(this.getWeapon().getDamage());
        }else{
            ch.takeDamage(6);
        }
    }
}
