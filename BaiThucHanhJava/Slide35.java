package BaiThucHanhJava;

import java.util.Scanner;

public class Slide35 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        double a,b;
        System.out.print("Nhap vao so thu 1: ");
        a = obj.nextDouble();
        System.out.print("Nhap vao so thu 2: ");
        b = obj.nextDouble();
        if (a>b) {
            System.out.printf("So nho nhat trong 2 so la: %f",b);
        }
        else{
            System.out.printf("So nho nhat trong 2 so la: %f",a);
        }
    }
}
