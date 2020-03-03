package bai2;

import java.util.StringJoiner;

public class stringDelimiter {
    public static void main(String[] args) {
        StringJoiner stringJoiner = new StringJoiner(",");
        stringJoiner.add("Intern");
        stringJoiner.add("Android");
        stringJoiner.add("TTC");
        System.out.println(stringJoiner.toString());

        //tach chuoi tren:
        String[] arStr = stringJoiner.toString().split("\\,");
        for (String item : arStr) {
            System.out.println(item);
        }
    }
}