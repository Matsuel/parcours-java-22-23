import java.util.List;

public class Character {
    private final int maxHealth ;
    private int currentHealth;
    private final String name;
    private static List<Character> allCharacters;

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

    public static String printStatus(){
        String rep="------------------------------------------";
        if (allCharacters!=null){
            for (Character ch : allCharacters){
                rep+="- "+ch.toString()+"\n";
            }
            rep+="------------------------------------------";
        }else{
            rep="------------------------------------------ \nNobody's fighting right now !\n------------------------------------------";
        }
        
        return rep;
    }

    public static String fight(Character ch1, Character ch2){
        while( ch1.getCurrentHealth()>=0 && ch2.getCurrentHealth()>=0){
            ch1.attack(ch2);
            ch2.attack(ch1);
        }
        if (ch1.getCurrentHealth()==0){
            return ch2.toString();
        }
        else{
            return ch1.toString();
        }
    }
}
