package Step1_basics.Lec_1;

import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the values =");
    int n =scan.nextInt(),m=scan.nextInt();
    if (n < m) {
        System.out.println("lesser");;
    } else if (n == m) {
        System.out.println("equal");;
    } else {
        System.out.println("greater");;
    }
        }
}
