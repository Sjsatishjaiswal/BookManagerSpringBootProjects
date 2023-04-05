package Book_Manager;

//for getter function use Annotations

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {
    private Integer bookId;
    private String name;
    private String  author;

    private Boolean available;


}
