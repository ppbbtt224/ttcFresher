package bai2;

import java.util.Scanner;

public class charAppear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String str = scanner.next();
        int [] tansuat = new int[255];
        int i=0, max, l;
        int ascii;
        l = str.length();
        for (i = 0; i<255; i++){
            tansuat[i] = 0;
        }
        i = 0;
        while (i<l){
            ascii = (int)str.charAt(i);
            tansuat[ascii] += 1;
            i++;
        }
        max = 0;
        for (i=0; i<255; i++){
            if (i!=32){
                if (tansuat[i] > tansuat[max]) max = i;
            }
        }
        System.out.println("Ky tu xuat hien nhieu nhat: "+(char)max);
    }
}
