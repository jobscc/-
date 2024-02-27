package Chap03;
import java.util.Scanner;

//条件运算符 读入两个值，不显示较小的值
//显示读入的两个整数值中较小的值 （if语句）
//public class Min2 {
//    public static void main(String[] args) {
//        Scanner stdIn = new Scanner(System.in);
//        System.out.println("整数a:"); int a = stdIn.nextInt();
//        System.out.println("整数b:"); int b = stdIn.nextInt();
//
//        int min;    //较小的值
//        if (a < b)
//            min = a;
//        else
//            min = b;                                    //如果a=b，则min=b
//        System.out.println("较小的值为" + min + "。");
//    }
//}


//显示读入的两个整数值中较小的值（条件运算符）
public class Min2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("整数a:"); int a = stdIn.nextInt();
        System.out.println("整数b:"); int b = stdIn.nextInt();

        int min = a < b ? a : b;        // 较小的值 条件运算符，是唯一的三元运算符
        System.out.println("较小的值为" + min + "。");
    }
}
//条件表达式
//表达式1 ？ 表达式2 ：表达式3
//首先对表达式1求值。
//如true，该表达式值为表达式2的值
//如false，该表达式值为表达式3的值