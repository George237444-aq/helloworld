public class Book {
Author author;
int yearPublication;
String bookName;

public  Book(Author author, int yearPublication, String bookName) {
    this.author = author;
    this.yearPublication = yearPublication;
    this.bookName = bookName;
}

public Author getAuthor(){
    return this.author;
}
public int getYearPublication(){
    return this.yearPublication;
}

public String getBookName(){
    return this.bookName;
}

public void setYearPublication(int yearPublication){
    this.yearPublication = yearPublication;
}

}
