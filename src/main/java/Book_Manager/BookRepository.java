package Book_Manager;

import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class BookRepository {
    HashMap<Integer,Book> bookDb=new HashMap<>();

}
