package bai3;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class stringToTimestamp {
    public static void main(String[] args) throws Exception{
        String inputDate;
        System.out.println("Nhap ngay: ");
        Scanner scanner = new Scanner(System.in);
        inputDate = scanner.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = dateFormat.parse(inputDate);

        Timestamp ts = new Timestamp(date.getTime());

        System.out.println("Timestamp: "+ dateFormat.format(ts));

    }
}
