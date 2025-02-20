/*
    Java Masterclass
    Kareem Abdelkader
    Implement a Library management system to handle books, members, and transactions
*/


import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class Book {
    //Attributes
    private String bookName;
    private String bookAuthor;
    private int bookISBN;
    private int bookCopiesAvailable;

    //Constructor
    public Book(String bookName, String bookAuthor, int bookISBN, int bookAvailable) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.bookISBN = bookISBN;
        this.bookCopiesAvailable = bookAvailable;
    }

    //Get & Set the book name
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    //Get & Set the author name
    public String getBookAuthor() {
        return bookAuthor;
    }
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    //Get & Set the book unique isbn
    public int getBookISBN() {
        return bookISBN;
    }
    public void setBookISBN(int bookISBN) {
        this.bookISBN = bookISBN;
    }

    //Get & Set the book availability
    public int getCopiesAvailable() {
        return bookCopiesAvailable;
    }
    public void setCopiesAvailable(int bookAvailable) {
        this.bookCopiesAvailable = bookAvailable;
    }

    //Print the book details
    @Override
    public String toString() {
        return "Book" + getBookISBN() + " {" +
                "bookName='" + bookName + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                ", bookISBN=" + bookISBN +
                ", bookAvailable=" + bookCopiesAvailable +
                '}';
    }
}


class Member {
    //Attributes
    private String memberName;
    private String memberContactInfo;
    private int memberID;

    //Constructor
    public Member(String memberName, String memberContactInfo, int memberID) {
        this.memberName = memberName;
        this.memberContactInfo = memberContactInfo;
        this.memberID = memberID;
    }

    //Get & Set member name
    public String getMemberName() {
        return memberName;
    }
    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    //Get & Set member contact info
    public String getMemberContactInfo() {
        return memberContactInfo;
    }
    public void setMemberContactInfo(String memberContactInfo) {
        this.memberContactInfo = memberContactInfo;
    }

    //Get & Set member unique ID
    public int getMemberID() {
        return memberID;
    }
    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    //Print member info
    @Override
    public String toString() {
        return "Member{" +
                "memberName='" + memberName + '\'' +
                ", memberContactInfo='" + memberContactInfo + '\'' +
                ", memberID=" + memberID +
                '}';
    }
}


class Transaction {
    //Attributes
    private String transactionID;
    private String borrowDate;
    private String returnDate;
    private int memberID;
    private int bookISBN;


    public String getTransactionID() {
        return transactionID;
    }
    public void setTransactionID(String transactionID) {
        this.transactionID = transactionID;
    }

    public String getBorrowDate() {
        return borrowDate;
    }
    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    public String getReturnDate() {
        return returnDate;
    }
    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public int getMemberID() {
        return memberID;
    }
    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public int getBookISBN() {
        return bookISBN;
    }
    public void setBookISBN(int bookISBN) {
        this.bookISBN = bookISBN;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionID='" + transactionID + '\'' +
                ", borrowDate='" + borrowDate + '\'' +
                ", returnDate='" + returnDate + '\'' +
                ", memberID=" + memberID +
                ", bookISBN=" + bookISBN +
                '}';
    }
}


class LMS {

    //Attributes
    ArrayList<Book> books;
    ArrayList<Member> members;
    ArrayList<Transaction> transactions;


    //Constructor
    public LMS() {
        this.books = new ArrayList<>();
        this.members = new ArrayList<>();
        this.transactions = new ArrayList<>();
    }


    /*
     *   Books
     */

    //Method to add a new book
    public void addBook(Book book){
        books.add(book);
        System.out.println("Book added successfully!");
    }

    //Method to update book details
    public void updateBook(Book updatedBook, int isbn){
        for (int i = 0; i < books.size(); i++) {
            if( books.get(i).getBookISBN() == isbn){
                books.set(i,updatedBook);
                System.out.println("Book details updated successfully!");
            } else {
                System.out.println("Book with " + isbn + " not found");
            }
        }
    }

    //Method to remove a book
    public void removeBook(int isbn){
        for( Book book : books){
            if(book.getBookISBN() == isbn){
                books.remove(book);
                System.out.println("Book removed successfully!");
            } else {
                System.out.println("Book with " + isbn + " not found");
            }
        }
    }

    //Method to list all books
    public void printAllBooks(){
        for( Book book : books){
            System.out.println(book);
        }
    }


    /*
     *   Members
     */

    //Method to add a new member
    public void addMember(Member member){
        members.add(member);
        System.out.println("Member added successfully");
    }

    //Method to update a member info
    public void updateMember(int id, Member updatedmember){
        for( Member member : members ){
            if(member.getMemberID() == id){
                members.set(members.indexOf(member),updatedmember);
                System.out.println("Member updated successfully!");
            } else {
                System.out.println("Member with "+ id +" not found");
            }
        }
    }

    //Method to remove a member
    public void removeMember(int id){
        for( Member member : members){
            if(member.getMemberID() == id){
                members.remove(member);
                System.out.println("Member removed Successfully!");
            } else {
                System.out.println("Member with "+ id +" not found");
            }
        }
    }

    //Method to list all members
    public void printAllMembers(){
        for( Member member : members){
            System.out.println(member);
        }
    }


    /*
     *   Transaction
     */

    //Method to borrow a book
    public boolean borrowBook(int id, int isbn){
        Member member;
        Book   book = null;

        if( (ISBNExisting(isbn) == null) || (book.getCopiesAvailable() <= 0) ){
            System.out.println("Book with "+ isbn +" not available");
            return false;
        }

        if( IDExisting(id) == null ){
            System.out.println("Member with "+ id +" not found");
            return false;
        }

        book.setCopiesAvailable(book.getCopiesAvailable() - 1);
        Transaction transaction = new Transaction();
        transactions.add(transaction);
        System.out.println("Book borrowed successfully");
        return true;
    }

