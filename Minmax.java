package Chap03;

import java.util.Scanner;

////计算两个整数值中较小的值和较大的值
//public class Minmax {
//    public static void main(String[] args) {
//        Scanner stdIn = new Scanner(System.in);
//        System.out.println("整数a:"); int a = stdIn.nextInt();
//        System.out.println("整数b:"); int b = stdIn.nextInt();
//
//        int min, max;
//        if (a < b) {
//            min = a;
//            max = b;
//        }else {
//            min = b;
//            max = a;
//        }
//        System.out.println("较小的值是" + min + ".");
//        System.out.println("较大的值是" + max + ".");
//    }
//}


////将两个变量按升序进行排序
//public class Minmax {
//    public static void main(String[] args) {
//        Scanner stdIn = new Scanner(System.in);
//        System.out.println("变量a:"); int a = stdIn.nextInt();
//        System.out.println("变量b:"); int b = stdIn.nextInt();
//
//        if (a > b) {
//            int t = a;
//            a = b;
//            b = t;
//        }
//        System.out.println("排序成a<=b。");
//        System.out.println("变量a是" + a + ".");
//        System.out.println("变量b是" + b + ".");
//    }
//}
//当a>b, 交换a和b的值
//当a<=b,什么都不做

//只有在程序块中使用的变量可以在该程序块中进行声明


////test 读入两个整数值，显示其中较小的值和较大值。不过若两个整数值相等，显示“两个值相等”
//public class Minmax {
//    public static void main(String[] args) {
//        Scanner stdIn = new Scanner(System.in);
//        System.out.println("变量a:"); int a = stdIn.nextInt();
//        System.out.println("变量b:"); int b = stdIn.nextInt();
//
//        if (a > b) {
//            System.out.println("较大值" + a + ".");
//            System.out.println("较小值" + b + ".");
//        }
//        else if(a < b) {
//            System.out.println("较大值" + b + ".");
//            System.out.println("较小值" + a + ".");
//        }
//        else
//        System.out.println("两个值相等");
//    }
//}


//test 读入两个整数值降序排序
public class Minmax {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("变量a:"); int a = stdIn.nextInt();
        System.out.println("变量b:"); int b = stdIn.nextInt();

        if (a < b) {
            int t = a;
            a = b;
            b = t;
        }
        System.out.println("按降序排列a>=b:" + a + b );
    }
}