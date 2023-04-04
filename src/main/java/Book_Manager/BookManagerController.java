package Book_Manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class BookManagerController {
    @Autowired
    // BookManagerService bookManagerService=new  BookManagerService();OR
    BookManagerServiceImp bookManagerService;


}
