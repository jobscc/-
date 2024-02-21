package Chap03;

import java.util.Scanner;


//逻辑与 && 并且              判断读入的整数值的位数（0/1位/2位以上）
//public class DigitsNo1 {
//    public static void main(String[] args) {
//        Scanner stdIn = new Scanner(System.in);
//        System.out.println("整数值：");
//        int n = stdIn.nextInt();
//        if (n == 0)
//            System.out.println("是0。");              //0
//        else if (n >= -9 && n <= 9)
//            System.out.println("是1位数值。");         //1位
//        else
//            System.out.println("是2位以上的数值。");    //2位以上
//    }
//}


////逻辑或 ||               判断读入的整数值的位数（是否是2位以上）
//public class DigitsNo1 {
//    public static void main(String[] args) {
//        Scanner stdIn = new Scanner(System.in);
//        System.out.println("整数值：");
//        int n = stdIn.nextInt();
//        if (n <= -10 || n >= 10)
//            System.out.println("是2位以上的数值");
//        else
//            System.out.println("是不足2位的数值。");
//    }
//}


//显示读入的月份所在的季节
public class DigitsNo1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("计算季节。\n请输入月份：");
        int month = stdIn.nextInt();
        if (month >= 3 && month <= 5)
            System.out.println("这是春天");
        else if (month >= 6 && month <= 8)
            System.out.println("这是夏天");
        else if (month >= 9 && month <= 11)
            System.out.println("这是秋天");
        else if (month == 12 || month == 2 || month == 1)
            System.out.println("这是冬天");
    }
}
