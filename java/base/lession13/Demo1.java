package lession13;

/**
 * 大屎蛋教程网-dashidan.com
 *
 * 教程: 13.Java运算符优先级
 */
public class Demo1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = a + b * c;
        /** 乘号的优先级比加号高, 先算b*c再加a,故d为7*/
        System.out.println(d);
        /** 加减乘除混合*/
        a = 1;
        b = 2;
        c = 3;
        d = 4;
        d = a + b * c / d - 5;
        /** 乘号和除号的优先级比加号高, 先算乘除, 从左往右, b*c得6,d(值为4),`6/4`得`1.5`.取模运算省去小数,`b*c/d`得1*/
        /** 加减法从左往右计算,a+1-5得-3,赋值给d.故d为-3.*/
        System.out.println(d);
    }
}
