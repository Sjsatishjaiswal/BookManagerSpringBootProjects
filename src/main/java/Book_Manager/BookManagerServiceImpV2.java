package Book_Manager;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookManagerServiceImpV2 implements BookManagerService {
    @Override
    public List<Book> getAllBook() {
        return null;
    }

    @Override
    public void issueBook(User user,Integer bookid);

}
