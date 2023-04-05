package Book_Manager;

public class BookUnavailableForIssueException extends RuntimeException{
    public BookUnavailableForIssueException(Integer bookid){
        super("Book with Id : "+bookid+"is already issued");

    }
}
