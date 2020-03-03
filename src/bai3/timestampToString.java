package bai3;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class timestampToString {
    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Timestamp ts = new Timestamp(System.currentTimeMillis());
        Date date = new Date(ts.getTime());
        System.out.println("Date: "+dateFormat.format(date));
    }
}
