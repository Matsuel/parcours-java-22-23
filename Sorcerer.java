public class Sorcerer extends Character implements Healer {
    private int healCapacity;

    public Sorcerer(String name, int maxHealth, int healCapacity) {
        super(name, maxHealth);
        this.healCapacity = healCapacity;
    }

    public int getHealCapacity() {
        return this.healCapacity;
    }

    public void heal(Character character) {
        if (character.getCurrentHealth() == 0) {
            character.currentHealth = character.getMaxHealth();
        } else {
            character.currentHealth += this.healCapacity;
            if (character.currentHealth > character.getMaxHealth()) {
                character.currentHealth = character.getMaxHealth();
            }
        }
    }

    @Override 
    public String toString(){
        if (this.getCurrentHealth()==0)return this.getName()+" is a dead sorcerer. So bad, it could be heal "+this.getHealCapacity()+" HP.";
        return this.getName()+" is a sorcerer with "+this.getCurrentHealth()+" HP. It can heal "+this.getHealCapacity()+" HP.";
    }
}
