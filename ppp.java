import java.util.*;
public class ppp{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String st1=sc.next();
      int i1=sc.nextInt();
      String st2=sc.next();
      int i2=sc.nextInt();
      String st3=sc.next();
      Student s1= new Student(st1,i1);
      Undergraduate u1= new Undergraduate(st2,i2,st3);
      s1.show();
      u1.show();
      sc.close();
      
    
  }  
}
class Student{
    protected String name;
    protected int age;
    public void setname(String name){
        this.name=name;
    }
    public void setage(int age){
        this.age=age;
    }
    public Student(String name,int age){
        this.name=name;
        this.age=age;        
    }
    public void show(){
        System.out.printf("Student[name="+name+",age="+age+']');  
    }
    
}
class Undergraduate extends Student{
    private String major;
    public Undergraduate(String name,int age,String major){
        super(name,age);
        this.major=major;
    }
     public void show(){
        System.out.print("Undergraduate[name="+name+",age="+age+",major="+major+']');  
    }
}

