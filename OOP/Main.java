package OOP;

public class Main {
    public static void main(String[] args) {
        Box my_box = new Box(10, 10, 10); // new говорит, что это ссылочный тип
        Box second_box = new Box();

        my_box.showVolume();
        second_box.showVolume();
    }
}
