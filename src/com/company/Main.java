package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        //task4();
        //task5();
    }
    private static void task5() {
        Scanner in = new Scanner(System.in);
        int a,b,h=0;
        System.out.println("Введите a:");
        a  = in.nextInt();
        System.out.println("Введите b:");
        b = in.nextInt();
        System.out.println("Введите шаг h:");
        h = in.nextInt();
        System.out.println("---------------------");
        System.out.println("F(x)=tg(x)");
        for(int i=a; i<=b; i+=h)
        {
            System.out.println(i+"  "+(Math.tan(i)));
        }
        System.out.println("---------------------");
        System.out.println("F(x)=ctg(x)+1");
        for(int i=a; i<=b; i+=h)
        {
            System.out.println(i+"  "+(-(1/(Math.sin(i)*Math.sin(i)))+1));
        }
    }

    private static void task1() {
        long b=0;
        long a=12345679;
        for(int i=9; i<=81; i+=9)
        {
            b=a*i;
            System.out.println(b);

        }
    }

    private static void task2() {
        long result=0;
        for(int i=0; i<=10; i++)
        {
            result=(long)7*i;
            System.out.println(7+"*"+i+"="+result);

        }
    }

    private static void task3() {
        double result=0;
        for(int i=2; i<=20; i++)
        {
          result=Math.sin(i);
          System.out.println("sin("+i+")="+result);

        }
    }

    private static void task4() {
        int x=3;
        double result =0;
        for(int i=1; i<=3; i+=2)
        {
            int factor=1;
            for  (int ii=1; ii<=i; ii++)
            { factor=factor*ii; }
            result=result+Math.pow(x,i)/(factor);
        }
        System.out.println(result);
    }
}
