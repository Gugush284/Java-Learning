package OOP;

public class Box {
    double length;
    double width;
    double height;

    Box(){
        this(10);
    }

    Box(double size){
        this(size, size, size);
    }

    Box(double length, double width, double height){
        this.length = length;
        this.width = width;
        this.height = height;
    }

    double getVolume(){
        return length * width * height;
    }

    void showVolume(){
        System.out.println(this.getVolume());
    }
}
