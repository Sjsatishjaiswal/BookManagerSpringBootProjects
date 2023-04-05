package Book_Manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookManagerServiceImp implements BookManagerService {
    @Autowired
    BookRepository bookRepository;
    @Autowired
    UserRepository userRepository;

    @Override
    public List<Book> getAllBooks() {

        return bookRepository.getAllBooks();


    }


    @Override
    public void issueBook(User user, Integer bookid) {
        Optional<Book>bookOptional= bookRepository.getBookById(bookid);
        //first creck  whether  the  book is available of not
        //if the book is available ,
        if(bookOptional.isEmpty()){
            throw new InvalidBookIdException(bookId);
        } else if (!bookOptional.get().getAvailable()) {
            throw  new BookUnavailableForIssueException(bookId);

        }
//        if( bookOptional.isPresent() && bookOptional.get().getAvailable()){
//           //Go ahead with issuing the book}else{
//           throw new.. }

        Book bookToBeIssued= bookOptional.get();
 Optional<User>userOptional=userRepository.getUserByUserId(userId);
        if(userOptional.isPresent()){
            User user = userOptional.get();
        List<Book>booksIssuesBooks=user.getIssueBook();

        bookToBeIssued.setAvailable(false);
        booksIssues.add(bookToBeIssued;
        user.setIssueBooks(booksIssued);
        userRepository.updateUser(user);
        bookRepository.updateBook(bookToBeIssued);


        }
        // 1. user - add book to list of booksIssued
        //2. make book unavailable

    }


}
