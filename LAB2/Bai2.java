package LAB2;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args){
        Scanner cs = new Scanner(System.in);
        double heso1, heso2;
        System.out.print("he so 1: ");
        heso1 = cs.nextDouble();
        System.out.print("he so 2: ");
        heso2 = cs.nextDouble();
        if( heso1 % 2 == 0 && heso2 % 2 == 0 ){
            System.out.println("he so 1 va he so 2 deu la so chan");
        }
        else if( heso1 % 2 != 0 && heso2 % 2 != 0){
            System.out.println("he so 1 va he so 2 deu la so le");
        }
        else if( heso1 % 2 != 0 && heso2 % 2 == 0){
            System.out.println("he so 1 la so le con he so 2 la so chan");
        }
        else{
            System.out.println("he so 1 la so chan con he so 2 la so le");
        }

    }
}
