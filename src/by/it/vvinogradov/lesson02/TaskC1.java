package by.it.vvinogradov.lesson02;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и выводит их сумму на экран в виде

Ввод:
34 26

Вывод:
Sum = 26
*/
import java.util.Scanner;
class TaskC1 {
    public static void main(String[] args) {
System.out.println("Ввод: ");
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int k=a+b;
System.out.println("Вывод: ");
System.out.println("Sum = " + k);
    }




}
