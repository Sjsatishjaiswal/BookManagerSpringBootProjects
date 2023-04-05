package Book_Manager;

import java.util.List;

public interface BookManagerService {
    List<Book> getAllBook();

    void issueBook(Integer userid, Integer bookId);
}
