public class Sorcerer extends Character implements Healer {
    private final int healCapacity;

    public Sorcerer(String name, int maxHealth, int healCapacity, Weapon weapon) {
        super(name, maxHealth, weapon);
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
        if (this.getCurrentHealth()==0)return this.getName()+" is a dead sorcerer. So bad, it could heal "+this.getHealCapacity()+" HP.";
        if (this.getWeapon()!=null){
            return "He has the weapon "+this.getWeapon().toString();
        }else{
            return this.getName()+" is a sorcerer with "+this.getCurrentHealth()+" HP. It can heal "+this.getHealCapacity()+" HP.";
        }
    }

    public void takeDamage(int n){
        if (currentHealth-n<=0){
            currentHealth=0;
        }else{
            currentHealth-=n;
        }
    }

    public void attack(Character ch){
        this.heal(this);
        if (this.getWeapon()!=null){
            ch.takeDamage(this.getWeapon().getDamage());
        }
        ch.takeDamage(10);
    }
}
