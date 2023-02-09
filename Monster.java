public class Monster extends Character {
    
    public Monster(String name, int maxHealth) {
        super(name, maxHealth);
    }

    public String toString() {
        if (this.getCurrentHealth()==0)return this.getName()+" is a monster and is dead";
        return this.getName()+ " is a monster with "+this.getCurrentHealth()+" HP";
    }
    
}