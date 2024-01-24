package BaiThucHanhJava;

import java.util.Scanner;

public class Slide30 {
    public static void main(String[] args){
        Scanner dc = new Scanner(System.in);
        int a,b,sum = 0;
        System.out.print("Nhap vao 1 so nguyen duong: ");
        a = dc.nextInt();
        if (a <=0 ) {
            System.out.println("So vua nhap khong thoa man dieu kien");
        }
        else{
            while (a > 0) {
                a = a/10;
                b = a%10;
                sum += b;
            }
            System.out.printf("Tong cua cac chu so vua nhap la: %d",sum);
        }
    }
}
