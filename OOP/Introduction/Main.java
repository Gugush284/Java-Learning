package OOP.Introduction;

public class Main {
    public static void main(String[] args) {
        Box my_box = new Box(); // new говорит, что это ссылочный тип

        my_box.height = 10;
        my_box.length = 10;
        my_box.width = 10;

        my_box.showVolume();
    }
}
