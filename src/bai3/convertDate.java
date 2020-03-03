package bai3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class convertDate {
    public static void main(String[] args) throws Exception {
        String strTime = "2008/01/20 10:20:50";
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
        Date d = dateFormat.parse(strTime);
        System.out.println(d);
        Calendar cal = Calendar.getInstance();
        cal.set(2008, Calendar.JANUARY, 20, 10,20,50);
        int ngayDauThang = cal.getActualMinimum(Calendar.DAY_OF_MONTH);
        System.out.println("Ngày đầu của tháng: " + ngayDauThang);
        int ngayCuoiThang = cal.getMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("Ngày cuối của tháng: " + ngayCuoiThang);
        cal.add(Calendar.DAY_OF_MONTH, 100);
        System.out.println("100 ngay sau: " +cal.getTime());
    }
}
