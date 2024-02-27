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
//public class Min2 {
//    public static void main(String[] args) {
//        Scanner stdIn = new Scanner(System.in);
//        System.out.println("整数a:"); int a = stdIn.nextInt();
//        System.out.println("整数b:"); int b = stdIn.nextInt();
//
//        int min = a < b ? a : b;        // 较小的值 条件运算符，是唯一的三元运算符
//        System.out.println("较小的值为" + min + "。");
//    }
//}
//条件表达式
//表达式1 ？ 表达式2 ：表达式3
//首先对表达式1求值。
//如true，该表达式值为表达式2的值
//如false，该表达式值为表达式3的值


////计算三个整数值中的最大值
//public class Min2 {
//    public static void main(String[] args) {
//        Scanner stdIn = new Scanner(System.in);
//        System.out.println("整数a:"); int a = stdIn.nextInt();
//        System.out.println("整数b:"); int b = stdIn.nextInt();
//        System.out.println("整数c:"); int c = stdIn.nextInt();
//
//        int max = a;
//        if (b > max) max = b;
//        if (c > max) max = c;
//        System.out.println("最大值为" + max + "。");
//    }
//}
//像这样定义处理流程的规则称为算法


////计算三个整数值中的最小值
//public class Min2 {
//    public static void main(String[] args) {
//        Scanner stdIn = new Scanner(System.in);
//        System.out.println("整数a:"); int a = stdIn.nextInt();
//        System.out.println("整数b:"); int b = stdIn.nextInt();
//        System.out.println("整数c:"); int c = stdIn.nextInt();
//
//        int min = a;
//        if (b < min) min = b;
//        if (c < min) min = c;
//        System.out.println("最大值为" + min + "。");
//    }
//}


//计算三个整数值中的中间值
public class Min2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("整数a:"); int a = stdIn.nextInt();
        System.out.println("整数b:"); int b = stdIn.nextInt();
        System.out.println("整数c:"); int c = stdIn.nextInt();

        int median;
        // 情况1: a 是中间值
        if ((a >= b && a <= c) || (a <= b && a >= c))
            median = a;
            // 情况2: b 是中间值
        else if ((b >= a && b <= c) || (b <= a && b >= c))
            median = b;
            // 情况3: c 是中间值
        else
            median = c;
        System.out.println("中间值为 " + median + "。");
    }
}
