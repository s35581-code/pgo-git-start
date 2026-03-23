public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("1984", "George Orwell", 328, true);

        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", 310, true);

        Book book3 = new Book("Clean Code", "Robert C. Martin", 464, false);

        Reader reader1 = new Reader("John", "Smith", "C1001", 0);

        Library library = new Library(10);

        library.addBook(book1);

        library.addBook(book2);

        library.addBook(book3);

        System.out.println("Before borrowing:");

        library.printAvailableBooks();

        reader1.printData();

        System.out.println("Borrowing The Hobbit...");

        library.borrowBook("The Hobbit", reader1);

        reader1.printData();

        System.out.println("Available books after borrowing:");

        library.printAvailableBooks();

        System.out.println("Returning The Hobbit...");

        library.returnBook("The Hobbit", reader1);

        reader1.printData();

        System.out.println("Available books after return:");

        library.printAvailableBooks();

    }

}
 
