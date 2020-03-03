package bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class listsort {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        for (int i = 1; i<=5; i++){
            System.out.println("Nhap phan tu thu " + i +" :");
            Scanner scanner = new Scanner(System.in);
            ints.add(scanner.nextInt());
        }
        Collections.sort(ints);
        System.out.println(ints);
    }
}
