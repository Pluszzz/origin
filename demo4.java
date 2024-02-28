import java.util.Scanner;

public class demo4 {
    /********* Begin *********/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username = sc.next();
        sc.close();
        //判断用户名
        try{
          if(username.length()<3){
              throw new MyException();
          }
          System.out.println("用户名格式正确");
        }catch(Exception e){
            ((MyException) e).show();
        }
            
    }
}

class MyException extends Exception{
    public void show(){
        System.out.println("用户名小于三位");
    }
}

