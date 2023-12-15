package Main;
import java.util.ArrayList;
import java.util.Scanner;

public class Hw {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList<Book>arrBook=new ArrayList<>();

        Book book=new Book();
        book.setId("1234");
        book.setTitle("Huhu");
        book.setAuthor("Khue");
        book.setCategory("action");
        book.setPublisher("Khue");
        book.setYear(2023);

        arrBook.add(book);

        System.out.println(showInfo(book));

        System.out.println("Nhập tên sách cần tìm");
        String findTitle= sc.nextLine();
        for (int i=0;i<arrBook.size();i++){
            if (arrBook.get(i).getTitle().equalsIgnoreCase(findTitle))
                System.out.println(arrBook.get(i));
        }
        System.out.println("Nhập thể loại sách cần tìm");
        String findCategory= sc.nextLine();
        for (int i=0;i<arrBook.size();i++){
            if (arrBook.get(i).getCategory().equalsIgnoreCase(findCategory))
                System.out.println(arrBook.get(i));
        }
        System.out.println("Sách được suất bản trong năm nay là: ");
        for (int i=0;i<arrBook.size();i++){
            if (arrBook.get(i).getYear()==2023)
                System.out.println(arrBook.get(i));
        }
    }
    public static String showInfo(Book book){
        return book.toString();
    }
}
