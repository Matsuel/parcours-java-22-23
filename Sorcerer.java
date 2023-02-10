public class Sorcerer extends Character implements Healer {
    private final int healCapacity;

    public Sorcerer(String name, int maxHealth, int healCapacity, Weapon weapon)  {
        super(name, maxHealth, weapon);
        this.healCapacity = healCapacity;
    }

    public int getHealCapacity() {
        return this.healCapacity;
    }

    public void heal(Character character) throws DeadCharacterException{
        if (character.getCurrentHealth() == 0) {
            character.currentHealth = character.getMaxHealth();
        } else {
            character.currentHealth += this.healCapacity;
            if (character.currentHealth > character.getMaxHealth()) {
                character.currentHealth = character.getMaxHealth();
            }
        }
    }

    // @Override 
    // public String toString(){
    //     if (this.getCurrentHealth()==0)return this.getName()+" is a dead sorcerer. So bad, it could heal "+this.getHealCapacity()+" HP.";
    //     if (this.getWeapon()!=null){
    //         return "He has the weapon "+this.getWeapon().toString();
    //     }else{
    //         return this.getName()+" is a sorcerer with "+this.getCurrentHealth()+" HP. It can heal "+this.getHealCapacity()+" HP.";
    //     }
    // }

    @Override
    public String toString() {
        if(this.getWeapon()!=null && this.getCurrentHealth()==0){
            return this.getName()+" is a sorcerer and is dead. He has a weapon "+this.getWeapon().toString();
        }else if (this.getCurrentHealth()==0 && this.getWeapon()==null){
            return this.getName()+" is a sorcerer and is dead";
        
        }else if (this.getWeapon()!=null && this.getCurrentHealth()!=0){
            return this.getName()+ " is a sorcerer with "+this.getCurrentHealth()+" HP. It can heal "+this.getHealCapacity()+" HP. He has the weapon "+this.getWeapon().toString();
        } 
        else{
            return this.getName()+ " is a sorcerer with "+this.getCurrentHealth()+" HP";
        }
    }

    @Override
    public void takeDamage(int n) throws DeadCharacterException{
        if(this.getCurrentHealth()==0)throw new DeadCharacterException(this);
        if (currentHealth-n<=0){
            currentHealth=0;
            if(this.currentHealth==0)throw new DeadCharacterException(this);
        }else{
            currentHealth-=n;
            if(this.currentHealth==0)throw new DeadCharacterException(this);
        }
    }

    // @Override
    // public void takeDamage(int n) throws DeadCharacterException{
    //     double damages_double= n*0.8;
    //     int damages=(int)damages_double;
    //     if (this.getCurrentHealth()==getMaxHealth()){
    //         if (currentHealth-damages<=0){
    //             currentHealth=0;
    //         }else{
    //             currentHealth-=damages;
    //         }
    //     }if (currentHealth-damages<=0){
    //         currentHealth=0;
    //     }else{
    //         currentHealth-=damages;
    //     }
    //     if (this.getCurrentHealth()==0)throw new DeadCharacterException(this);
        
    // }

    @Override
    public void attack(Character ch) throws DeadCharacterException{
        if(this.getCurrentHealth()==0)throw new DeadCharacterException(this);
        this.heal(this);
        if (this.getWeapon()!=null){
            ch.takeDamage(this.getWeapon().getDamage());
        }else{
            ch.takeDamage(10);
        }
    }
}
