#define _CRT_SECURE_NO_WARINGS 1

#include <stdio.h>

//结构体
//描述人：名字+身高+年龄+身份证号码
//c语言描述复杂对象 -- 用结构体 --我们自己创造出来的一种类型
//.     结构体变量.成员
//->    结构体指针->成员

struct Book //用大括号把描述书的属性括起来
{
    char name[20];//c语言程序设计
    short price;//55
};//“;”不可缺少，用于结束关于book的定义

int main()
{
    //利用结构体类型 - 创建一个该类型的结构体变量
    struct Book b1 = {"c语言程序设计",55};
    struct Book* pb = &b1;
    //"struct Book* "是一个指针类型，这个指针类型定义了一个变量pb,指针变量pb指向b1
    //利用pb打印出我的书名和价格
    printf("%s\n", pb->name);//"->"箭头操作符，可以更加明确直观的
    printf("%d\n", pb->price);

    // printf("%s\n", (*pb).name);
    // printf("%d\n", (*pb).price);

    // printf("书名:%s\n", b1.name);//"b1."这个点.是个操作符，相当于挑选的作用
    // printf("价格:%d\n", b1.price);
    // b1.price = 15;
    // printf("修改后的价格:%d\n", b1.price);
    return 0;
}

// //"b1.name"这个name是数组名，数组名本质上是一个地址
// struct Book b1 = {"C语言程序设计", 55};
// strcpy(b1.name, "C++");//strcpy-string copy -字符串拷贝-库函数-需要用头文件(string.h)
// printf("%s\n, b1.name");
// //字符串name更改的方法