package Day04;

public class Books {

    String Author;
    String Bookname;
    int pagesnamber=230;
    String introduce;
    public Books(String author, String bookname, String introduce, int pagesnamber){
        this.Author=author;
        this.Bookname=bookname;
        this.introduce=introduce;
        this.pagesnamber=pagesnamber;

    }
    public static void main(String[] args){


        Books books=new Books("Victor Hugo ","Missiribe","best seller",12);
        System.out.println("Author name: "+books.Author);
        System.out.println("book name: "+books.Bookname);
        System.out.println("book introduce: "+books.introduce);
        System.out.println("Book pages number: "+books.pagesnamber);
        String Author= books.Author;

        System.out.println(Author.toUpperCase());
        System.out.println(Author.repeat(3));
    }

}