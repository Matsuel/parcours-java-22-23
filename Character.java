public class Character {
    final int maxHealth ;
    int currentHealth;
    final String name;

    public Character(String name, int maxHealt){
        this.currentHealth=maxHealt;
        this.maxHealth=maxHealt;
        this.name=name;
    }
 
    public int getmaxHealth(){
        return maxHealth;
    }
 
    public int getcurrentHealth(){
        return currentHealth;
    }
 
    public String getName(){
        return name;
    }

    public String toString(){
        if (this.currentHealth>0){
        return this.getName()+" : "+this.getcurrentHealth()+"/"+this.getmaxHealth();
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
