package by.it.diatchik.lesson02;

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
        Scanner sc=new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int E = x + y;
        System.out.println("Sum = " + E);
    }
}
