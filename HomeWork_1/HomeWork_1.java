package HomeWork_1;

import java.util.Scanner;

// # Домашнее задание Семинар 1
// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), n!(произведение чисел от 1 до n)
class Homework_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //
        int n = sc.nextInt();
        int s = 0;
        for (int i = 0; i <= n; i++) {
            s += i;
        }
        System.out.printf("число %d Сумма %d%n", n, s);
    }
}