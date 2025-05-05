import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTestClass {

    private Library library;

    @BeforeEach
    public void setUp() {
        library = new Library();
    }

    @Test
    public void testAddBook() {
        library.addBook("Don Quixote");
        assertEquals(1, library.getBookList().size());
    }

    @Test
    public void testGetBookList() {
        library.addBook("One Hundred Years of Solitude");
        library.addBook("Don Juan Tenorio");
        List<String> books = library.getBookList();
        assertNotNull(books);
        assertEquals(2, books.size());
    }

    @Test
    public void testGetBookByPosition() {
        library.addBook("The House of the Spirits");
        library.addBook("Don Quixote of La Mancha");
        assertEquals("Don Quixote of La Mancha", library.getBookByPosition(0));
    }

    @Test
    public void testAddBookAtPosition() {
        library.addBook("The Shadow of the Wind");
        library.addBookAtPosition("Love in the Time of Cholera", 0);
        assertEquals("Love in the Time of Cholera", library.getBookByPosition(0));
    }

    @Test
    public void testRemoveBookByTitle() {
        library.addBook("The Divine Comedy");
        boolean removed = library.removeBookByTitle("The Divine Comedy");
        assertTrue(removed);
        assertEquals(0, library.getBookList().size());
    }

    @Test
    public void testRemoveBookThatDoesNotExist() {
        boolean removed = library.removeBookByTitle("Nonexistent Book");
        assertFalse(removed);
    }

    @Test
    public void testListSortedAlphabetically() {
        library.addBook("Moby Dick");
        library.addBook("1984");
        library.addBook("The Great Gatsby");
        List<String> books = library.getBookList();
        assertEquals("1984", books.get(0));
        assertEquals("The Great Gatsby", books.get(1));
        assertEquals("Moby Dick", books.get(2));
    }
}