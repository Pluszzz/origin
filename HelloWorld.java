import java.util.Scanner;
public class HelloWorld {
    public static void main(String args[]) {
        
            Scanner input = new Scanner(System.in);
            String[] s = new String[3];// 保存3次划拳的结果
            String in;
            int i, j, k = 0; // i：保存A的输入 j：保存B的输入 k：循环变量
            while (true) {
                System.out.println("第" + (k + 1) + "轮,最多3轮，请输入玩家A的选择：1、石头 2、剪刀 3、布：");
                in = input.nextLine();
                try {
                    if (in != "1" && in != "2" && in != "3")
                        throw new ErrorInputException();
                } catch (ErrorInputException e) {
                    e.printStackTrace();
                }
                i = Integer.parseInt(in);
                // 保存A的选择，如果A输入的不是1、2、3，抛出一个自定义输入错误异常。
                System.out.println("第" + (k + 1) + "轮，最多3轮，请输入玩家B的选择：1、石头 2、剪刀 3、布：");
                in = input.nextLine();
                // switch (in) {
                //     // 保存A的选择，如果A输入的不是1、2、3，抛出一个自定义输入错误异常。
                // }
                try {
                    if (in != "1" && in != "2" && in != "3")
                        throw new ErrorInputException();
                } catch (ErrorInputException e) {
                    e.printStackTrace();
                }
                j = Integer.parseInt(in);
                String s1 = "/";
                if(i==j) s1="get a draw";
                else if((i==1&&j==3)||(i-j==-1)) s1="A win";
                else s1="B win";
                // 判断游戏胜负，并将结果输出到字符串对象S1，A赢了保存为"A win"，B赢了保存为"B win"，平局保存为"get a draw".
                // 输出判断的结果；
                try{
                    s[k] = s1;// 这里会发生数组越界异常。
                }catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("数组越界");
                }
                if(k>=3) break;
                k++;
            }
            input.close();
            System.out.println("scanner closed");
            System.out.println("每局比分：" + s[0] + "  " + s[1] + "  " + s[2]);
       
    }
    }
