#define _CRT_SECURE_NO_WARINGS 1

#include <stdio.h>

int main() 
{
    // printf("%d\n", sizeof(char*));
    // printf("%d\n", sizeof(short*));
    // printf("%d\n", sizeof(int*));
    // printf("%d\n", sizeof(double*));
    
    // double d = 3.14;
    // double* pd = &d;
    // printf("%d\n", sizeof(pd));//32位平台4字节，64位平台8字节
    // *pd = 5.5;
    // printf("%lf\n", d);
    // printf("%lf\n", *pd);
 
    // int a = 10;//4个字节
    // // printf("%p\n",&a);
    // int* p = &a;//p是一个变量-指针变量
    // // printf("%p\n", p);
    // *p = 20; //p被禁用，变成了a。所以操作的是a不是p，所以20 = a
    return 0;
}

// int main() 
// {
//     int a = 10;//4个字节
//     int* p = &a;//取地址
//     // 有一种变量是用来存放地址的-指针变量（指针变量是用来存放地址的,这个地址是别人的）
//     // printf("%p\n",&a);
//     // printf("%p\n",p);
//     *p = 20;//* - 解引用操作符/间接访问操作符
//     printf("a = %d\n", a);
//     return 0;
// }


// int num = 10;
// &num;//取出num的地址 
// 注:这里num的4个字节，每个字节都有地址，取出的是第一个字节的地址(较小的地址) 
// printf("%p\n", &num);//打印地址，%p是以地址的形式打印
// return 0;


// #include <stdio.h>
// int main() 
// {
//     int num1 = 0;
//     int num2 = 0;
//     int sum = 0; printf("输入两个操作数:>"); 
//     scanf("%d %d", &num1, &num2); 
//     sum = num1 + num2; 
//     printf("sum = %d\n", sum); 
//     return 0;
// }


// #include <stdio.h>
// // #include <stdio.h>
// int global = 2019;//全局变量 
// int main()
// {
//     int local = 2018;//局部变量 
//     //下面定义的global会不会有问题?
//     int global = 2020;//局部变量 
//     printf("global = %d\n", global); 
//     return 0;
// }


// #include <stdio.h>
// int main()
// {
//     printf("%d\n", sizeof(char));
//     printf("%d\n", sizeof(short));
//     printf("%d\n", sizeof(int));
//     printf("%d\n", sizeof(long));
//     printf("%d\n", sizeof(long long));
//     printf("%d\n", sizeof(float));
//     printf("%d\n", sizeof(double));
//     printf("%d\n", sizeof(long double));
//     return 0;
// }


// int main()
// {
//     printf("hehe\n");
//     return 0;
// }