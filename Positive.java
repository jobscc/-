package Chap03;
import java.util.Scanner;

//读入的整数值是正值吗？   if-then语句
//class Positive {
//    public static void main(String[] args)  {
//        Scanner stdIn = new Scanner(System.in);
//        System.out.print("整数值：");
//        int n = stdIn.nextInt();
//        if (n > 0)
//            System.out.println("该值为正。");    //n>0为true时执行
//    }
//}


////读入的整数值是正值还是非正值呢？        if-then-else语句
//class Positive {
//    public static void main(String[] args)  {
//        Scanner stdIn = new Scanner(System.in);
//        System.out.print("整数值：");
//        int n = stdIn.nextInt();
//        if (n > 0)
//            System.out.println("该值为正。");    //n>0为true时执行
//        else
//            System.out.println("该值为0或负。");
//    }
//}


//读入的两个整数值相等吗？      相等运算符 ==  !=
class Positive {
    public static void main(String[] args)  {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("整数值a："); int a = stdIn.nextInt();  //首先提示信息 "整数值a：", 然后通过 stdIn.nextInt() 方法从标准输入读取一个整数值，并将其存储在变量 a 中。
        System.out.print("整数值b："); int b = stdIn.nextInt();  //也就是

        if (a == b)
            System.out.println("两个值相等");    //n>0为true时执行
        else
            System.out.println("两个值不相等");

//        if (a != b)
//            System.out.println("两个不相等");
//        else
//            System.out.println("两个相等");
    }
}

