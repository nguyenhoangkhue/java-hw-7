package Main;
import java.time.LocalDate;
import java.util.Scanner;

public class Hw {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Book book=new Book();
        book.setId("1234");
        book.setTitle("Huhu");
        book.setAuthor("Khue");
        book.setCategory("action");
        book.setPublisher("Khue");
        book.setYear(2023);

        while (true){
            System.out.println("Book management");
            System.out.println("Enter 1: To search books by title");
            System.out.println("Enter 2: To search books by category");
            System.out.println("Enter 3: To list books published this year");
            String line= sc.nextLine();
            switch (line){
                case "1":{
                    System.out.println("Enter title: ");
                    String title=sc.nextLine();
                    if (title==Title(book)){
                        System.out.println(showInfo(book));
                        break;
                    } else {
                        System.out.println("Invalid");
                    }
                    break;
                }
                case "2":{
                    System.out.println("Enter category: ");
                    String category=sc.nextLine();
                    if (category==Category(book)){
                        System.out.println(showInfo(book));
                        break;
                    }else {
                        System.out.println("Invalid");
                    }
                    break;
                }
                case "3":{
                    if (book.getYear()==2023){
                        System.out.println(showInfo(book));
                        break;
                    }else {
                        System.out.print("");
                    }
                    break;
                }
                default:{
                    System.out.println("Invalid");
                    break;
                }
            }
        }
    }
    public static String showInfo(Book book){
        return book.toString();
    }
    public static String Title(Book book){
        return book.getTitle();
    }
    public static String Category(Book book){
        return book.getCategory();
    }
}
