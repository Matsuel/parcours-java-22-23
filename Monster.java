public class Monster extends Character {
    
    public Monster(String name, int maxHealth, Weapon weapon) throws DeadCharacterException {
        super(name, maxHealth, weapon);
    }

    @Override
    public String toString() {
        if(this.getWeapon()!=null && this.getCurrentHealth()==0){
            return this.getName()+" is a monster and is dead. He has a weapon "+this.getWeapon().toString();
        }else if (this.getCurrentHealth()==0 && this.getWeapon()==null){
            return this.getName()+" is a monster and is dead";
        
        }else{
            return this.getName()+ " is a monster with "+this.getCurrentHealth()+" HP";
        }
    }
    
    @Override
    public void takeDamage(int n) throws DeadCharacterException{
        double damages_double= n*0.8;
        int damages=(int)damages_double;
        if (currentHealth-damages<=0){
            currentHealth=0;
        }else{
            currentHealth-=damages;
        }
    }

    @Override
    public void attack(Character ch) throws DeadCharacterException{
        if (this.getWeapon()==null){
            ch.takeDamage(6);
        }else{
            ch.takeDamage(this.getWeapon().getDamage());
        }
    }
}
