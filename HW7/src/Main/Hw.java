package Main;
import java.util.ArrayList;
import java.util.Scanner;

public class Hw {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        ArrayList<Book>arrBook=new ArrayList<>();

        Book book1=new Book("a1","b1","c1","d1","e1",2022);
        Book book2=new Book("a2","b2","c2","d2","e2",2023);
        Book book3=new Book("a3","b3","c3","d3","e3",2023);

        arrBook.add(book1);
        arrBook.add(book2);
        arrBook.add(book3);

        for (int i=0; i<arrBook.size(); i++){
            System.out.println(arrBook.get(i));
        }

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
}
