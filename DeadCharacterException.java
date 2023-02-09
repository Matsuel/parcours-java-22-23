public class DeadCharacterException extends Exception {
    DeadCharacterException(Character ch){
        //ce constructeur doit renvoyer le type de la classe (sorcerer, monster ou templar) du character mort et son nom
        super("The " + ch.getClass().getSimpleName().toLowerCase() + " " + ch.getName() + " is dead.");
    }

    public String getMessage(){
        return super.getMessage();
    }
}
