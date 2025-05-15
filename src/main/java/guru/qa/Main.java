package guru.qa;

public class Main {
    public static void main(String[] args) {
        //0) применить несколько арифметических операций ( + , -, * , /) над двумя примитивами типа int
        int a = 11;
        int b = 5;

        int sum = a + b;
        System.out.println("Сумма: " + sum);
        int differ = a - b;
        System.out.println("Разность: " + differ);
        int product = a * b;
        System.out.println("Произведение: " + product);
        int quotient = a / b;
        System.out.println("Частное: " + quotient);
        int remainder = a % b;
        System.out.println("Остаток от деления: " + remainder);

        // 1) применить несколько арифметических операций над int и double в одном выражении
        double с = 5.5;

        double doubleAndIntResult = (a + с) * 2 - (a / с);
        System.out.println("Результат: " + doubleAndIntResult);

        //2) применить несколько логических операций ( < , >, >=, <= )
        boolean isLessThanB = a < b;
        System.out.println("a < b: " + isLessThanB);
        boolean isGreaterThanB = a > b;
        System.out.println("a > b: " + isGreaterThanB);
        boolean isEqualOrGreater = a >= 10;
        System.out.println("a >= 10: " + isEqualOrGreater);
        boolean isBEqualOrLess = b <= 7.5;
        System.out.println("b <= 7.5: " + isBEqualOrLess);

        //3-4) прочитать и получить переполнение при арифметической операции
        byte min = Byte.MIN_VALUE;  // -128
        System.out.println("Минимальное значение: " + min);
        byte underflow = (byte) (min - 1);
        System.out.println("Переполнение в минус для byte: " + underflow);
    }
}