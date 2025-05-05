import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Library!");

        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Add a book");
            System.out.println("2. View the list of books");
            System.out.println("3. Get a book by its position");
            System.out.println("4. Add a book at a specific position");
            System.out.println("5. Remove a book by title");
            System.out.println("6. Exit");
            System.out.print("Option: ");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter the book title: ");
                    String titleToAdd = scanner.nextLine();
                    library.addBook(titleToAdd);
                    System.out.println("Book added: " + titleToAdd);
                    break;

                case 2:
                    System.out.println("List of books:");
                    List<String> books = library.getBookList();
                    for (String book : books) {
                        System.out.println(" - " + book);
                    }
                    break;

                case 3:
                    System.out.print("Enter the position of the book: ");
                    int position = scanner.nextInt();
                    String bookByPosition = library.getBookByPosition(position);
                    if (bookByPosition != null) {
                        System.out.println("Book at position " + position + ": " + bookByPosition);
                    } else {
                        System.out.println("Invalid position.");
                    }
                    break;

                case 4:
                    System.out.print("Enter the book title: ");
                    String titleAtPosition = scanner.nextLine();
                    System.out.print("Enter the position to add the book: ");
                    int positionToAdd = scanner.nextInt();
                    library.addBookAtPosition(titleAtPosition, positionToAdd);
                    System.out.println("Book added at position " + positionToAdd);
                    break;

                case 5:
                    System.out.print("Enter the book title to remove: ");
                    String titleToRemove = scanner.nextLine();
                    boolean removed = library.removeBookByTitle(titleToRemove);
                    if (removed) {
                        System.out.println("Book removed: " + titleToRemove);
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 6:
                    System.out.println("Exiting the application...");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid option. Please select a valid option.");
                    break;
            }
        }
    }
}