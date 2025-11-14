package mygame.heroes.com.library.dea;

import com.library.dea.entity.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private final List<Book> books = new ArrayList<>(List.of(

            new Book(1, "Hunger games", "Suzanne Collins", 10.21, 374,
                    "English", "Dystopian, Adventure, Science Fiction", "Future dystopian country Panem",
                    "Katniss Everdeen, Peeta Mellark", 2008),

            new Book(2, "Sherlock Holmes", "Arthur Conan Doyle", 21.99, 307,
                    "French", "Detective, Mystery", "London, 19th century",
                    "Sherlock Holmes, Dr. John Watson", 1887),

            new Book(3, "Romeo and Juliette", "William Shakespeare", 16.84, 189,
                    "Russian", "Tragedy, Romance", "Verona, Italy, Renaissance period",
                    "Romeo Montague, Juliet Capulet", 1597),

            new Book(4, "Lord of the rings", "Ronald Reuel Tolkien", 18.47, 1342,
                    "Turkish", "Fantasy, Epic Adventure", "Middle-earth (fantasy world)",
                    "Frodo Baggins, Gandalf, Aragorn", 1954)
    ));

    @GetMapping("/all")
    public List<Book> getAllBooks() {
        return books;
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Integer id) {
        for (Book book : books) {
            if (book.getId().equals(id)) {
                return book;
            }
        }
        return null;
    }

    @PostMapping("/add")
    public String createBook(@RequestBody Book newBook) {
        books.add(newBook);
        return "New book created: " + newBook.getTitle();
    }

    @PutMapping("/update/{id}")
    public String updateBook(@PathVariable Integer id, @RequestBody Book updatedBook) {
        for (int i = 0; i < books.size(); i++) {
            Book existingBook = books.get(i);
            if (existingBook.getId().equals(id)) {
                books.set(i, updatedBook);
                return "Book with ID: " + id + " updated.";
            }
        }
        return "No such book with ID: " + id;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable Integer id) {
        for (Book book : books) {
            if (book.getId().equals(id)) {
                books.remove(book);
                return "Book with ID: " + id + " removed.";
            }
        }
        return "No such book with ID: " + id;
    }
}

