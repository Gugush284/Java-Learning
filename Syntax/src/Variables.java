package src;

public class Variables {
    public static void main(String[] args) {
        int var = 10000;

        int years = var / 365;
        System.out.println(years);

        int month = (var % 365) / 30;
        System.out.println(month);

        int days = (var % 365) % 30;
        System.out.println(days);
    }
}
