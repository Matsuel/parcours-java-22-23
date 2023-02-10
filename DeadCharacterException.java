public class DeadCharacterException extends Exception {
    DeadCharacterException(Character ch){
    }

    public String getMessage(){
        return super.getMessage();
    }
}
