package New;
import java.util.*;

public class Bookinfo {
    //dataType [] array name= new dataType[5];
    static Book [] arr=new Book[3];
    public static void displayAll(){
        System.out.println("All book Information");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i].ISBN);
            System.out.println(arr[i].bookTitle);
            System.out.println(arr[i].numberOfPage);
        }
    }
    public static int compareTo(int newBookPageNumber){
        if(arr[0].numberOfPage==newBookPageNumber)
        return 0;
        else if(arr[0].numberOfPage>newBookPageNumber)
        return 1;
        else return -1;
    }
    public static boolean isHeavier(int newBookPageNumber){
        if(newBookPageNumber>500)
        return true;
        else return false;
    }
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            int ISBN=a.nextInt();
            String bookTitle=a.next();
            int numberOfPage=a.nextInt();
            arr[i]=new Book(ISBN,bookTitle,numberOfPage); 
        }
        System.out.println("Enter the new book page numbers");
        int newBookPageNumber= a.nextInt();
        
        System.out.println("OUTPUT");
        System.out.println(isHeavier(newBookPageNumber));
        System.out.println(compareTo(newBookPageNumber));
        displayAll();
        

    }
}
