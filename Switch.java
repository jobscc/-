package Chap03;
import java.util.Scanner;

////if语句与switch语句对比
//public class Switch {
//    public static void main(String[] args) {
//        Scanner stdIn = new Scanner(System.in);
//        System.out.println("请选择手势（0...石头/1...剪刀/2...布）：");
//        int hand = stdIn.nextInt();
//
//////if语句
////        if (hand == 0)
////            System.out.println("石头");
////        else if (hand == 1)
////            System.out.println("剪刀");
////        else if (hand == 2)
////            System.out.println("布");
//
//        //switch语句
//        switch (hand) {
//            case 0: System.out.println("石头");break;
//            case 1: System.out.println("剪刀");break;
//            case 2: System.out.println("布");break;      //跳出switch语句
//        }
//    }
//}


//进一步理解switch语句和break语句的作用
public class Switch {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("整数：");
        int n = stdIn.nextInt();


        //switch语句
        switch (n) {
            case 0:
                System.out.println("A");
                System.out.println("B");
                break;
            case 2:
                System.out.println("C");
            case 5:
                System.out.println("D");
                break;
            case 6:
            case 7:
                System.out.println("E");
                break;
            default:                        //表示与任何一个标签都不一致时的跳转位置的标签
                System.out.println("F");
                break;
        }
        System.out.println();
    }
}