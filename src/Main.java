//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
      public static void main(String[] args) {

          Author author1 = new Author("Лев", "Толстой");
          Author author2 = new Author("Федр", "Достоевский");

          Book book1 = new Book(author1, 1869, "Война и мир");
          Book book2 = new Book(author2, 1847, "Роман в девяти письмах");

          System.out.println("Книга: " + book1.getBookName() + ", автор: " + author1.getFirstName() + " " + author1.getLastName());
          System.out.println("Книга: " + book2.getBookName() + ", автор: " + author2.getFirstName() + " " + author2.getLastName());
          book2.setYearPublication(1865);
          System.out.println("год выпуска: " + book2.getYearPublication());
      }


}