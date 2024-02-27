//读入两个变量a、b的值，显示a更大，b更大，a和b一样大

package Chap03;
import java.util.Scanner;

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
public class test3_4 {
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