package LAB2;
import java.util.Scanner;
public class Bai1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x,y,tong,hieu,tich,thuong,du;
        System.out.print("He so thu 1: ");
        x = sc.nextDouble();
        System.out.print("He so thu 2: ");
        y = sc.nextDouble();
        tong = x + y;
        hieu = x - y;
        tich = x * y;
        thuong = x / y;
        du = x % y;
        System.out.printf("tong: %f",tong);
        System.out.println();
        System.out.printf("hieu: %f",hieu);
        System.out.println();
        System.out.printf("tich: %f",tich);
        System.out.println();
        System.out.printf("thuong: %f",thuong);
        System.out.println();
        System.out.printf("du: %f",du);
        System.out.println();
        if(x==y){
            System.out.println("2 so bang nhau");
        }
        else if(x<y){
            System.out.println("he so thu 1 be hon he so thu 2");
        }
        else {
            System.out.println("he so thu 1 lon hon he so thu 2");
        }
    }
}