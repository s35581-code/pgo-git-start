public class Main {

    public static void main(String[] args) {

        Book book1 = new Book("1984", "George Orwell", 328, true);

        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", 310, true);

        Book book3 = new Book("Clean Code", "Robert C. Martin", 464, false);

        book1.printInfo();

        book2.printInfo();

        book3.printInfo();

        book1.borrow();

        book1.printInfo();

        book1.returnBook();

        book1.printInfo();

    }

}

