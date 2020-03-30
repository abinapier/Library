public class Book {
    private String author;
    private String title;
    private int publishingYear;
    public Book(){
        author = "unknown";
        title = "unknown";
        publishingYear = 0;
    }


    public Book(String author, String title, int year){
        this.author = author;
        this.title = title;
        this.publishingYear = year;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setPublishingYear(int year){
        this.publishingYear = year;
    }

    public String getAuthor(){
        return author;
    }

    public String getTitle(){
        return title;
    }

    public int getPublishingYear(){
        return publishingYear;
    }

    public String toString(){
        return "\""+title+"\" - "+author+" ("+publishingYear+")";
    }
}
