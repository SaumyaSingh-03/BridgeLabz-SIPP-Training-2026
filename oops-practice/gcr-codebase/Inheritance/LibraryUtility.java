package Inheritence;

public class LibraryUtility {
    public static void displayInfo() {
        Book b1 = new Book(
                2016,
                "Verity"
        );

        Author a1 = new Author(
                "Colleen Hoover",
                "Female",
                b1
        );

        Book b2 = new Book(
                2004,
                "Pride & Prejudice"
        );

        Author a2 = new Author(
                "Jane Austen",
                "Female",
                b2
        );

        System.out.println(a1.toString());
        System.out.println(a2.toString());
    }

    public static void main(String[] args) {

        displayInfo();
    }
}
