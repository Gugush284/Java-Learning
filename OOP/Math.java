package OOP;

public class Math {
    static int multiple(int a, int b){ // static - не надо создавать объект
        return a * b;
    }

    static double multiple(double a, double b){ // перегрузка работает только тогда, когда отличаются типы аргументов или количество
        return a * b;
    }
}
