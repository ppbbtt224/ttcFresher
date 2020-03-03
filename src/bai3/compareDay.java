package bai3;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class compareDay {
    public static void main(String[] args) throws Exception{
        String dateA;
        System.out.println("Nhap ngay a: ");
        Scanner scanner = new Scanner(System.in);
        dateA = scanner.nextLine();
        System.out.println("Nhap ngay b: ");
        String dateB = scanner.nextLine();
        SimpleDateFormat dateFormatA = new SimpleDateFormat("dd/MM/yyyy");
        Date dA = dateFormatA.parse(dateA);
        SimpleDateFormat dateFormatB = new SimpleDateFormat("dd/MM/yyyy");
        Date dB = dateFormatB.parse(dateB);
        Calendar cal = Calendar.getInstance();
        if ((dateA.compareTo(dateB))<0)
            System.out.println("Ngay A truoc ngay B");
            else if((dateA.compareTo(dateB))>0)
                System.out.println("Ngay A sau ngay B");
                else System.out.println("Hai ngay trung nhau!");
    }
}
