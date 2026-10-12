import java.util.Scanner;
class Main{
    static int capacity  = 10;
    static Scanner input = new Scanner(System.in);
    static String[] books = new String[capacity];
    static int size = 0;
    public static void addBookAtStart(){
        if(size == capacity){
            System.out.println("Array is full. Cannot add more books.");
        }
        else{
            for(int i = size - 1; i > 0; i--){
                books[i] = books[i - 1];
            }
            System.out.print("Enter the name of the book to add at start: ");
            books[0] = input.nextLine();
            System.out.println("Book added at start: " + books[0]);
            size++;
        }
    }
    public static void addBookAtSpecificIndex(){
        System.out.println("Enter index where you want to insert a book.");
        int index = input.nextInt();
        if(books[index] == ""){
            System.out.print("Enter the name of the book to add at this index: ");
            books[index] = input.nextLine();
            System.out.println("Book added at this index: " + books[0]);
            size++;
        }
        else{
            System.out.println("There is alraedy a book at index : " + index + " , so you can not insert here.");
        }
    }
    public static void addBookAtEnd(){
        System.out.println("If there is already a book at end it will delete this bcz we can not increase the size.");
        if(books[capacity - 1] != ""){
            System.out.println("Array is full. Cannot add more books.");
        }
        else{
            System.out.print("Enter the name of the book to add at end: ");
            books[capacity - 1] = input.nextLine();
            System.out.println("Book added at start: " + books[0]);
            size++;
        }
    }
    public static void deleteBookFromStart(){
        System.out.println("I am demo method for deleting book from start");
    }
    public static void deleteBookFromSpecificIndex(){
        System.out.println("I am demo method for deleting book from specific index");
    }
    public static void deleteBookFromEnd(){
        System.out.println("I am demo method for deleting book from end");
    }
    public static void viewAllBooks(){
        System.out.println("I am demo method for viewing all books");
    }
    public static void viewFirstBook(){
        System.out.println("I am demo method for viewing first book");
    }
    public static void viewLastBook(){
        System.out.println("I am demo method for viewing last book");
    }
    public static void viewBookAtSpecificIndex(){
        System.out.println("I am demo method for viewing book at specific index");
    }
    public static void searchBookByName(){
        System.out.println("I am demo method for searching book by name");
    }
    public static void updateBookAtStart(){
        System.out.println("I am demo method for updating book at start");
    }
    public static void updateBookAtEnd(){
        System.out.println("I am demo method for updating book at end");
    }
    public static void updateBookAtSpecificIndex(){
        System.out.println("I am demo method for updating book at specific index");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.println("***Welcome to KHAN Library***");
        System.out.println("...Main Menue...");
        System.out.println("1. Add Book at start");
        System.out.println("2. Add Book at specific index");
        System.out.println("3. Add Book at end");
        System.out.println("4. Delete Book from start");
        System.out.println("5. Delete Book from a specific index");
        System.out.println("6. Delete Book from end");
        System.out.println("7. View all books");
        System.out.println("8. View first book");
        System.out.println("9. View last book");
        System.out.println("10. View book at a specific index");
        System.out.println("11. Search Book by name");
        System.out.println("12. Update book at start");
        System.out.println("13. Update book at end");
        System.out.println("14. Update book at specific index");
        System.out.println("15. Exit");
        char exit = 'n';
        while(exit != 'y'){
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            switch (choice) {
            case 1:
                addBookAtStart();
                break;
            case 2:
                addBookAtSpecificIndex();
                break;
            case 3:
                addBookAtEnd();
                break;
            case 4:
                deleteBookFromStart();
                break;
            case 5:
                deleteBookFromSpecificIndex();
                break;
            case 6:
                deleteBookFromEnd();
                break;
            case 7:
                viewAllBooks();
                break;
            case 8:
                viewFirstBook();
                break;
            case 9:
                viewLastBook();
                break;
            case 10:
                viewBookAtSpecificIndex();
                break;
            case 11:
                searchBookByName();
                break;
            case 12:
                updateBookAtStart();
                break;
            case 13:
                updateBookAtEnd();
                break;
            case 14:
                updateBookAtSpecificIndex();
                break;
            case 15:
                System.out.println("Exiting the program. Goodbye!");
                System.exit(0);
                break;
            default:
                System.out.println("Invalid input. Please enter a number between 1 and 15.");
                break;
            }
            System.out.print("Do you want to exit? (y/n): ");
            exit = input.next().charAt(0);
        }
        System.out.println("Exiting the program. Goodbye!");
    }
}