import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Library myLibrary = new Library();
	    System.out.println("Welcome to your library database.");
        System.out.println("This program manages the books in your library.");
        boolean active = true;
        Scanner input = new Scanner(System.in);
        while(active) {
            System.out.println("Please enter a number from the menu below");
            System.out.println("1: Add a new book");
            System.out.println("2: Remove a book");
            System.out.println("3: Find books by author");
            System.out.println("4: Find books by title");
            System.out.println("5: Find books by genre");
            System.out.println("6: Load books from file");
            System.out.println("7: Quit");
            int choice = input.nextInt();
            switch (choice) {
                case (1):
                    myLibrary.addBook();
                    break;
                case (2):
                    myLibrary.removeBook();
                    break;
                case (3):
                    System.out.println(myLibrary.getByAuthor());
                    break;
                case (4):
                    System.out.println(myLibrary.getByTitle());
                    break;
                case (5):
                    System.out.println(myLibrary.getByGenre());
                    break;
                case (6):
                    myLibrary.readInFile();
                case (7):
                    active = false;
                    break;
            }
        }
        System.out.println("Goodbye...");
    }
}
