public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("1984", "George Orwell", 328, true);

        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", 310, true);

        Book book3 = new Book("Clean Code", "Robert C. Martin", 464, false);

        Reader reader1 = new Reader("John", "Smith", "C1001", 0);

        Reader reader2 = new Reader("Anna", "Brown", "C1002", 2);

        book1.printInfo();

        book2.printInfo();

        book3.printInfo();

        reader1.printData();

        reader2.printData();

        reader1.increaseBorrowedCount();

        reader1.printData();

        reader2.decreaseBorrowedCount();

        reader2.printData();

    }

}
 
