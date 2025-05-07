import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Library {
    private List<String> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(String title) {
        if (!books.contains(title)) {
            books.add(title);
            Collections.sort(books); // Keep the list sorted alphabetically
        }
    }

    public List<String> getBookList() {
        return books;
    }

    public Optional<String> getBookByPosition(int position) {
        if (position >= 0 && position < books.size()) {
            return Optional.of(books.get(position));
        } else {
            return Optional.empty(); // Use Optional to avoid returning null
        }
    }

    public void addBookAtPosition(String title, int position) {
        if (position >= 0 && position <= books.size() && !books.contains(title)) {
            books.add(position, title);
            Collections.sort(books); // Re-sort the list after adding
        }
    }

    public boolean removeBookByTitle(String title) {
        return books.remove(title);
    }
}
