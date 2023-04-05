package Book_Manager;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Repository
public class BookRepository {
    HashMap<Integer,Book> bookDb=new HashMap<>();

    //add book
    public void addBook(Book book)
    {
      Integer key= book.getBookId();
        bookDb.put(key,book);


    }

    public List<Book> getAllBooks(){
        return bookDb.values().stream().toList();
    }

public Book getBookById(Integer bookId){
        return bookDb.containsKey(bookId)? Optional.of(bookDb.get(bookId)): Optional.empty();

}
public void updateBook(Book book){
        bookDb.put(book.getBookId(),book);
}

}
