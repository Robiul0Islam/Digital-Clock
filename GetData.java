package New;
import java.util.*;

public class GetData {
    static StudentData[] arr=new StudentData[3];
    public static void search(String newName){
        for(int i=0;i<arr.length;i++){
            if(arr[i].name.equals(newName)){
                System.out.println(arr[i].name);
                System.out.println(arr[i].dep);
                System.out.println(arr[i].age);
            }
        }
    }
    
    
    
    public static void main(String[] args) {
       Scanner a=new Scanner(System.in);
       System.out.println("Enter the Name,Depertment and age");
       for(int i=0;i<3;i++){
           
            String name=a.next();
            String dep=a.next();
            int age=a.nextInt();
            arr[i]=new StudentData(name,dep,age);
       } 
      

       System.out.println("**** Information *** ");
      
    //    for(int i=0;i<arr.length;i++){
    //     System.out.println(arr[i].name);
    //     System.out.println(arr[i].dep);
    //     System.out.println(arr[i].age);
    //    }
    String newName=a.next();   
    System.out.println("Output");
      
       search(newName);
       
    }
}
