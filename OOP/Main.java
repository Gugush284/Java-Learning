package OOP;

public class Main {
    public static void main(String[] args) {
        boxOperation();

        mathOperation();
    }

    static void boxOperation(){
        Box my_box = new Box(10, 10, 10); // new говорит, что это ссылочный тип
        Box second_box = new Box();
        Box third_box = new Box(10);

        my_box.showVolume();
        second_box.showVolume();
        third_box.showVolume();
    }

    static void mathOperation(){
        System.out.println(Math.multiple(10, 5));
        System.out.println(Math.multiple(10.8, 5.8));
        System.out.println(java.lang.Math.sqrt(4));
    }
}
