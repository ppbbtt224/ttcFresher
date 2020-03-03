package bai2;

public class stringReplace {
    public static void main(String[] args) {
        String stringRaw = "i am fresher";
        String stringFrom = "fresher";
        String stringTo = "senior";
        String result = stringRaw.replace(stringFrom, stringTo);
        System.out.println(result);

    }
}
