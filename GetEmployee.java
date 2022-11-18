package New;
import java.util.*;

public class GetEmployee {
    public static employees[] arr=new employees[2];
    public static int n=0;

    public static boolean aleadyExist(employees e){
        if(n==0){
            return false;
        }
        else 
        {
            for(int i=0;i<n;i++){
                if(arr[i].equals(e)){
                    return true;
                }
            }
        }
        return false;
    }
    public static void searchBy(String newGander){
        for(int i=0;i<arr.length;i++){
            if(newGander.equals(arr[i].getGander())){
            System.out.println(arr[i].getID());
            System.out.println(arr[i].getName());
            System.out.println(arr[i].getAge());
            System.out.println(arr[i].getGander());
            System.out.println(arr[i].getSalary());

            }
        }
    }
    public static void updateSalary(){
        for(int i=0;i<arr.length;i++){
            arr[i].setSalary((float)(arr[i].getSalary()+arr[i].getSalary()*.15));
        }
        System.out.println("After Update");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i].getSalary());
        }
    }
    
    public static void main(String[] args) {
        Scanner a=new Scanner(System.in);
        System.out.println("Enter the information for array");
        for(int i=0; ;i++){
            System.out.println("press 0 for exit");
            System.out.println("press 1 to continue");
            int x=a.nextInt();
            if(x==0){
                break;
            }
            else{
            String ID=a.next();
            String Name=a.next();
            int Age=a.nextInt();
            String Gander=a.next();
            float Salary=a.nextFloat();
            employees e=new employees(ID, Name, Age, Gander, Salary);
            if(!aleadyExist(e))
            arr[n++]=e;
            
            }
        }

        for(int i=0;i<n;i++){
            System.out.println(arr[i].getID());
            System.out.println(arr[i].getName());
            System.out.println(arr[i].getAge());
            System.out.println(arr[i].getGander());
            System.out.println(arr[i].getSalary());
        }
        System.out.println("Enter a Gender");
        String newGander=a.next();
        searchBy(newGander);
        updateSalary();
        
        

        

    }
}
