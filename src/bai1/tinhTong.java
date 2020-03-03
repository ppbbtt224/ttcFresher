package bai1;

import java.util.Scanner;

public class tinhTong {
    public static void main(String[] args) {
        int n;
        int S=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap n: ");
        n = scanner.nextInt();
        for (int i=0; i<=n; i++){
            S+=i;
        }
        System.out.println("Tong = "+S);
    }
}
