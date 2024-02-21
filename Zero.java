package Chap03;

import java.util.Scanner;

//读入的整数值是0吗？ 逻辑非运算符！
//class  Zero {
//    public  static void main(String[] args) {
//        Scanner stdIn = new Scanner(System.in);
//        System.out.println("整数值："); int a = stdIn.nextInt();
//
////        if (a != 0)
////            System.out.println("不是0");
////        else
////            System.out.println("是0");
//        if (!(a != 0))                  //！逻辑非运算符，把结果反转 //!(a != 0)   ==   (a == 0)
//            System.out.println("是0");
//        else
//            System.out.println("不是0");
//    }
//}


////嵌套的if语句   判断读入的整数值的符号（正/符/0）并显示判断结果
//import java.util.Scanner;
//class Zero {
//    public static void main(String[] args) {
//        //这是Java程序的入口点。所有的Java程序都必须包含一个 main 方法，它是程序的起点。
//        // public 表示该方法是公共的，static 表示它属于类而不是对象，void 表示该方法不返回任何值，String[] args 表示该方法接受一个字符串数组作为参数。
//        Scanner stdIn = new Scanner(System.in);
//        System.out.print("整数值：");
//        int n = stdIn.nextInt();
//
//        if (n > 0)
//            System.out.println("该值为正。");
//        else if (n < 0)
//            System.out.println("该值为负。");
//        else
//            System.out.println("该值为0。");
//    }
//}


//如果读入的整数值为正值，值判读其为偶数还是奇数，并显示判断结果
class Zero {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("整数值：");
        int n = stdIn.nextInt();

        if (n > 0)
            if (n % 2 == 0)
                System.out.println("该值为偶数。");
            else
                System.out.println("该值为奇数。");
        else
            System.out.println("输入的值不是正值。");
    }
}