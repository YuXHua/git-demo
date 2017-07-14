package com.company;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
/**
 *由于我是前面学过java的，所以这一周的代码是自己根据学习计划里面来写的，主要分为四个板块，main函数板块主要是对常量的声明，
   以及各个变量的声明以及对C函数，Pi函数，D函数的调用。
 *C函数中，主要是将if语句ifelse语句，switch语句以及for循环语句等流程语句的功能体现出来，以及部分运算符与break语句和
   return语句的运用，此函数没有什么目标，就是将语句体现出来
 *Pi函数一个书上的例子，我这里将其敲下来，是主要展现do..while语句的用法
 *D函数是一个求最大公约数的函数，主要是体现出while语句与部分逻辑运算符
 *由于本次代码是为了体现出本周应该包含的内容，所以有些声明的变量没有用到，因此而产生的警告就忽略不管了。
 */
import java.util.*;
public class Demo {
    public static final int ENTER_NUM = 10;//声明常量
    public static void main(String[] args) {
        //基本数据类型
        //以下是对各个变量类型的声明
        byte a;
        short b;
        int c;
        long d;
        float e;
        double f;
        char h='A';
        boolean g=true;
        System.out.printf("pi=%.6f",Pi());
         C();//调用C函数
         D();//调用D函数
    }
    public static void C() {
        int c;
        Scanner in = new Scanner(System.in);//创建scanner类对象
        c = in.nextInt();//输入c
        //以下将会涉及到部分算术运算符及部分流程语句
        if (c <= 0) {//if语句判断c的范围
            switch (c / -10) {//if..else语句里面嵌套了switch语句与if语句，算术运算符
                case 0:
                    System.out.printf("这是-9~0之间的数字");
                    break;//如若执行了上一条语句后，本条语句将执行中断switch语句块的功能
                case 1:
                case 2:
                case 3:
                    System.out.printf("这是-10~-39之间的一个数字");
            }//这里我就弄到这里了，主要还是为了体现出这些语句的操作，并没有严谨与全局的考虑
            if (c <= -40) {
                System.out.printf("这是小于或者等于-40的数字");
            }
        } else {
            for (int i = 1; i <= c; i++) {//for循环语句，i++是一个后自增
                System.out.printf(i + "是好数字 ");
            }
            return;//return语句
        }
    }
    public static double Pi(){
        double result,item;
        int denominator,sign;
        result=0;
        denominator=1;
        sign=1;
        do{//使用了do...while循环语句
            item=(double)sign/denominator;
            result+=item;
            sign=-sign;
            denominator+=2;
        }while(Math.abs((double)sign/denominator)>=1e-6);
        return  result;//终止成员方法的执行，返回到调用位置
    }
    public static void D(){
        int i;
        Scanner in = new Scanner(System.in);
        int d,e;
        System.out.printf( "Enter d,e:");
        d=in.nextInt();
        e=in.nextInt();
        if(d<e){//关系运算符
            i=d;//赋值运算符
        }else{
            i=e;
        }
        while(d%i!=0||e%i!=0){//while语句的使用，逻辑运算符
            i--;//算术运算符，后自减
        }
        System.out.print(i);//输出最大公约数
        return;
    }
}