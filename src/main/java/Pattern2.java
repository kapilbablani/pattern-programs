package main.java;

public class Pattern2 {
    public static void main(String[] args) {
        int input = 5;
        for(int i=input;i>=1;i--) {
            for(int j=i;j>=1;j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//        *****
//        ****
//        ***
//        **
//        *

