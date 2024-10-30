package TCS_PRACTICE.G_Meet;
// Create below class and attributes.
// Author
// authorId: Integer
// author name: String

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Author{
    private int authorId;
    private String authorName;
    Author(int authorId, String authorName){
        this.authorId = authorId;
        this.authorName = authorName;
    }
    public int getAuthorId() {
        return authorId;
    }
    public String getAuthorName() {
        return authorName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "authorId=" + authorId +
                ", authorName='" + authorName + '\'' +
                '}';
    }
}
// Book
// bookId: Integer
// title: String
// genre: String
// price : double
// author: Author
class Book{
    private int bookId;
    private String title;
    private String genre;
    private double price;
    private Author author;
    Book(int bookId,String title, String genre, double  price, Author author){
        this.bookId = bookId;
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.author = author;
    }
    public int getBookId() {
        return bookId;
    }
    public String getTitle() {
        return title;
    }
    public String getGenre() {
        return genre;
    }
    public double getPrice() {
        return price;
    }
    public Author getAuthor() {
        return author;
    }
    public void applyDiscount(double price){
        this.price = price * 0.2; // 20% assume;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", price=" + price +
                ", author=" + author +
                '}';
    }
}
// Create a business class and the following functionalities:
// getBooksBelongingToGenre:
// -This method will take a list of book and genre as input parameters.
// -It should find the books matching the genre and apply the discount to the book.
// -It should return list of books matching the genre after discount. The output should be printed followed by the below text.
// "Discounted<genre> books:"
// Notes
// - all string comparisons need to be case insensitive.
// -Assume an author has written only one book.
// Sample Input and output:
// 1. First, read the number of author objects to be added to the array/list.
// 2. Next, read the attributes for each author object in the mentioned sequence.
// 3. Read the attributes for each book object.
// 4. Repeat steps 2 to 3 for the number of author objects in the first line of input
// 5. Next, read the parameters to be passed to the respective methods.



//    reate a business class and the following functionalities:
// getBooksBelongingToGenre:
// -This method will take a list of book and genre as input parameters.
// -It should find the books matching the genre and apply the discount to the book.
// -It should return list of books matching the genre after discount. The output should be printed followed by the below text.
// "Discounted<genre> books:"
// Notes
// - all string comparisons need to be case insensitive.
// -Assume an author has written only one book.
// Sample Input and output:
class Library_Bussiness{

ArrayList<Book> getBooksBelongingToGenre(ArrayList<Book> books, String genre){
        ArrayList<Book> res = new ArrayList<>();
        for(Book book : books){
            if(book.getGenre().equalsIgnoreCase(genre)){
                book.applyDiscount(book.getPrice());
                res.add(book);
            }
        }
        return res;
    }

}
public class Solution_5 {
    public static void main(String[] args) {
        // 1. First, read the number of author objects to be added to the array/list.
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        ArrayList<Book> books = new ArrayList<>();
        for(int i=0;i<n;i++){
            int a = input.nextInt();input.nextLine();
            String b = input.nextLine();
            Author au  = new Author(a,b);
            int c = input.nextInt();input.nextLine();
            String d = input.nextLine();
            String e = input.nextLine();
            double f = input.nextDouble();
            input.nextLine();
            books.add(new Book(c, d, e, f, au));
        }
        String genre = input.nextLine();
        Library_Bussiness lb = new Library_Bussiness();

        ArrayList<Book> res = lb.getBooksBelongingToGenre(books, genre);
        if(res!=null){
            for(Book book : res) {
                System.out.println(book.getAuthor().getAuthorName() + " " + book.getTitle());
            }
        }
    }
}

//5

// 101
// Agatha Christie
// 11
// Murder on the Orient Express
// Crime
// 20.00

// 102
// Arthur conan doyle
// 12
// The Hound of the Baskervilles
// Crime
// 25.00

// 103
// Stephen Edwin King
// 13
// A Memoir of the Craft
// Horror
// 40.00
// Cayton Emery

// 14
// The Burning Goddess
// Fantasy
// 30.00
// 105
// Trisha Ashley
// 15
// Wedding Tiers
// Fantasy
// 35.00
// Crime
// Fantasy
// 20


//5
//101
//Agatha Christie
//11
//Murder on the Orient Express
//Crime
//20.00
//102
//Arthur conan doyle
//12
//The Hound of the Baskervilles
//Crime
//25.00
//103
//Stephen Edwin King
//13
//A Memoir of the Craft
//Horror
//40.00
//Cayton Emery
//14
//The Burning Goddess
//Fantasy
//30.00
//105
//Trisha Ashley
//15
//Wedding Tiers
//Fantasy
//35.00
//Crime


