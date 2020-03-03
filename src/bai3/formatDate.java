package bai3;

import java.text.SimpleDateFormat;
import java.util.Date;

public class formatDate {
    public static void main(String[] args) {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        String strDate = format.format(date);
        System.out.println(strDate);
    }
}
