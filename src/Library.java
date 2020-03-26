import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    ArrayList<Book> books = new ArrayList<Book>();
    Library(){
    }


    public void addBook(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the title of the book:");
        String title = input.nextLine();
        System.out.println("Please enter the name of the author:");
        String author = input.nextLine();
        System.out.println("Please enter the publishing year:");
        int year = input.nextInt();
        System.out.println("Please select a genre type by entering the corresponding number:");
        System.out.println("Children's Book: 1");
        System.out.println("Novel: 2");
        System.out.println("Biography: 3");
        System.out.println("Textbook: 4");
        int genre = input.nextInt();
        switch (genre){
            case 1: {
                Children book = new Children();
                System.out.println("Please enter the target age group for the book:");
                String ageGroup = input.nextLine();
                System.out.println("Please enter the reading level (1-3):");
                int level = input.nextInt();
                book.setTitle(title);
                book.setAuthor(author);
                book.setPublishingYear(year);
                book.setAgeGroup(ageGroup);
                book.setReadingLevel(level);
                books.add(book);
                break;
            }
            case 2: {
                Novel book = new Novel();
                System.out.println("Please enter the target age group for the book:");
                String ageGroup = input.nextLine();
                System.out.println("Please enter the number of pages in the book:");
                int pageNum = input.nextInt();
                book.setTitle(title);
                book.setAuthor(author);
                book.setPublishingYear(year);
                book.setAgeGroup(ageGroup);
                book.setPageNumber(pageNum);
                books.add(book);
                break;
            }
            case 3: {
                Biography book = new Biography();
                System.out.println("Please enter the time period for this book:");
                int timePeriod = input.nextInt();
                System.out.println("Please enter the gender of the subject:");
                String gender = input.nextLine();
                book.setTitle(title);
                book.setAuthor(author);
                book.setPublishingYear(year);
                book.setTimePeriod(timePeriod);
                book.setGender(gender);
                books.add(book);
                break;
            }
            case 4: {
                Textbook book = new Textbook();
                System.out.println("Please enter the time period for this book:");
                int timePeriod = input.nextInt();
                System.out.println("Please enter the topic:");
                String topic = input.nextLine();
                book.setTitle(title);
                book.setAuthor(author);
                book.setPublishingYear(year);
                book.setTimePeriod(timePeriod);
                book.setTopic(topic);
                books.add(book);
                break;
            }
        }
    }

    public void removeBook(){
        System.out.println("Please enter the title of the book you would like to remove:");
        Scanner input = new Scanner();
        String title = input.nextLine();
        boolean bookFound = false;
        for(int i =0; i<books.size(); i++){
            if(books.get(i).getTitle().equals(title)){
                books.remove(i);
                bookFound = true;
            }
        }
        if(!bookFound){
            System.out.println("Book title not found. No book removed.");
        }else{
            System.out.println("Book successfully removed.");
        }
    }

    public String printBooks(){
        StringBuilder printString = new StringBuilder();
        for(int i = 0; i<books.size(); i++){
            printString.append(books.get(i).toString());
        }
        if(printString.toString().length()==0){
            return("No books in library.");
        }
        return printString.toString();
    }

    public String getByAuthor(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the name of the author:");
        String authorName = input.nextLine();
        StringBuilder printString = new StringBuilder();
        for(int i = 0; i<books.size(); i++){
            if(books.get(i).getAuthor().equals(authorName)){
                printString.append(books.get(i).toString());
            }
        }
        if(printString.toString().length()==0){
            return("No books by that author");
        }
        return printString.toString();
    }

    public String getByTitle(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the title:");
        String title = input.nextLine();
        StringBuilder printString = new StringBuilder();
        for(int i = 0; i<books.size(); i++){
            if(books.get(i).getTitle().equals(title)){
                printString.append(books.get(i).toString());
            }
        }
        if(printString.toString().length()==0){
            return("No books by that title");
        }
        return printString.toString();
    }

    public String getByGenre(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please select a genre type by entering the corresponding number:");
        System.out.println("Children's Book: 1");
        System.out.println("Novel: 2");
        System.out.println("Biography: 3");
        System.out.println("Textbook: 4");
        int genre = input.nextInt();
        String genreString = "";
        switch (genre){
            case 1:
                genreString = "Children";
                break;
            case 2:
                genreString = "Novel";
                break;
            case 3:
                genreString = "Biography";
                break;
            case 4:
                genreString = "Textbook";
                break;
        }
        StringBuilder printString = new StringBuilder();
        for(int i = 0; i<books.size(); i++){
            if(books.get(i).getClass().equals(genreString)){
                printString.append(books.get(i).toString());
            }
        }
        if(printString.toString().length()==0){
            return("No books in that genre.");
        }
        return printString.toString();
    }

    public void readInFile(){

    }
}
