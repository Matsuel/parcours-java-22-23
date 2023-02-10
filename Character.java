import java.util.ArrayList;
import java.util.List;

public abstract class Character {
    private final int maxHealth ;
    protected int currentHealth;
    private final String name;
    private static List<Character> allCharacters= new ArrayList<Character>();
    private  Weapon weapon;

    public Character(String name, int maxHealt, Weapon weapon){
        this.currentHealth=maxHealt;
        this.maxHealth=maxHealt;
        this.name=name;
        this.weapon=weapon;
        Character.allCharacters.add(this);
    }

    public Weapon getWeapon(){
        return this.weapon;
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

    @Override
    public String toString(){
        if (this.currentHealth>0){
        return this.getName()+" : "+this.getCurrentHealth()+"/"+this.getMaxHealth();
        }else{
            return this.getName()+" : KO";
        }
    }

    public abstract void takeDamage(int n) throws DeadCharacterException;

    public abstract void attack(Character ch) throws DeadCharacterException;

    public static String printStatus(){
        String rep="------------------------------------------\n";
        if (allCharacters.size()>0){
            rep+="Characters currently fighting :\n";
            for (int i=0; i<allCharacters.size();i++){
                rep+=" - "+allCharacters.get(i).toString()+"\n";
            }
            rep+="------------------------------------------";
        }else{
            rep+="Nobody's fighting right now !\n------------------------------------------";
        }
        
        return rep;
    }

    public static Character fight(Character ch1, Character ch2){
        while( ch1.getCurrentHealth()>=0 && ch2.getCurrentHealth()>=0){
            try{ ch1.attack(ch2); }catch(DeadCharacterException e){}
            if (ch2.getCurrentHealth()==0)return ch1;
            try{ ch2.attack(ch1); }catch(DeadCharacterException e){}
            if(ch1.getCurrentHealth()==0)return ch2;
        }
        if (ch1.getCurrentHealth()==0)return ch2;
        return ch1;
    }
}
