import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        /********* Begin *********/
        try{
            if(num2==0){
                sc.close();
                throw new eee();}
            System.out.println(num1/num2);
            //throw eee e;
           // else 
            //    System.out.println("除数不能为0");
        }catch(Exception e){
            //System.out.println("除数不能为0");
            
            ((eee) e).show();
            
        }
        sc.close();
        /********* End *********/
    }
}
class eee extends Exception{
    public void show(){
        System.out.printf("除数不能为0");
    }
}
