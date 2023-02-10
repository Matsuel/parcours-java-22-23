public class DeadCharacterException extends Exception {
    public Character ch;
    DeadCharacterException(Character ch){
        super();
        this.ch=ch;
    }

    public String getMessage(){
        String rep= "The";
        if (this.ch instanceof Templar){
            rep+=" templar ";
        }else if (this.ch instanceof Sorcerer){
            rep += " sorcerer ";
        }else{
            rep+= " monster ";
        }
        return rep+this.ch.getName()+" is dead.";
    }
}
