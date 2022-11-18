package New;

class Cat {
    public int a=10;
    public int b=20;
    public void show(){
        System.out.println(a+" "+b);
    }
}
public class Rat extends Cat{
    public int c=30;
    public static void main(String[] args) {
        Rat mm=new Rat();
        mm.show();
        System.out.println(mm.a+" "+mm.b+" "+mm.c);
    }
}

  
