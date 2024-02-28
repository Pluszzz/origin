import java.util.Arrays;
import java.util.Scanner;

class ArrayUtils{
    public static double findMax(double[] arr,int begin, int end)throws IllegalArgumentException{
        double[] arr1 = new double[end-begin+1];
        //将数组arr中在下标begin到end（不包括end）的元素复制到数组arr1中
        System.arraycopy(arr,begin,arr1,0,end-begin);
        Arrays.sort(arr1);   //将数组arr1中的元素升序排序
        return arr1[arr1.length-1];   //返回最后一个元素（最大值）
    }
public class demo1 {
  public void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            while(true){
                try {
                    String begin = sc.next();
                    int a = Integer.parseInt(begin);
                    String end = sc.next();
                    int b = Integer.parseInt(end);
                    if(a<0 || b>n) {
                        if (a < 0) {
                            System.out.println("java.lang.IllegalArgumentException: begin:" + a + " < 0");
                        }
                        if (b > n) {
                            System.out.println("java.lang.IllegalArgumentException: end:" + b + " > arr.length");
                        }
                    }
                    else if(a>=b)
                        System.out.println("java.lang.IllegalArgumentException: begin:" + a + " >= end:" + b);
                    else {
                        //将int型数组arr转换为double型，并调用ArrayUtils.findMax方法
                        double[] arr2 = new double[n];
                        for(int i=0;i<n;i++){
                            arr2[i] = arr[i];
                        }
                        System.out.println(ArrayUtils.findMax(arr2, a, b));
                    }
                }catch (Exception e){  //输入异常，跳出循环
                    break;
                }
            }
        }
        //打印标识信息
        try {
            System.out.println(ArrayUtils.class.getDeclaredMethod("findMax", double[].class,int.class,int.class));
        } catch (Exception e1) {
        }
    }
}
}

    
