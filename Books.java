package lab_1_books;

public class Books {
    private String name;
    private String author;
    private String genre;
    private int year;

    public Books(String name, String author, String genre, int year){
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.year = year;
    }

    public void setName(){
        this.name = name;
    }

    public void setAuthor(){
        this.author = author;
    }

    public void setGenre(){
        this.genre = genre;
    }

    public void setYear(){
        this.year = year;
    }

    public void outputString() {
        System.out.println("Книга " + name + ", " + author + ", " + genre + ", "+ year);
    }
}
