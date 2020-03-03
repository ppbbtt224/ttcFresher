package bai3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class formatStringDate {
    public static void main(String[] args) throws Exception{
        String inputString = "2003/02/22 12:00:45";
        SimpleDateFormat fromUser = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        SimpleDateFormat myFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat myFormat1 = new SimpleDateFormat("MMM yyyy");
        SimpleDateFormat myFormat2 = new SimpleDateFormat("dd HH:mm:ss");

        try{
            String rfs = myFormat.format(fromUser.parse(inputString));
            System.out.println(rfs);
            String rfs1 = myFormat1.format(fromUser.parse(inputString));
            System.out.println(rfs1);
            String rfs2 = myFormat2.format(fromUser.parse(inputString));
            System.out.println(rfs2);
        } catch (ParseException e){
            e.printStackTrace();
        }
    }
}
