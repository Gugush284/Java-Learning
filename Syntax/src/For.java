package src;

public class For {
    public static void main(String[] args) {
        String[] names = {
            "Helen",
            "Alex",
            "Max"
        };

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println();

        for (String name : names){
            System.out.println(name);
        }
    }
}
