//编写一段代码，读入一个整数值，并显示它的绝对值
package Chap03;

import java.util.Scanner;

//public class test3_1 {
//    public static void main(String[] args) {
//        Scanner stdIn = new Scanner(System.in);
//        System.out.println("整数值：");
//        int n = stdIn.nextInt();
//        int a = (-n);
//        if (n > 0)
//            System.out.println("其绝对值为：" + n);
//        else if (n == 0)
//            System.out.println("其绝对值为：" + n);
//        else
//            System.out.println("其绝对值为：" + a);   //需要加+作为连接
//    }
//}


//public class test3_2 {
//    public static void main(String[] args) {
//        Scanner stdIn = new Scanner(System.in);
//        System.out.println("整数A："); int a = stdIn.nextInt();
//        System.out.println("整数B："); int b = stdIn.nextInt();
//
//        if ((a % b) == 0)       //`%` 是取模运算符，也称为求余运算符。它返回除法操作的余数
//            System.out.println("a是b的约数");
//        else
//            System.out.println("a不是b的约数");
//    }
//}
////在Java中，`%` 是取模运算符，也称为求余运算符。它返回除法操作的余数。例如：
////
////- `a % b` 表示将a除以b，并返回余数。
////- 如果a可以被b整除，则结果为0。
////- 如果a不能被b整除，则结果为a除以b的余数。
////
////例如，`12 % 4` 的结果是0，因为12可以被4整除，没有余数；而 `13 % 4` 的结果是1，因为13除以4的余数是1。


// public class test3_1 {
//     public static void main(String[] args) {
//         //这是Java程序的入口点。所有的Java程序都必须包含一个 main 方法，它是程序的起点。
//         // public 表示该方法是公共的，static 表示它属于类而不是对象，void 表示该方法不返回任何值，String[] args 表示该方法接受一个字符串数组作为参数。
//         Scanner stdIn = new Scanner(System.in);
//         System.out.print("整数值：");
//         int n = stdIn.nextInt();

//         if (n > 0)
//             System.out.println("该值为正。");
//         else if (n < 0)
//             System.out.println("该值为负。");
//         else if (n == 0)
//             System.out.println("该值为0。");
//     }
// }

//读入两个变量a、b的值，显示a更大，b更大，a和b一样大


//public class test3_4 {
//    public static void main(String[] args) {
//        Scanner stdIn = new Scanner(System.in);
//        System.out.println("整数值a："); int a = stdIn.nextInt();
//        System.out.println("整数值b："); int b = stdIn.nextInt();
//
//        if (a > b)
//            if (a == b)
//                System.out.println("a和b一样大");
//            else
//                System.out.println("a更大");
//        else
//            System.out.println("b更大");
//    }
//}


////读入一个正整数值，如果它可以被5整除，则显示“该值可以被5整除。”，否则显示“该值不可以被5整除。”
////当读入非正值时，显示“输入的不是正值”
//public class test3_4 {
//    public static void main(String[] args) {
//        Scanner stdIn = new Scanner(System.in);
//        System.out.println("整数值："); int a = stdIn.nextInt();
//
//        if (a > 0)
//            if ((a % 5) == 0)
//                System.out.println("该值可以被5整除。");
//            else
//                System.out.println("该值不可以被5整除");
//        else
//            System.out.println("输入的不是正值");
//    }
//}


////读入一个正整数值，如果它是10的倍数，则显示“该值是10的倍数。”，否则显示“该值不是10的倍数。”
////当读入非正值时，显示“输入的不是正值”
//public class test3_4 {
//    public static void main(String[] args) {
//        Scanner stdIn = new Scanner(System.in);
//        System.out.println("整数值："); int a = stdIn.nextInt();
//
//        if (a > 0)
//            if ((a % 10) == 0)
//                System.out.println("该值是10的倍数。");
//            else
//                System.out.println("该值不是10的倍数");
//        else
//            System.out.println("输入的不是正值");
//    }
//}


//读入一个正整数值，根据其除以3得到的值，则显示“该值可以被3整除。”“该值除以3余1。”或“该值除以3余2”
//当读入非正值时，显示“输入的不是正值”
public class test3_1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("整数值："); int a = stdIn.nextInt();

        if (a > 0)
            if ((a % 3) == 0)
                System.out.println("该值可以被3整除。");
            else if((a % 3) == 1)
                System.out.println("该值除以3余1");
            else
                System.out.println("该值除以3余2");
        else
            System.out.println("输入的不是正值");
    }
}
