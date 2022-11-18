package New;

public class employees {
    private String ID;
    private String Name;
    private int Age;
    private String Gander;
    private float Salary;
    employees(String ID,String Name,int Age,String Gander,float Salary){
        this.ID=ID;
        this.Name=Name;
        this.Age=Age;
        this.Gander=Gander;
        this.Salary=Salary;
    } 
    public String getID() {
        return ID;
    }
    public String getName() {
        return Name;
    }
    public int getAge() {
        return Age;
    }
    public String getGander() {
        return Gander;
    }
    public float getSalary() {
        return Salary;
    }
    public void setID(String ID) {
        this.ID = ID;
    }
    public void setName(String Name) {
        this.Name = Name;
    }
    public void setAge(int Age) {
        this.Age = Age;
    }
    public void setGander(String Gander) {
        this.Gander = Gander;
    }
    public void setSalary(float Salary) {
        this.Salary = Salary;
    }


    public boolean equals(employees e){
        if(e.getID().equals(this.getID())){
            if(e.getName().equals(this.getName())){
                if(e.getAge()==this.getAge()){
                    if(e.getGander().equals(this.getGander())){
                        if(e.getSalary()==this.getSalary()){
                            return true;
                        }
                        else return false;
                        
                    }
                    else return false;
 
                }
                else return false;
            }
            else return false;
            
        }
        else return false;
        
        
    }
    



    public static void main(String[] args) {
        
    }

}
