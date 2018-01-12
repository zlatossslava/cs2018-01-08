package by.it.SemenovaO.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой:
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74
*/
class TaskC2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;

        String bin1 = Integer.toBinaryString(a);
        String bin2 = Integer.toBinaryString(b);
        String sum_bin = Integer.toBinaryString(sum);

        String hex1 = Integer.toHexString(a);
        String hex2 = Integer.toHexString(b);
        String sum_hex = Integer.toHexString(sum);

        String oct1=Integer.toOctalString(a);
        String oct2=Integer.toOctalString(b);
        String sum_oct=Integer.toOctalString(sum);

        System.out.println("DEC:"+a+"+"+b+"="+sum);
        System.out.println("BIN:"+bin1+"+"+bin2+"="+sum_bin);
        System.out.println("HEX:"+hex1+"+"+hex2+"="+sum_hex);
        System.out.println("OCT:"+oct1+"+"+oct2+"="+sum_oct);
    }

}
