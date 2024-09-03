public class Book {
    static int totalNoOfBook;
    String isbn;
    String author;
    String title;

    boolean isBorrow=false;

    static {
        totalNoOfBook=0;
    }
    {
        totalNoOfBook++;
    }
    Book(String isbn,String author,String title){
        this.isbn=isbn;
        this.author=author;
        this.title=title;
    }

    Book(String isbn){
        this(isbn,"unknown","unknown");
    }
    public static int getTotalNoOfBook(){
        return totalNoOfBook;
    }
    public void bookBarrow(){
        if(isBorrow){
            System.out.println("Book is already Barrow Try another book");
        }
        else{
            System.out.println("Enjoy this book wahhhhhh");
            isBorrow=true;
        }
    }
    public void  returnBook(){
        if(isBorrow){
            isBorrow=false;
            System.out.println("Thank You Return This book");
        }
        else{
            System.out.println("Book is already in library");
        }
    }

    public static void main(String[] args){
        Book b1 = new Book("1224434545","Henry","The Witcher");
        Book b2 = new Book("8337293555","Deepak","Game of throne");
        System.out.println("Total Number of book is : "+Book.getTotalNoOfBook());
        b1.bookBarrow();
        b2.bookBarrow();
        b1.returnBook();
        b1.returnBook();
        b2.returnBook();

    }

}
