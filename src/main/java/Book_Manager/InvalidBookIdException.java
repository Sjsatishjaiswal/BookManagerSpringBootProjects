package Book_Manager;

public class InvalidBookIdException extends RuntimeException{
    public InvalidBookIdException(Integer bookId){
        super("Book with bookId" +bookId +"not found");

    }
}
