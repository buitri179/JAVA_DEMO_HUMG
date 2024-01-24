package BaiThucHanhJava;

import java.util.Scanner;

public class Silde55 {
    public static void main(String[] args) {
        Scanner nu = new Scanner(System.in);
        int a;
        for( a=0; a<=20 ; a++ ){
            if( a%5 == 0 ){
                System.out.printf("\n%d",a);
            }
            else{
                continue;
            }
        }
    }
}
