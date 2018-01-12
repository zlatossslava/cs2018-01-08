package by.it.sgolovach.lesson02;

import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод:
34 26

Вывод:
Sum = 26
*/
class TaskC1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println("Ввод:");
        System.out.println(a + " " + b);
        int c = a + b;
        System.out.println();
        System.out.println("Вывод:");
        System.out.println("Sum" + " " + "=" + " " + c);

    }


}
