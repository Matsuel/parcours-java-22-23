public class Monster extends Character {
    
    public Monster(String name, int maxHealth) {
        super(name, maxHealth);
    }

    public String toString() {
        if (this.getCurrentHealth()==0)return this.getName()+" is a monster and is dead";
        return this.getName()+ " is a monster with "+this.getCurrentHealth()+" HP";
    }
    
    public void takeDamage(int n){
        double damages_double= n*0.8;
        int damages=(int)damages_double;
        if (currentHealth-damages<=0){
            currentHealth=0;
        }else{
            currentHealth-=damages;
        }
    }

    public void attack(Character ch){
        ch.takeDamage(7);
    }
}
