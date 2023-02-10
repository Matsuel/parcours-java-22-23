public class DeadCharacterException extends Exception {
    DeadCharacterException(Character ch){
        super("The " + ch.getClass().getSimpleName().toLowerCase() + " " + ch.getName() + " is dead.");
    }

    public String getMessage(){
        return super.getMessage();
    }
}
