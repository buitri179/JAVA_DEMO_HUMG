package BaiThucHanhJava;

import java.util.Scanner;

public class Slide47 {
    public static void main(String[] args) {
        Scanner nb = new Scanner(System.in);
        int a, sum = 0;
        while (sum <= 100) {
            System.out.println("Nhap vao 1 so: ");
            a = nb.nextInt();
            sum += a;
        }
        System.out.printf("Tong cua cac so vua nhap la: %d",sum);
    }
}
