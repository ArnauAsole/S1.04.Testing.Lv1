package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            System.out.println("\n--- LIBRARY MENU ---");
            System.out.println("1. Add a book");
            System.out.println("2. List all books");
            System.out.println("3. Get book by position");
            System.out.println("4. Remove book by title");
            System.out.println("0. Exit");
            System.out.print("Choose an option: ");

            option = scanner.nextInt();
            scanner.nextLine(); // Clear buffer

            switch (option) {
                case 1:
                    System.out.print("Title: ");
                    String title = scanner.nextLine();
                    System.out.print("Author: ");
                    String author = scanner.nextLine();
                    System.out.print("Year: ");
                    int year = scanner.nextInt();
                    scanner.nextLine(); // Clear buffer
                    library.addBook(new Book(title, author, year));
                    System.out.println("Book added.");
                    break;

                case 2:
                    System.out.println("\nBooks in library:");
                    if (library.getBooks().isEmpty()) {
                        System.out.println("(No books yet)");
                    } else {
                        int i = 0;
                        for (Book book : library.getBooks()) {
                            System.out.println(i + ": " + book);
                            i++;
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter position: ");
                    int pos = scanner.nextInt();
                    scanner.nextLine(); // Clear buffer
                    if (pos >= 0 && pos < library.getBooks().size()) {
                        System.out.println("Book at position " + pos + ": " + library.getBookAtPosition(pos));
                    } else {
                        System.out.println("Invalid position.");
                    }
                    break;

                case 4:
                    System.out.print("Enter title to remove: ");
                    String removeTitle = scanner.nextLine();
                    Book toRemove = library.getBooks().stream()
                            .filter(b -> b.getTitle().equalsIgnoreCase(removeTitle))
                            .findFirst()
                            .orElse(null);

                    if (toRemove != null) {
                        library.removeBookByTitle(toRemove);
                        System.out.println("Book removed.");
                    } else {
                        System.out.println("Book not found.");
                    }
                    break;

                case 0:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option.");
            }

        } while (option != 0);

        scanner.close();
    }
}
