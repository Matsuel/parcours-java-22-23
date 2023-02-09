public class Character {
    private final int maxHealth ;
    private int currentHealth;
    private final String name;

    public Character(String name, int maxHealt){
        this.currentHealth=maxHealt;
        this.maxHealth=maxHealt;
        this.name=name;
    }
 
    public int getMaxHealth(){
        return maxHealth;
    }
 
    public int getCurrentHealth(){
        return currentHealth;
    }
 
    public String getName(){
        return name;
    }

    public String toString(){
        if (this.currentHealth>0){
        return this.getName()+" : "+this.getCurrentHealth()+"/"+this.getMaxHealth();
        }else{
            return this.getName()+" : KO";
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
        ch.takeDamage(9);
    }
}
