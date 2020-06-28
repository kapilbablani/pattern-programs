package main.java;

public class Pattern4 {
    public static void main(String[] args) {
        int input=5;
        for(int i=0;i<input;i++) {
            for(int j=1;j<=input-i;j++) {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

//          *
//         **
//        ***
//       ****
//      *****
