package Book_Manager;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class User {
    private Integer userId;
    private String name;
    private List<Book> issueBook;
}