    //Method to return a book
    public boolean returnBook(int id, int isbn){
        Member member = IDExisting(id);
        Book   book = ISBNExisting(isbn);

        if( member == null ){
            System.out.println("Member with "+ id +" not found");
            return false;
        }
        if( book == null ){
            System.out.println("Book with "+ isbn +" not available");
            return false;

        }

        for (Transaction transaction : transactions) {
            if (transaction.getMemberID() == id &&
                    transaction.getBookISBN() == isbn &&
                    transaction.getReturnDate() == null) {

                transaction.setReturnDate(String.valueOf(new Date()));
                book.setCopiesAvailable(book.getCopiesAvailable() + 1);
                System.out.println("Book returned successfully: " + book);
                return true;
            }
        }

        System.out.println("No active borrowing record found for this book and member.");
        return false;
    }



    private Member IDExisting(int id){
        //Check if the member is already existing by the ID
        for (Member member : members){
            if(member.getMemberID() == id){
                return member; //return member info
            }
        }
        return null; //return null if the member not existing
    }
    private Book ISBNExisting(int isbn){
        //Check if the book is already existing by the ISBN
        for (Book book : books){
            if( book.getBookISBN() == isbn){
                return book; //return book details
            }
        }
        return null; //return null if the book not existing
    }

}



public class program3 {

    //Initialize the Library Management System
    static LMS lms = new LMS();

    static Scanner scan = new Scanner(System.in);
    static boolean flag = true;

    static String textBlock1 = """
                1. Librarian
                2. Customer
                3. exit
                """;
    static String textBlock2 = """
                1. Add a book
                2. Update book
                3. Remove book
                4. All books
                5. Add a member
                6. Update member
                7. Remove member
                8. All members
                """;
    static String textBlock3 = """
                1. All books
                2. Borrow a book
                3. Return a book
                """;

    public static void main(String[] args) {

        while (flag){

            System.out.println("------ Welcome to Library Management System ------");
            System.out.print(textBlock1);
            int action1 = scan.nextInt();

            if( action1 == 1 ){
                System.out.println("------- Librarian mood -------");
                System.out.print(textBlock2);

                int action2 = scan.nextInt();
                switch (action2) {
                    case 1: {
                        System.out.println("Add a new book....");

                        System.out.println("Enter the name of the book: ");
                        String bookName = scan.nextLine();  //Set the name of the book
                        System.out.println("Enter the name of the book's author: ");
                        String authorName = scan.nextLine();    //Set the name of the author
                        System.out.println("Enter the ISBN of the book: ");
                        int bookISBN = scan.nextInt();  //Set the ISBN for the book
                        System.out.println("Enter the no. of copies: ");
                        int bookCopies = scan.nextInt();    //Set the number of available copies of the book

                        lms.addBook(new Book(bookName, authorName, bookISBN, bookCopies));
                        break;
                    }
                    case 2: {
                        System.out.println("Update a book details....");

                        System.out.println("Enter the ISBN of the book: ");
                        int isbn = scan.nextInt();

                        System.out.println("Enter the new name of the book: ");
                        String bookName = scan.nextLine();
                        System.out.println("Enter the new name of the book's author: ");
                        String authorName = scan.nextLine();
                        System.out.println("Enter the new no. of copies: ");
                        int bookCopies = scan.nextInt();

                        lms.updateBook(new Book(bookName,authorName,isbn,bookCopies),isbn);
                        break;
                    }
                    case 3: {
                        System.out.println("Remove a book....");

                        System.out.println("Enter the ISBN of the book: ");
                        int isbn = scan.nextInt();

                        lms.removeBook(isbn);
                        break;
                    }
                    case 4: {
                        lms.printAllBooks();
                        break;
                    }
                    case 5: {
                        System.out.println("Add a new member....");

                        System.out.println("Enter the name of the member: ");
                        String memberName = scan.nextLine();  //Set the name of the member
                        System.out.println("Enter the ID of the member: ");
                        int memberID = scan.nextInt();  //Set the ISBN for the member
                        System.out.println("Enter the contact info: ");
                        String memberContact = scan.nextLine();    //Set the contact info of the member

                        lms.addMember(new Member(memberName, memberContact, memberID));
                        break;
                    }
                    case 6: {
                        System.out.println("Update a member info....");

                        System.out.println("Enter the ID of the member: ");
                        int id = scan.nextInt();

                        System.out.println("Enter the new name of the member: ");
                        String memberName = scan.nextLine();
                        System.out.println("Enter the new contact info: ");
                        String memberContact = scan.nextLine();

                        lms.updateMember(id, new Member(memberName,memberContact,id));
                        break;
                    }
                    case 7: {
                        System.out.println("Remove a member....");

                        System.out.println("Enter the ID of the member: ");
                        int id = scan.nextInt();

                        lms.removeMember(id);
                        break;
                    }
                    case 8: {
                        lms.printAllMembers();
                    }
                    default:
                        System.out.println("Invalid input");
                        break;
                }

            }

            if( action1 == 2){
                System.out.println("------ Customer mood ------");
                System.out.print(textBlock3);

                int action2 = scan.nextInt();

                switch (action2){
                    case 1: {
                        lms.printAllBooks();
                        break;
                    }
                    case 2: {
                        break;
                    }
                    case 3: {
                        break;
                    }
                    default:
                        System.out.println("Invalid input");
                        break;
                }

            }

            if( action1 == 3 ){
                flag = false;
            }

        }


    }

}
