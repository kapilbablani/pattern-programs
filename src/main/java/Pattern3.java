package main.java;

public class Pattern3 {
    public static void main(String[] args) {
        int input = 5;
        for(int i=1;i<=input;i++) {
            for(int j=1;j<=input;j++) {
                if(i+j > input)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
//             *
//            **
//           ***
//          ****
//         *****