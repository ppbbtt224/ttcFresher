package bai3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class countDay {
    public static void main(String[] args) throws IOException {
        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String dateA, dateB;
        System.out.println("Nhap ngay a: ");
        Scanner scanner = new Scanner(System.in);
        dateA = scanner.nextLine();
        System.out.println("Nhap ngay b: ");
        Scanner scanner2 = new Scanner(System.in);
        dateB = scanner2.nextLine();
        final LocalDate firstDate = LocalDate.parse(dateA, formatter);
        final LocalDate secondDate = LocalDate.parse(dateB, formatter);
        final long days = ChronoUnit.DAYS.between(firstDate, secondDate);
        System.out.println("So ngay: " + days);
    }
}