public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("1984", "George Orwell", 328, true);

        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", 310, true);

        Book book3 = new Book("Clean Code", "Robert C. Martin", 464, false);

        Reader reader1 = new Reader("John", "Smith", "C1001", 0);

        Reader reader2 = new Reader("Anna", "Brown", "C1002", 2);

        Library library = new Library(10);

        library.addBook(book1);

        library.addBook(book2);

        library.addBook(book3);

        reader1.printData();

        reader2.printData();

        library.printAvailableBooks();

        System.out.println("Number of available books: " + library.countAvailableBooks());

        System.out.println("Searching for The Hobbit:");

        library.findBookByTitle("The Hobbit");

    }

}
 
